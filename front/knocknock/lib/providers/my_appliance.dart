import 'package:flutter/material.dart';
import 'package:knocknock/models/my_appliance_model.dart';

class RegisterAppliance with ChangeNotifier {
  MyModelRegistering? _myModel;
  MyModelRegistering? get myModel => _myModel;

  String _nickname = '';
  String get nickname => _nickname;

  int _qtt = 0;
  int get qtt => _qtt;

  void register(MyModelRegistering? myModel) {
    _myModel = myModel;
    notifyListeners();
  }

  void resetMyModel() {
    _myModel = null;
    notifyListeners();
  }

  void registerNickname(String nickname) {
    _nickname = nickname;
    notifyListeners();
  }

  void setQtt(int qtt) {
    _qtt = qtt;
  }

  @override
  void dispose() {
    // 여기에 리소스 정리 코드 추가
    _myModel = null; // _myModel이나 다른 리소스를 해제하는 코드 추가
    super.dispose();
  }
}
