import 'package:flutter/material.dart';
import 'package:knocknock/common/custom_icon_icons.dart';
import 'package:knocknock/components/buttons.dart';
import 'package:knocknock/interceptors/interceptor.dart';
import 'package:knocknock/providers/airInfo.dart';
import 'package:knocknock/screens/manage_appliances.dart';
import 'package:knocknock/screens/view_greenproducts.dart';
import 'package:knocknock/services/outer_service.dart' hide storage;
import 'package:knocknock/services/user_service.dart' hide storage;
import 'package:knocknock/widgets/cai_info.dart';
import 'package:provider/provider.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:video_player/video_player.dart';
import 'package:flutter_inner_shadow/flutter_inner_shadow.dart';

class MainPage extends StatefulWidget {
  const MainPage({super.key});

  @override
  State<MainPage> createState() => _MainPageState();
}

class _MainPageState extends State<MainPage> {
  final UserService userService = UserService();
  final OuterService outerService = OuterService();
  final keywordController = TextEditingController();
  String address1 = '';
  String address2 = '';
  Map<String, dynamic> airInfo = {};
  VideoPlayerController? _controller;
  String imagePath = 'assets/images/good.png';
  String videoPath = 'assets/videos/goodBackground.mp4';

  @override
  void initState() {
    super.initState();
    initializeAddresses();
    // 프레임이 렌더링된 후에 Provider의 상태를 검사

    final airInfoProvider =
        Provider.of<AirInfoProvider>(context, listen: false);
    if (airInfoProvider.airInfoProvider == 5) {
      initialAirInfo();
    } else {
      updateImagePathAndVideo(airInfoProvider.airInfoProvider);
    }
    // _controller = VideoPlayerController.asset(videoPath)
    //   ..initialize().then((_) {
    //     setState(() {
    //       _controller!.play();
    //       _controller!.setLooping(true);
    //     });
    //   });
  }

  void updateImagePathAndVideo(int airQualityIndex) {
    String newImagePath, newVideoPath;
    switch (airQualityIndex) {
      case 1:
        newImagePath = 'assets/images/good.png';
        newVideoPath = 'assets/videos/goodBackground.mp4';
        break;
      case 2:
        newImagePath = 'assets/images/soso.png';
        newVideoPath = 'assets/videos/sosoBackground.mp4';
        break;
      case 3:
        newImagePath = 'assets/images/bad.png';
        newVideoPath = 'assets/videos/badBackground.mp4';
        break;
      case 4:
        newImagePath = 'assets/images/verybad.png';
        newVideoPath = 'assets/videos/verybadBackground.mp4';
        break;
      default:
        return; // 기본값이 없는 경우, 아무 작업도 수행하지 않음
    }
    setState(() {
      imagePath = newImagePath;
      updateVideo(newVideoPath);
    });
  }

  void updateVideo(String newVideoPath) {
    if (mounted) {
      _controller?.dispose(); // 기존 컨트롤러 해제
      _controller = VideoPlayerController.asset(newVideoPath)
        ..initialize().then((_) {
          setState(() {
            _controller!.play();
            _controller!.setLooping(true);
          });
        });
    }
  }

  void initialAirInfo() async {
    try {
      airInfo = await outerService.airInfo();
      if (!mounted) return; // 위젯이 위젯 트리에 없으면 함수 실행 중지

      final infoNum = airInfo['통합대기환경지수'];

      context.read<AirInfoProvider>().setAirInfo(int.parse(infoNum));

      updateImagePathAndVideo(int.parse(infoNum)); // 여기에 함수 호출 추가
    } catch (e) {
      print("에러 입니다.에러 입니다.$e");
    }
  }

  void initializeAddresses() async {
    final fullAddress = await storage.read(key: "address");
    final addressParts = fullAddress!.split(' ');
    if (addressParts.length >= 2) {
      setState(() {
        address1 = addressParts[0];
        address2 = addressParts[1];
      });
    }
  }

  void onManagementButtonTap() {
    if (!mounted) return;
    Navigator.pushReplacement(context,
        MaterialPageRoute(builder: (context) => const ManageAppliances()));
  }

  Future onSerchButtonTap() async {
    final response = await userService.checkGreenLabel(keywordController.text);
    if (!mounted) return;
    Navigator.of(context).push(
      MaterialPageRoute(
        builder: (context) =>
            ViewGreenProducts(info: response, keyword: keywordController.text),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      resizeToAvoidBottomInset: false,
      body: Stack(
        children: [
          Positioned(
            // top: 0,
            // left: 0,
            // right: 0,
            // bottom: 1,
            child: _controller != null && _controller!.value.isInitialized
                ? SizedBox.expand(
                    child: FittedBox(
                      fit: BoxFit.none,
                      child: SizedBox(
                        width: _controller!.value.size.width,
                        height: _controller!.value.size.height,
                        child: VideoPlayer(_controller!),
                      ),
                    ),
                  )
                : Container(),
          ),
          Positioned.fill(
            child: Container(
              color: Theme.of(context).colorScheme.background.withOpacity(0.35),
            ),
          ),
          SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min, // 이 부분을 추가해주세요.

              children: [
                Column(
                  children: [
                    Container(
                      height: MediaQuery.of(context).size.height * 0.15,
                      alignment: Alignment.bottomCenter,
                      child: Text(
                        '$address2의 공기질',
                        style: TextStyle(
                          fontSize: 27,
                          fontWeight: FontWeight.w600,
                          color: Theme.of(context)
                              .colorScheme
                              .onBackground
                              .withOpacity(0.95),
                        ),
                      ),
                    ),
                    Container(
                      // height: MediaQuery.of(context).size.height * 0.2,
                      alignment: Alignment.topCenter,
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        crossAxisAlignment: CrossAxisAlignment.center,
                        children: [
                          Text(
                            '통합대기환경지수(CAI, Comprehensive air-quality index)',
                            style: TextStyle(
                              fontSize: 12,
                              color: Theme.of(context).colorScheme.outline,
                            ),
                          ),
                          IconButton(
                              onPressed: () {
                                showDialog(
                                  context: context,
                                  builder: (BuildContext dialogContext) {
                                    return StatefulBuilder(builder:
                                        (BuildContext context,
                                            StateSetter setState) {
                                      return const CAI();
                                    });
                                  },
                                );
                              },
                              icon: Icon(
                                CustomIcon.info,
                                color: Theme.of(context).colorScheme.outline,
                                size: 15,
                              )),
                        ],
                      ),
                    ),
                    // Image.asset(imagePath),
                    Container(
                      margin: const EdgeInsets.symmetric(vertical: 10),
                      width: 150,
                      height: 150,
                      decoration: BoxDecoration(
                        image: DecorationImage(
                          image: AssetImage(imagePath),
                        ),
                      ),
                    ),
                    const Divider(
                      thickness: 1.2,
                      indent: 50,
                      endIndent: 50,
                    ),
                  ],
                ),
                SizedBox(
                  height: MediaQuery.of(context).size.height * 0.3,
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [
                      Text(
                        '녹색 제품 검색',
                        style: TextStyle(
                          fontSize: 27,
                          fontWeight: FontWeight.w600,
                          color: Theme.of(context)
                              .colorScheme
                              .onBackground
                              .withOpacity(0.95),
                        ),
                        textAlign: TextAlign.center,
                      ),
                      Container(
                        padding: const EdgeInsets.symmetric(
                          horizontal: 60,
                        ),
                        child: TextFormField(
                          controller: keywordController,
                          decoration: InputDecoration(
                            contentPadding: const EdgeInsets.symmetric(
                                vertical: 10, horizontal: 20),
                            isDense: true,
                            hintText: '검색어를 입력하세요',
                            hintStyle: const TextStyle(
                              fontWeight: FontWeight.w300,
                            ),
                            suffixIcon: IconButton(
                              onPressed: onSerchButtonTap,
                              icon: const Icon(Icons.search),
                            ),
                            filled: true,
                            fillColor:
                                Theme.of(context).colorScheme.surfaceVariant,
                            focusedBorder: OutlineInputBorder(
                              borderSide: BorderSide(
                                  color: Theme.of(context).colorScheme.primary),
                              borderRadius: BorderRadius.circular(30),
                            ),
                            enabledBorder: OutlineInputBorder(
                              borderSide:
                                  const BorderSide(color: Colors.transparent),
                              borderRadius: BorderRadius.circular(30),
                            ),
                          ),
                          validator: (String? value) {
                            return (value == null) ? '값을 입력하세요' : null;
                          },
                        ),
                      ),
                      const Divider(
                        thickness: 1.2,
                        indent: 50,
                        endIndent: 50,
                      ),
                    ],
                  ),
                ),
                SizedBox(
                  height: MediaQuery.of(context).size.height * 0.2,
                  child: Center(
                    child: KnockButton(
                      onPressed: () async {
                        final Uri url = Uri.parse(
                            'https://eep.energy.or.kr/business_introduction/effi_summary.aspx');
                        await launchUrl(url);
                      },
                      bColor: Theme.of(context).colorScheme.secondaryContainer,
                      fColor:
                          Theme.of(context).colorScheme.onSecondaryContainer,
                      width: MediaQuery.of(context).size.width * 0.8, // 버튼의 너비
                      height:
                          MediaQuery.of(context).size.width * 0.16, // 버튼의 높이
                      label: "효율등급제도 자세히 알기 🔗", // 버튼에 표시할 텍스트
                    ),
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  @override
  void dispose() {
    _controller?.dispose();
    super.dispose();
  }
}
