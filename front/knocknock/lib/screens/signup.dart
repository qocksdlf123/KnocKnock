import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:knocknock/screens/login.dart';
import 'package:remedi_kopo/remedi_kopo.dart';

class Signup extends StatefulWidget {
  const Signup({super.key});

  @override
  State<Signup> createState() => _SignupState();
}

TextEditingController emailController = TextEditingController();
TextEditingController verificationController = TextEditingController();
TextEditingController passwordController = TextEditingController();
TextEditingController passwordConfirmController = TextEditingController();
TextEditingController nicknameController = TextEditingController();
TextEditingController addressController = TextEditingController();
final _formKey = GlobalKey<FormState>();
Map<String, String> formData = {};
final emailRegex = RegExp(
    r"^[a-zA-Z0-9.a-zA-Z0-9.!#$%&'*+-/=?^_`{|}~]+@[a-zA-Z0-9]+\.[a-zA-Z]+");

void searchAddress(BuildContext context) async {
  KopoModel? model = await Navigator.push(
    context,
    CupertinoPageRoute(
      builder: (context) => RemediKopo(),
    ),
  );

  if (model != null) {
    final address = model.address ?? '';
    addressController.value = TextEditingValue(
      text: address,
    );
    formData['address'] = address;
  }
}

class _SignupState extends State<Signup> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      resizeToAvoidBottomInset: true,
      body: SingleChildScrollView(
        scrollDirection: Axis.vertical,
        child: Column(
          children: [
            Container(
              height: MediaQuery.of(context).size.height * 0.05,
            ),
            Container(
              height: MediaQuery.of(context).size.height * 0.2,
              alignment: Alignment.center,
              child: const Text(
                '회원가입',
                style: TextStyle(
                  fontSize: 40,
                  fontWeight: FontWeight.w600,
                ),
              ),
            ),
            Container(
              height: MediaQuery.of(context).size.height * 0.75,
              width: 300,
              alignment: Alignment.topCenter,
              child: Form(
                key: _formKey,
                child: Column(
                  children: [
                    Stack(
                      alignment: Alignment.centerRight,
                      children: [
                        TextFormField(
                          controller: emailController,
                          validator: (value) {
                            if (value == null || value.isEmpty) {
                              return '이메일을 입력하세요.';
                            } else if (!emailRegex.hasMatch(value)) {
                              return '유효한 이메일을 입력하세요.';
                            }
                            return null;
                          },
                          decoration: InputDecoration(
                            hintText: "유효한 이메일을 입력해주세요",
                            focusedBorder: OutlineInputBorder(
                              borderSide: const BorderSide(color: Colors.green),
                              borderRadius: BorderRadius.circular(15.0),
                            ),
                            border: OutlineInputBorder(
                              borderSide: BorderSide.none,
                              borderRadius: BorderRadius.circular(15.0),
                            ),
                            contentPadding: const EdgeInsets.symmetric(
                                vertical: 20, horizontal: 15),
                            labelText: '이메일',
                            fillColor: Colors.grey[200],
                            filled: true,
                          ),
                        ),
                        TextButton(
                          onPressed: () {},
                          child: const Text('인증'),
                        ),
                      ],
                    ),
                    const SizedBox(height: 15),
                    TextFormField(
                      controller: passwordController,
                      obscureText: true, // 비밀번호 숨기기 옵션
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return '비밀번호를 입력하세요.';
                        } else if (value.length < 8 || value.length > 16) {
                          return '비밀번호는 8~16자리 사이여야 합니다.';
                        }
                        return null;
                      },
                      decoration: InputDecoration(
                        hintText: "8~16자리 사이로 입력해주세요",
                        focusedBorder: OutlineInputBorder(
                          borderSide: const BorderSide(color: Colors.green),
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        border: OutlineInputBorder(
                          borderSide: BorderSide.none,
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        contentPadding: const EdgeInsets.symmetric(
                            vertical: 20, horizontal: 15),
                        labelText: '비밀번호',
                        fillColor: Colors.grey[200],
                        filled: true,
                      ),
                    ),
                    const SizedBox(height: 15),
                    TextFormField(
                      controller: passwordConfirmController,
                      obscureText: true,
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return '비밀번호를 입력해주세요.';
                        } else if (value != passwordController.text) {
                          return '비밀번호가 일치하지 않습니다.';
                        }
                        return null;
                      },
                      decoration: InputDecoration(
                        hintText: "비밀번호를 확인해주세요",
                        focusedBorder: OutlineInputBorder(
                          borderSide: const BorderSide(color: Colors.green),
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        border: OutlineInputBorder(
                          borderSide: BorderSide.none,
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        contentPadding: const EdgeInsets.symmetric(
                            vertical: 20, horizontal: 15),
                        labelText: '비밀번호 확인',
                        fillColor: Colors.grey[200],
                        filled: true,
                      ),
                    ),
                    const SizedBox(height: 15),
                    TextFormField(
                      controller: nicknameController,
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return '닉네임을 입력해주세요.';
                        } else if (value.length < 2 || value.length > 8) {
                          return '닉네임은 2~5자리 사이여야 합니다.';
                        }
                        return null;
                      },
                      decoration: InputDecoration(
                        hintText: "2~5자리 사이로 입력해주세요",
                        focusedBorder: OutlineInputBorder(
                          borderSide: const BorderSide(color: Colors.green),
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        border: OutlineInputBorder(
                          borderSide: BorderSide.none,
                          borderRadius: BorderRadius.circular(15.0),
                        ),
                        contentPadding: const EdgeInsets.symmetric(
                            vertical: 20, horizontal: 15),
                        labelText: '닉네임',
                        fillColor: Colors.grey[200],
                        filled: true,
                      ),
                    ),
                    const SizedBox(
                      height: 15,
                    ),
                    Stack(
                      alignment: Alignment.centerRight,
                      children: [
                        TextFormField(
                          controller: addressController,
                          validator: (value) {
                            if (value == null || value.isEmpty) {
                              return '주소를 입력하세요';
                            }
                            return null;
                          },
                          decoration: InputDecoration(
                            hintText: "도로명 주소를 입력해주세요",
                            focusedBorder: OutlineInputBorder(
                              borderSide: const BorderSide(color: Colors.green),
                              borderRadius: BorderRadius.circular(15.0),
                            ),
                            border: OutlineInputBorder(
                              borderSide: BorderSide.none,
                              borderRadius: BorderRadius.circular(15.0),
                            ),
                            contentPadding: const EdgeInsets.symmetric(
                                vertical: 20, horizontal: 15),
                            labelText: '주소',
                            fillColor: Colors.grey[200],
                            filled: true,
                          ),
                        ),
                        TextButton(
                          onPressed: () {
                            searchAddress(context);
                          },
                          child: const Text('검색'),
                        ),
                      ],
                    ),
                    const SizedBox(height: 20),
                    GestureDetector(
                      child: Container(
                        alignment: Alignment.center,
                        width: 300,
                        height: 60,
                        decoration: BoxDecoration(
                          borderRadius: BorderRadius.circular(15),
                          color: Colors.green[900],
                          boxShadow: [
                            BoxShadow(
                              color: Colors.grey.withOpacity(0.6),
                              spreadRadius: 1,
                              blurRadius: 5,
                              offset: const Offset(0, 5),
                            ),
                          ],
                        ),
                        child: const Text(
                          '회원가입',
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 20,
                          ),
                        ),
                      ),
                    ),
                    const SizedBox(height: 20),
                    const Row(
                      children: [
                        Expanded(
                          child: Divider(
                            thickness: 1,
                          ),
                        ),
                        Padding(
                          padding: EdgeInsets.symmetric(horizontal: 10),
                          child: Text('간편 회원가입'),
                        ),
                        Expanded(
                          child: Divider(
                            thickness: 1,
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(height: 20),
                    GestureDetector(
                      child: Container(
                        padding: const EdgeInsets.symmetric(
                            horizontal: 7, vertical: 12),
                        decoration: BoxDecoration(
                          color: Colors.grey[200],
                          borderRadius: BorderRadius.circular(15),
                          boxShadow: [
                            BoxShadow(
                              color: Colors.grey.withOpacity(0.6),
                              spreadRadius: 1,
                              blurRadius: 5,
                              offset: const Offset(0, 5),
                            ),
                          ],
                        ),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceAround,
                          children: [
                            Container(
                              width: 30,
                              height: 30,
                              decoration: const BoxDecoration(
                                image: DecorationImage(
                                  image: AssetImage('assets/images/google.png'),
                                ),
                              ),
                            ),
                            const Text(
                              'Google 이메일로 회원가입',
                              style: TextStyle(
                                  fontSize: 14, fontWeight: FontWeight.w400),
                            ),
                            const SizedBox(
                              width: 15,
                            ),
                          ],
                        ),
                      ),
                    ),
                    // const SizedBox(
                    //   height: 10,
                    // ),
                    // Row(
                    //   mainAxisAlignment: MainAxisAlignment.center,
                    //   children: [
                    //     const Text(
                    //       '이미 계정이 있으신가요?',
                    //       style: TextStyle(
                    //           color: Colors.grey, fontWeight: FontWeight.w600),
                    //     ),
                    //     TextButton(
                    //       onPressed: () {
                    //         Navigator.push(
                    //           context,
                    //           MaterialPageRoute(
                    //               builder: (context) => const Login()),
                    //         );
                    //       },
                    //       child: Text(
                    //         '로그인',
                    //         style: TextStyle(
                    //           color: Colors.green[900],
                    //           fontWeight: FontWeight.w600,
                    //         ),
                    //       ),
                    //     ),
                    //   ],
                    // ),
                  ],
                ),
              ),
            )
          ],
        ),
      ),
    );
  }
}