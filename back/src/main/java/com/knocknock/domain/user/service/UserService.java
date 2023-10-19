package com.knocknock.domain.user.service;

import com.knocknock.domain.user.dto.password.FindPasswordReqDto;
import com.knocknock.domain.user.dto.password.PasswordReqDto;
import com.knocknock.domain.user.dto.password.UpdatePasswordRepDto;
import com.knocknock.domain.user.dto.request.*;
import com.knocknock.domain.user.dto.response.AdminUserResDto;
import com.knocknock.domain.user.dto.response.LoginResDto;
import com.knocknock.domain.user.dto.response.ReissueTokenResDto;
import com.knocknock.domain.user.dto.response.UserResDto;
import com.knocknock.global.dto.MessageDto;

import java.util.List;

public interface UserService {

    MessageDto signUp(UserReqDto userReqDto); // 회원가입
    Boolean checkEmail(String email); // 이메일 중복검사
    void sendEmailCode(String email); // 이메일 인증코드 발신
    Boolean checkEmailCode(CheckEmailCodeReqDto checkEmailCodeReqDto); // 이메일 인증코드 유효 검사

    MessageDto addJiroCode(JiroCodeRepDto jiroCodeRepDto, String token); // 지로 코드 등록

    LoginResDto login(LoginReqDto loginReqDto);
    MessageDto logout(String email, String token);

    MessageDto findPassword(FindPasswordReqDto findPasswordReqDto, String token); // 비밀번호 찾아 이메일 전송하기
    Boolean checkPassword(PasswordReqDto passwordReqDto, String token);  // 서비스전 비밀번호 체크
    MessageDto updatePassword(UpdatePasswordRepDto updatePasswordRepDto, String token); // 비밀번호 변경


    MessageDto updateUser(UpdateUserReqDto updateUserReqDto, String token); // 내정보 수정
    MessageDto withdraw(Boolean checkPassword, String token); // 회원 탈퇴

    UserResDto findMyInfo(String token); // 내정보 조회

     ReissueTokenResDto reissueToken(String accessToken, String refreshToken);


     // 관리자
    MessageDto deleteUser(Long userId, String token); // 회원 강제탈퇴
    List<AdminUserResDto> findUserList(String token); // 회원 목록 조회
    AdminUserResDto findUser(Long userId, String token); // 회원 검색



}
