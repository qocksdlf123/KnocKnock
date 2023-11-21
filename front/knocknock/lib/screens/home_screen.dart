import 'package:camera/camera.dart';
import 'package:flutter/material.dart';
import 'package:knocknock/providers/page_index.dart';
import 'package:knocknock/screens/main_page.dart';
import 'package:knocknock/screens/my_appliance_list.dart';
import 'package:knocknock/screens/my_info_modify.dart';
import 'package:knocknock/screens/my_lists.dart';
import 'package:knocknock/screens/my_page.dart';
import 'package:knocknock/screens/new_appliance_categories.dart';
import 'package:knocknock/screens/take_picture_screen.dart';
import 'package:provider/provider.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int currentPageIndex = 0;
  late Future<void> _initCameraFuture;

  @override
  void initState() {
    super.initState();

    _initCameraFuture = loadCam(); // initState에서 카메라 로딩 시작
  }

  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
    currentPageIndex =
        context.watch<CurrentPageIndex>().currentPageIndexProvider;

    print(currentPageIndex);
  }

  NavigationDestinationLabelBehavior labelBehavior =
      NavigationDestinationLabelBehavior.alwaysShow;
  late CameraDescription firstCamera;
  // Future<void> loadCam() async {
  //   final cameras = await availableCameras();
  //   firstCamera = cameras.first;
  // }

  static List<CameraDescription> _cameras = [];
  Future<void> loadCam() async {
    // 이미 생성된 카메라 인스턴스가 있는지 확인
    if (_cameras.isEmpty) {
      // 카메라 인스턴스가 없다면 새로 로드
      _cameras = await availableCameras();
    }
    firstCamera = _cameras.first;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        bottomNavigationBar: NavigationBar(
          labelBehavior: labelBehavior,
          selectedIndex: currentPageIndex,
          onDestinationSelected: (int index) async {
            setState(() {
              context.read<CurrentPageIndex>().move(index);
              currentPageIndex = index;
            });
            if (index == 2) {
              await loadCam();
            }
            if (index == 3) {
              setState(() {});
            }
          },
          destinations: const <Widget>[
            NavigationDestination(icon: Icon(Icons.home), label: '홈'),
            NavigationDestination(
                icon: Icon(Icons.search_rounded), label: '가전 찾기'),
            NavigationDestination(icon: Icon(Icons.add), label: '가전 등록'),
            NavigationDestination(
                icon: Icon(Icons.local_laundry_service), label: '내 가전'),
            NavigationDestination(icon: Icon(Icons.menu), label: '서비스'),
          ],
        ),
        body: <Widget>[
          const MainPage(),
          const NewApplianceCategories(),
          FutureBuilder(
            future: _initCameraFuture,
            builder: (context, snapshot) {
              if (snapshot.connectionState == ConnectionState.done) {
                return TakePictureScreen(
                    camera: firstCamera); // firstCamera가 준비되었을 때만 접근
              } else {
                return const CircularProgressIndicator(); // 로딩 중 표시
              }
            },
          ),
          const MyLists(),
          const MyPage(),
        ][currentPageIndex]);
    // body: IndexedStack(
    //   index: currentPageIndex,
    //   children: <Widget>[
    //     const MainPage(),
    //     const NewApplianceCategories(),
    //     FutureBuilder<void>(
    //       future: _initCameraFuture,
    //       builder: (context, snapshot) {
    //         if (snapshot.connectionState == ConnectionState.done) {
    //           return TakePictureScreen(camera: firstCamera);
    //         } else {
    //           return const CircularProgressIndicator();
    //         }
    //       },
    //     ),
    //     const MyLists(),
    //     const MyPage(),
    //   ],
    // ),
    // );
  }

  @override
  void dispose() {
    super.dispose();
  }
}
