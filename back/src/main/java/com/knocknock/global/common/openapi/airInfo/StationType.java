package com.knocknock.global.common.openapi.airInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StationType {

    강남구("서울", "강남구", "서울특별시", "서울 강남구 학동로 426 강남구청 별관 1동"),
    강동구("서울", "강동구", "서울특별시", "서울 강동구 구천면로 42길 59 천호1동 주민센터"),
    강북구("서울", "강북구", "서울특별시", "서울 강북구 삼양로 139길 49 우이동 주민센터"),
    강서구("서울", "강서구", "서울특별시", "서울 강서구 강서로 45 다길 71 화곡3동 푸른들청소년도서관"),
    관악구("서울", "관악구", "서울특별시", "서울 관악구 신림동길 14 신림동 주민센터"),
    광진구("서울", "광진구", "서울특별시", "서울 광진구 광나루로 571 구의 아리수정수센터"),
    구로구("서울", "구로구", "서울특별시", "서울 구로구 가마산로 27길 45 구로고등학교"),
    금천구("서울", "금천구", "서울특별시", "서울 금천구 금하로21길 20 시흥5동 주민센터"),
    노원구("서울", "노원구", "서울특별시", "서울 노원구 상계로 118 상계2동 주민센터 (23길 17 노원구 원터행복발전소)"),
    도봉구("서울", "도봉구", "서울특별시", "서울 도봉구 시루봉로2길 34 쌍문동청소년문화의집"),
    동대문구("서울", "동대문구", "서울특별시", "서울 동대문구 천호대로13길 43 용두초등학교"),
    동작구("서울", "동작구", "서울특별시", "서울 동작구 사당로16아길 6 사당4동 주민센터"),
    마포구("서울", "마포구", "서울특별시", "서울 마포구 포은로 6길 10 망원1동주민센터 옥상"),
    서대문구("서울", "서대문구", "서울특별시", "서울 서대문구 세검정로4길 32(홍제3동 주민센터) "),
    서초구("서울", "서초구", "서울특별시", "서울 서초구 신반포로15길 16 반포 2동 주민센터"),
    성동구("서울", "성동구", "서울특별시", "서울 성동구 뚝섬로3길 18 성수1가1동주민센터"),
    성북구("서울", "성북구", "서울특별시", "서울 성북구 삼양로2길 70 길음2동 주민센터"),
    송파구("서울", "송파구", "서울특별시", "서울 송파구 백제고분로 236 삼전동 주민센터 (삼전동)"),
    양천구("서울", "양천구", "서울특별시", "서울 양천구 중앙로52길 56 신정4동 문화센터"),
    영등포구("서울", "영등포구", "서울특별시", "서울 영등포구 당산로 123 영등포구청 (당산동3가)"),
    용산구("서울", "용산구", "서울특별시", "서울 용산구 한남대로 136 서울특별시중부기술교육원"),
    은평구("서울", "은평구", "서울특별시", "서울 은평구 진흥로 215 (한국환경산업기술원 온실동2층 )"),
    종로구("서울", "종로구", "서울특별시", "서울 종로구 종로35가길 19 종로5,6가 동 주민센터"),
    중구("서울", "중구", "서울특별시", "서울 중구 덕수궁길 15 시청서소문별관 3동"),
    중랑구("서울", "중랑구", "서울특별시", "서울 중랑구 용마산로 369 건강가정지원센터"),
    가남읍("경기", "가남읍", "경기도", "경기도 여주시 가남읍 태평중앙1길 20 가남읍행정복지센터 옥상"),
    가평("경기", "가평", "경기도", "경기도 가평군 가평읍 석봉로 181 가평군청 의회동"),
    경안동("경기", "경안동", "경기도", "경기도 광주시 중앙로 128 농협중앙회"),
    고덕동("경기", "고덕동", "경기도", "경기도 평택시 고덕면 고덕국제2로 111 종덕초등학교 2층 옥상"),
    고색동("경기", "고색동", "경기도", "경기도 수원시 권선구 서부로 1600 수원시도로교통관리사업소"),
    고읍("경기", "고읍", "경기도", "경기도 양주시 고읍남로 205 청소년문화의 집"),
    고잔동("경기", "고잔동", "경기도", "경기도 안산시 단원구 화랑로 387 안산시청"),
    고천동("경기", "고천동", "경기도", "경기도 의왕시 시청로 11 의왕시청 민원실"),
    고촌읍("경기", "고촌읍", "경기도", "경기도 김포시 고촌읍 신곡로 152 김포시상하수도사업소"),
    곤지암("경기", "곤지암", "경기도", "경기도 광주시 곤지암읍 광여로 59 곤지암읍 행정복지센터 옥상"),
    공도읍("경기", "공도읍", "경기도", "경기도 안성시 공도읍 공도4로 8 공도읍행정복지센터 옥상"),
    과천동("경기", "과천동", "경기도", "경기도 과천시 상하벌로 17 과천시 환경사업소"),
    광교동("경기", "광교동", "경기도", "경기도 수원시 영통구 광교중앙로 216 광교중앙공원 관리동 옥상 (하동)"),
    교문동("경기", "교문동", "경기도", "경기도 구리시 아차산로 439 구리시청 구리시의회"),
    금곡동("경기", "금곡동", "경기도", "경기도 남양주시 경춘로 1037 남양주시청 신관"),
    금촌동("경기", "금촌동", "경기도", "경기도 파주시 후곡로 13 교육문화회관 별관"),
    기흥("경기", "기흥", "경기도", "경기도 용인시 기흥구 관곡로 95 기흥구청"),
    김량장동("경기", "김량장동", "경기도", "경기도 용인시 처인구 금령로 50 처인구청"),
    남양읍("경기", "남양읍", "경기도", "경기도 화성시 남양읍 남양성지로 192-5 남양읍행정복지센터"),
    내동("경기", "내동", "경기도", "경기도 부천시 삼작로 109 신흥동주민센터 앞 도로변"),
    단대동("경기", "단대동", "경기도", "경기도 성남시 수정구 희망로 506번길 21 단대동행정복지센터"),
    당동("경기", "당동", "경기도", "경기도 군포시 산본로197번길 36 당동도서관"),
    대부동("경기", "대부동", "경기도", "경기도 안산시 단원구 대부중앙로 97-9 대부동 행정복지센터"),
    대신면("경기", "대신면", "경기도", "경기도 여주시 대신면 율촌1길 12-10 대신도서관 옥상"),
    대야동("경기", "대야동", "경기도", "경기도 시흥시 복지로 37 다다커뮤니티센터"),
    동구동("경기", "동구동", "경기도", "경기도 구리시 동구릉로 217-14 시립동구어린이집"),
    동탄("경기", "동탄", "경기도", "경기도 화성시 동탄반석로 87 동탄2동 행정복지센터"),
    모현읍("경기", "모현읍", "경기도", "경기도 용인시 처인구 모현읍 독점로 31-6 모현읍주민자치센터"),
    목감동("경기", "목감동", "경기도", "경기도 시흥시 솔고개길 33 목감공원 지상 (목감동)"),
    미사("경기", "미사", "경기도", "경기도 하남시 아리수로 531 미사2동 행정복지센터 (망월동)"),
    배곧동("경기", "배곧동", "경기도", "경기도 시흥시 배곧4로 102 배곧도서관 옥상 (배곧동)"),
    백석읍("경기", "백석읍", "경기도", "경기도 양주시 백석읍 꿈나무로 199 꿈나무도서관"),
    백암면("경기", "백암면", "경기도", "경기도 용인시 처인구 백암면 백암로185번길 8-11 백암면주민자치센터"),
    별내동("경기", "별내동", "경기도", "경기도 남양주시 별내중앙로 148 화접초등학교 (별내동)"),
    별양동("경기", "별양동", "경기도", "경기도 과천시 코오롱로 53 문원초등학교"),
    보산동("경기", "보산동", "경기도", "경기도 동두천시 싸리말로 28 보산동행정복지센터"),
    복정동("경기", "복정동", "경기도", "경기도 성남시 수정구 성남대로 1416번길 22 복정정수장"),
    본오동("경기", "본오동", "경기도", "경기도 안산시 상록구 오목로7길 15 본오1동 작은도서관 (본오동)"),
    봉담읍("경기", "봉담읍", "경기도", "경기도 화성시 봉담읍 샘마을1길 8-4 화성시립봉담도서관 옥상"),
    봉산동("경기", "봉산동", "경기도", "경기도 안성시 시청길 25 안성시청 식당동"),
    부곡3동("경기", "부곡3동", "경기도", "경기도 의왕시 덕영대로 166 부곡청소년문화의 집 (삼동)"),
    부곡동1("경기", "부곡동1", "경기도", "경기도 안산시 상록구 성호로 326 부곡동 행정복지센터"),
    부림동("경기", "부림동", "경기도", "경기도 안양시 동안구 시민대로 235 안양시청 민원실"),
    부발읍("경기", "부발읍", "경기도", "경기도 이천시 부발읍 무촌로 117 부발보건지소 옥상"),
    비전동("경기", "비전동", "경기도", "경기도 평택시 중앙로 275 자원봉사센터"),
    사우동("경기", "사우동", "경기도", "경기도 김포시 돌문로 51 사우동행정복지센터"),
    산본동("경기", "산본동", "경기도", "경기도 군포시 청백리길 6 군포시청 별관"),
    상대원동("경기", "상대원동", "경기도", "경기도 성남시 중원구 둔촌대로 425 상대원1동행정복지센터"),
    새솔동("경기", "새솔동", "경기도", "경기도 화성시 수노을중앙로 178 새솔동 행정복지센터 (새솔동)"),
    서신면("경기", "서신면", "경기도", "경기도 화성시 서신면 궁평항로 1702 서신면사무소 옥상"),
    선단동("경기", "선단동", "경기도", "경기도 포천시 삼육사로 2186번길 11-15 선단보건지소"),
    설악면("경기", "설악면", "경기도", "경기도 가평군 설악면 한서로 8 설악면 문화센터 옥상"),
    소사본동("경기", "소사본동", "경기도", "경기도 부천시 경인옛로 73 소사어울마당 소향관"),
    소하동("경기", "소하동", "경기도", "경기도 광명시 소하일로 7 소하도서관"),
    송북동("경기", "송북동", "경기도", "경기도 평택시 지산2로 113 송북동행정복지센터 (지산동)"),
    송산3동("경기", "송산3동", "경기도", "경기도 의정부시 민락로243번길 94 푸른마당 근린공원 인근 연결녹지(송양유치원과 민락천 사이) (민락동)"),
    수내동("경기", "수내동", "경기도", "경기도 성남시 분당구 분당로 50 분당구청"),
    수지("경기", "수지", "경기도", "경기도 용인시 수지구 수지로 342번길3 풍덕천1동주민자치센터"),
    시화산단("경기", "시화산단", "경기도", "경기도 시흥시 공단1대로 204 시화유통상가 27동"),
    식사동("경기", "식사동", "경기도", "경기도 고양시 일산동구 위시티로 151 양일초등학교"),
    신원동("경기", "신원동", "경기도", "경기도 고양시 덕양구 신원2로 24 신원도서관"),
    신장동("경기", "신장동", "경기도", "경기도 하남시 대청로 10 하남시청 종합민원실"),
    신풍동("경기", "신풍동", "경기도", "경기도 수원시 팔달구 신풍로 23번길 68 선경도서관"),
    안양2동("경기", "안양2동", "경기도", "경기도 안양시 만안구 안양로 384번길 50 안양2동 행정복지센터"),
    안양8동("경기", "안양8동", "경기도", "경기도 안양시 만안구 문예로36번길 16 안양아트센터 옥상 (안양동)"),
    안중("경기", "안중", "경기도", "경기도 평택시 안중읍 안현로 400 안중읍행정복지센터"),
    양평읍("경기", "양평읍", "경기도", "경기도 양평군 양평읍 마유산로 17 양평군보건소 옥상"),
    연천("경기", "연천", "경기도", "경기도 연천군 연천읍 차현로 58 연천군청 지역경제과"),
    영통동("경기", "영통동", "경기도", "경기도 수원시 영통구 영통로 217번길 12 영통2동 행정복지센터"),
    오남읍("경기", "오남읍", "경기도", "경기도 남양주시 오남읍 진건오남로 806-34 오남읍사무소"),
    오산동("경기", "오산동", "경기도", "경기도 오산시 경기동로 51 오산고용복지플러스센터"),
    오정동("경기", "오정동", "경기도", "경기도 부천시 성오로 172 오정어울마당 아트홀"),
    오포1동("경기", "오포1동", "경기도", "경기도 광주시 오포읍 오포로859번길 29 오포1동 행정복지센터 옥상"),
    와부읍("경기", "와부읍", "경기도", "경기도 남양주시 와부읍 도곡길 7 덕소중학교 후관동 옥상"),
    용문면("경기", "용문면", "경기도", "경기도 양평군 용문면 용문로 395 용문도서관"),
    우정읍("경기", "우정읍", "경기도", "경기도 화성시 우정읍 쌍봉로 109-14 우정읍 행정복지센터"),
    운정("경기", "운정", "경기도", "경기도 파주시 와석순환로 470 한국토지주택공사 파주사업본부"),
    운중동("경기", "운중동", "경기도", "경기도 성남시 분당구 운중로 138번길 10 운중동행정복지센터"),
    원곡동("경기", "원곡동", "경기도", "경기도 안산시 단원구 부부로6길 17 근로자운동장 (원곡동)"),
    원시동("경기", "원시동", "경기도", "경기도 안산시 단원구 산단로 112 근로복지관 민주노총"),
    월곶면("경기", "월곶면", "경기도", "경기도 김포시 월곶면 군하로 263 월곶면 주민자치센터 옥상"),
    의정부1동("경기", "의정부1동", "경기도", "경기도 의정부시 가능로152번길 14 의정부1동 주민센터"),
    의정부동("경기", "의정부동", "경기도", "경기도 의정부시 범골로 138 경기도도로사업소"),
    이동읍("경기", "이동읍", "경기도", "경기도 용인시 처인구 이동읍 경기동로 673 이동읍주민자치센터"),
    인계동("경기", "인계동", "경기도", "경기도 수원시 팔달구 효원로 241 수원시청"),
    일동면("경기", "일동면", "경기도", "경기도 포천시 일동면 화동로1099번길 30 일동면행정복지센터"),
    장현동("경기", "장현동", "경기도", "경기도 시흥시 시청로 20 미래키움어린이집 옥상 (장현동)"),
    장호원읍("경기", "장호원읍", "경기도", "경기도 이천시 장호원읍 오남리 27 재래시장 공영주차장"),
    전곡("경기", "전곡", "경기도", "경기도 연천군 전곡읍 은전로 45 전곡읍행정복지센터"),
    정왕동("경기", "정왕동", "경기도", "경기도 시흥시 정왕대로 233번길 19 정왕보건지소"),
    정자동("경기", "정자동", "경기도", "경기도 성남시 분당구 돌마로 242 정자3동행정복지센터"),
    주엽동("경기", "주엽동", "경기도", "경기도 고양시 일산서구 주엽로 104 주엽어린이도서관 (주엽동)"),
    죽산면("경기", "죽산면", "경기도", "경기도 안성시 죽산면 남부길 60 동안성시민복지센터 옥상"),
    중2동("경기", "중2동", "경기도", "경기도 부천시 심중로 121 책마루도서관"),
    중앙동_경기("경기", "중앙동(경기)", "경기도", "경기도 여주시 여흥로11번길 26 중앙동행정복지센터"),
    진접읍("경기", "진접읍", "경기도", "경기도 남양주시 진접읍 금강로 1509-26 진접오남행정복지센터 옥상"),
    창전동("경기", "창전동", "경기도", "경기도 이천시 영창로 163번길 28 평생학습관 어르신쉼터"),
    천천동("경기", "천천동", "경기도", "경기도 수원시 장안구 서부로 2066 성균관대학교 제2공학관"),
    철산동("경기", "철산동", "경기도", "경기도 광명시 시청로 20 광명시청 제1별관"),
    청계동("경기", "청계동", "경기도", "경기도 화성시 동탄순환대로22길 13 예솔초등학교 (청계동)"),
    청북읍("경기", "청북읍", "경기도", "경기도 평택시 청북읍 안청로2길 60 청북문화센터"),
    파주읍("경기", "파주읍", "경기도", "경기도 파주시 파주읍 교육길 13 민방위교육장"),
    평택항("경기", "평택항", "경기도", "경기도 평택시 포승읍 평택항로184번길 38 한국산업단지공단 평택지사"),
    한강신도시("경기", "한강신도시", "경기도", "경기도 김포시 양촌읍 양곡2로30번길 46 김포독립운동기념관 옥상"),
    행신동("경기", "행신동", "경기도", "경기도 고양시 덕양구 화신로 148 행신배수지 가라산공원"),
    향남읍("경기", "향남읍", "경기도", "경기도 화성시 향남읍 발안로 89 향남읍 행정복지센터"),
    호계동("경기", "호계동", "경기도", "경기도 안양시 동안구 경수대로 504 호계복합청사 옥상 (호계동)"),
    호매실("경기", "호매실", "경기도", "경기도 수원시 권선구 칠보로1번길 62 경기도보건환경연구원 (금곡동)"),
    호수동("경기", "호수동", "경기도", "경기도 안산시 단원구 안산천남로 119 양지중학교"),
    화도읍("경기", "화도읍", "경기도", "경기도 남양주시 화도읍 비룡로 59 화도수동행정복지센터"),
    검단("인천", "검단", "인천광역시", "인천광역시 서구 검단로502번길 15(마전동) 검단출장소 옥상"),
    계산("인천", "계산", "인천광역시", "인천광역시 계양구 계양산로134번길 18(계산동) 계양도서관 옥상"),
    고잔("인천", "고잔", "인천광역시", "인천광역시 남동구 은봉로 82 인천지방중소벤처기업청옥상"),
    구월동("인천", "구월동", "인천광역시", "인천광역시 남동구 구월말로 7(구월동) 구월4동 행정복지센터 옥상"),
    길상("인천", "길상", "인천광역시", "인천광역시 강화군 길상면 강화동로 15-1 길상면보건지소 2층"),
    논현("인천", "논현", "인천광역시", "인천광역시 남동구 청능대로611번길 54(논현동) 근린공원"),
    동춘("인천", "동춘", "인천광역시", "인천광역시 연수구 원인재로 115(동춘동) 연수구의회 옥상"),
    부평("인천", "부평", "인천광역시", "인천광역시 부평구 부평대로88번길 19(부평동) 인천부평동초등학교 옥상"),
    삼산("인천", "삼산", "인천광역시", "인천광역시 부평구 충선로 262 시냇물공원 (삼산동)"),
    서창("인천", "서창", "인천광역시", "인천광역시 남동구 서창남로 101 서창어울근린공원 지장 (서창동)"),
    석남("인천", "석남", "인천광역시", "인천광역시 서구 거북로 116(석남동) 석남2동 행정복지센터 옥상"),
    송도("인천", "송도", "인천광역시", "인천광역시 연수구 갯벌로 12 테크노파크 3층 옥상"),
    송림("인천", "송림", "인천광역시", "인천광역시 동구 금곡로 67(송림동) 동구의회 옥상"),
    송해("인천", "송해", "인천광역시", "인천광역시 강화군 송해면 전망대로 29(솔정리) 송해면사무소 옥상"),
    숭의("인천", "숭의", "인천광역시", "인천광역시 미추홀구 독정안길 26 용정초등학교"),
    신흥("인천", "신흥", "인천광역시", "인천광역시 중구 서해대로 471(신흥동 2가) 인천보건환경연구원 옥상"),
    아암("인천", "아암", "인천광역시", "인천광역시 연수구 센트럴로 350 송도달빛축제공원 지장 (송도동)"),
    연희("인천", "연희", "인천광역시", "인천광역시 서구 심곡로 98(심곡동) 인천광역시 인재개발원 옥상"),
    영종("인천", "영종", "인천광역시", "인천광역시 중구 하늘중앙로 132 영종하늘도서관 옥상 (중산동)"),
    영흥("인천", "영흥", "인천광역시", "인천광역시 옹진군 영흥면 영흥로251번길 90 영흥 면사무소 2층 옥상 (영흥면사무소)"),
    운서("인천", "운서", "인천광역시", "인천광역시 중구 영종대로 85(운서동) 영종도서관 옥상"),
    원당("인천", "원당", "인천광역시", "인천광역시 서구 고산후로121번길 7(원당동) 검단선사박물관 옥상"),
    주안("인천", "주안", "인천광역시", "인천광역시 미추홀구 구월남로 27 주안도서관 옥상 (주안동)"),
    청라("인천", "청라", "인천광역시", "인천광역시 서구 크리스탈로 131 수질정화시설관리동 2층 옥상"),
    효성("인천", "효성", "인천광역시", "인천광역시 계양구 봉오대로600번길 14 효성도서관 (효성동)"),
    갈말읍("강원", "갈말읍", "강원도", "강원특별자치도 철원군 갈말읍 삼부연로 51 철원군청"),
    금호동("강원", "금호동", "강원도", "강원특별자치도 속초시 중앙시장로 43 금호동주민센터 (중앙동)"),
    남양동1("강원", "남양동1", "강원도", "강원특별자치도 삼척시 남양길 11(남양동 331-9) 남양동주민센터 3층 옥상"),
    문막읍("강원", "문막읍", "강원도", "강원특별자치도 원주시 문막읍 건등로 11 문막읍행정복지센터 부지내 지상"),
    반곡동_명륜동("강원", "반곡동(명륜동)", "강원도", "강원특별자치도 원주시 배울로 215 (반곡동 1816-2, 배울체육공원 지상) (반곡동)"),
    상리("강원", "상리", "강원도", "강원특별자치도 고성군 간성읍 수성로 160 상리 측정소"),
    석사동("강원", "석사동", "강원도", "강원특별자치도 춘천시 외솔길 17(석사동 322-1) 강원도 개발공사 2층 옥상"),
    신사우동("강원", "신사우동", "강원도", "강원특별자치도 춘천시 사우4길 26 신사우도서관 2층 옥상 (우두동)"),
    양구읍("강원", "양구읍", "강원도", "강원특별자치도 양구군 양구읍 관공서로 33 양구읍 측정소"),
    양양읍("강원", "양양읍", "강원도", "강원특별자치도 양양군 양양읍 남문로 39 양양군 군의회 옥상"),
    영월읍("강원", "영월읍", "강원도", "강원특별자치도 영월군 영월읍 팔괴로 7-3 능동배수펌프장 부지내 지상"),
    옥천동("강원", "옥천동", "강원도", "강원특별자치도 강릉시 경강로 2179(옥천동 327-2) 옥천동주민센터 2층 옥상"),
    우천면("강원", "우천면", "강원도", "강원특별자치도 횡성군 우천면 우항1길 5-34 우천보건지소 옥상"),
    인제읍("강원", "인제읍", "강원도", "강원특별자치도 인제군 인제읍 비봉로44번길 93 인제군기상관측소"),
    정선읍("강원", "정선읍", "강원도", "강원특별자치도 정선군 정선읍 정선로 1331 정선읍행정복지센터 옥상"),
    주문진읍("강원", "주문진읍", "강원도", "강원특별자치도 강릉시 주문진읍 항구로 19 주문진보건출장소"),
    중앙동_강원("강원", "중앙동(강원)", "강원도", "강원특별자치도 원주시 충정길 12(학성동 206-6) 중앙동주민센터 3층 옥상"),
    중앙로("강원", "중앙로", "강원도", "강원특별자치도 춘천시 중앙로길 135(중앙로 3가 67-1) 춘천시보건소 3층 옥상"),
    지정면("강원", "지정면", "강원도", "강원특별자치도 원주시 지정면 기업도시로 200 원주의료기기테크노벨리 부지 내 주차장"),
    천곡동("강원", "천곡동", "강원도", "강원특별자치도 동해시 천곡로 77(천곡동 806) 동해시의회 2층 옥상"),
    평창읍("강원", "평창읍", "강원도", "강원특별자치도 평창군 평창읍 종부로 61(종부리 504) 평창군보건의료원 2층 옥상"),
    홍천읍("강원", "홍천읍", "강원도", "강원특별자치도 홍천군 홍천읍 연봉동로 27 홍천기상관측소"),
    화천읍("강원", "화천읍", "강원도", "강원특별자치도 화천군 화천읍 화천새싹길 45 건설방재과 옥상"),
    황지동("강원", "황지동", "강원도", "강원특별자치도 태백시 태붐로 21 태백시청 부지 내 지상 (황지동)"),
    횡성읍("강원", "횡성읍", "강원도", "강원특별자치도 횡성군 횡성읍 중앙로 30 친환경급식지원센터"),
    고덕면_충남("충남", "고덕면(충남)", "충청남도", "충남 예산군 고덕면 예당산단4길 147 예당일반산업단지 폐수처리장 내"),
    공주("충남", "공주", "충청남도", "충남 공주시 봉황로 1 (공주시의회 옥상)"),
    금산읍("충남", "금산읍", "충청남도", "충남 금산군 금산읍 비호로 69 금산읍사무소 별관 1층 옥상"),
    내포("충남", "내포", "충청남도", "충남 홍성군 홍북읍 홍예공원로 8 충남보건환경연구원 부지내 1층"),
    논산("충남", "논산", "충청남도", "충남 논산시 시민로 389 (취암/부창동 행정복지센터 2층 옥상)"),
    당진시청사("충남", "당진시청사", "충청남도", "충남 당진시 시청1로 1 당진시청사"),
    대산리("충남", "대산리", "충청남도", "충남 서산시 대산읍 충의로 1942 대산종합시장 옥상"),
    대천2동("충남", "대천2동", "충청남도", "충남 보령시 중앙로 142-16 (대천2동 주민센터 옥상)"),
    도고면("충남", "도고면", "충청남도", "충남 아산시 도고면 기곡리 296-4 기곡1리 마을회관 지상"),
    독곶리("충남", "독곶리", "충청남도", "충남 서산시 대산읍 평신1로(독곶리) 한국수자원공사 대산산업용수센터 저수동 옥상"),
    동문동("충남", "동문동", "충청남도", "충남 서산시 중앙로 38-1 서산초등학교 (동문동)"),
    둔포면("충남", "둔포면", "충청남도", "충남 아산시 둔포면 중앙공원로 43 둔포면 측정소"),
    모종동("충남", "모종동", "충청남도", "충남 아산시 모종동 573-2 보건소옥상"),
    배방읍("충남", "배방읍", "충청남도", "충남 아산시 배방읍 배방로 38 배방읍사무소 옥상"),
    백석동("충남", "백석동", "충청남도", "충남 천안시 서북구 음봉로 861-50 한들문화센터 (백석동)"),
    부여읍("충남", "부여읍", "충청남도", "충남 부여군 부여읍 사비로 36 (부여읍행정복지센터 옥상)"),
    삽교읍("충남", "삽교읍", "충청남도", "충남 예산군 삽교읍 두리3길 33 삽교읍 행정복지센터 옥상"),
    서면("충남", "서면", "충청남도", "충남 서천군 서면 서인로 761 서면보건지소옥상"),
    서천읍("충남", "서천읍", "충청남도", "충남 서천군 서천읍 서천로14번길 20 서천읍 문예의전당 주차장"),
    성거읍("충남", "성거읍", "충청남도", "충남 천안시 서북구 성거읍 천흥8길 7 천흥산업단지 내 족구장 지상"),
    성동면("충남", "성동면", "충청남도", "충남 논산시 성동면 산업단지로5길 73-28 논산지방산업단지 기숙사 옥상"),
    성연면("충남", "성연면", "충청남도", "충남 서산시 성연면 마루들길 15 보건지소 옥상"),
    성황동("충남", "성황동", "충청남도", "충남 천안시 동남구 복자1길 24 문성어린이집 문성시립보육시설 옥상"),
    송산면("충남", "송산면", "충청남도", "충남 당진시 송산면 유곡로 342-27 공공하폐수처리시설"),
    송악면("충남", "송악면", "충청남도", "충남 아산시 송악면 송악로 790 송악면행정복지센터"),
    신방동("충남", "신방동", "충청남도", "충남 천안시 동남구 천안천변길 127 천안시 맑은물사업소 하수처리장 (신방동)"),
    엄사면("충남", "엄사면", "충청남도", "충남 계룡시 엄사면 번영7길 17 엄사도서관 옥상"),
    연무읍("충남", "연무읍", "충청남도", "충남 논산시 연무읍 안심로 50 연무읍사무소 옥상"),
    예산군("충남", "예산군", "충청남도", "충남 예산군 예산읍 신흥길 63 (다목적 노인회관 옥상)"),
    원북면("충남", "원북면", "충청남도", "충남 태안군 원북면 상리길 17-4 원북면 보건지소 옥상"),
    이원면("충남", "이원면", "충청남도", "충남 태안군 이원면 분지길 14 (이원면사무소 1층 나동 옥상)"),
    인주면("충남", "인주면", "충청남도", "충남 아산시 인주면 인주산단로 23-28 인주면 측정소"),
    장항읍("충남", "장항읍", "충청남도", "충남 서천군 장항읍 장산로 297 한국철도시설공단 부지내, 공원로 지상 1층"),
    정산면("충남", "정산면", "충청남도", "충남 청양군 정산면 칠갑산로 1861 정산커뮤니티센터"),
    주교면("충남", "주교면", "충청남도", "충남 보령시 주교면 울계큰길 396 주교면사무소 옥상"),
    청양읍("충남", "청양읍", "충청남도", "충남 청양군 청양읍 칠갑산로7길 54 (청양군 보건의료원 옥상)"),
    탄천면("충남", "탄천면", "충청남도", "충남 공주시 탄천면 안터새말길 34 안영1리 경로당 옥상"),
    태안읍("충남", "태안읍", "충청남도", "충남 태안군 태안읍 군청6길 태안군장애인복지관"),
    합덕읍("충남", "합덕읍", "충청남도", "충남 당진시 합덕읍 합덕리 344 합덕리"),
    홍성읍("충남", "홍성읍", "충청남도", "충남 홍성군 홍성읍 내포로 136번길 29 (느티나무 어린이집 옥상)"),
    관평동("대전", "관평동", "대전광역시", "대전광역시 유성구 테크노중앙로 88 동화울수변공원 내 (관평동)"),
    구성동("대전", "구성동", "대전광역시", "대전광역시 유성구 대학로 407 보건환경연구원 보건환경연구원"),
    노은동("대전", "노은동", "대전광역시", "대전광역시 유성구 노은동로 87번길 89(노은1동 주민센터) 노은1동 주민센터 3층 옥상"),
    대성동("대전", "대성동", "대전광역시", "대전광역시 동구 동구청로 36 남부여성가족원 (대성동)"),
    둔산동("대전", "둔산동", "대전광역시", "대전광역시 서구 둔산서로 84(근로자 종합복지회관) 근로자 종합복지회관(3층 옥상)"),
    문창동("대전", "문창동", "대전광역시", "대전광역시 중구 보문로 20번길 38(문창동 주민센터) 문창동 주민센터"),
    문평동("대전", "문평동", "대전광역시", "대전광역시 대덕구 문평동로 18번길 34(문평동 119안전센터) 문평동 119안전센터"),
    상대동_대전("대전", "상대동(대전)", "대전광역시", "대전광역시 유성구 도안대로 398 대전역사박물관 (상대동)"),
    성남동1("대전", "성남동1", "대전광역시", "대전광역시 동구 계족로 368번길 70(성남동 주민센터) 성남동 주민센터"),
    읍내동("대전", "읍내동", "대전광역시", "대전광역시 대덕구 대전로 1331번길 75(태아산업(주)) 태아산업(주)"),
    정림동("대전", "정림동", "대전광역시", "대전광역시 서구 정림동로 10(정림동 주민센터) 정림동 주민센터"),
    가덕면("충북", "가덕면", "충청북도", "충북 청주시 상당구 가덕면 보청대로 4650 가덕면사무소 앞쪽 부지"),
    감물면("충북", "감물면", "충청북도", "충북 괴산군 감물면 충민로신대길 13 감물면사무소 지상"),
    괴산읍("충북", "괴산읍", "충청북도", "충북 괴산군 괴산읍 서부리 377-1 반석아파트 앞 지상"),
    단성면("충북", "단성면", "충청북도", "충북 단양군 단성면 충혼로 52-1 단성보건지소 주차장(지면)"),
    단양읍("충북", "단양읍", "충청북도", "충북 단양군 단양읍 별곡6길 26 공설운동장 공중화장실 옥상"),
    덕산읍("충북", "덕산읍", "충청북도", "충북 진천군 덕산읍 대월로 90 혁신도시공원 관리사무소 옥상"),
    도안면("충북", "도안면", "충청북도", "충북 증평군 도안면 문화마을길 8 도안면사무소 옥상"),
    매포읍("충북", "매포읍", "충청북도", "충북 단양군 매포읍 평동리 1274(평동33길 3),(매포 보건지소 마당) 매포보건지소 지상"),
    보은읍("충북", "보은읍", "충청북도", "충북 보은군 보은읍 이평리 244 보은군 스포츠파크"),
    사천동("충북", "사천동", "충청북도", "충북 청주시 청원구 사천동 233-223번지(사뜸로 61번길 88-14), 청주청원도서관 옥상(2층) 청주청원도서관 옥상"),
    산남동("충북", "산남동", "충청북도", "충북 청주시 서원구 원흥로 81 청주지방법원 옆 주차장 지상 (산남동)"),
    살미면("충북", "살미면", "충청북도", "충북 충주시 살미면 세성양지말길 41 살미면 행정복지센터 주차장 옆"),
    소이면("충북", "소이면", "충청북도", "충북 음성군 소이면 소이로 409 소이면전천후게이트볼장 공터"),
    송정동_봉명동("충북", "송정동(봉명동)", "충청북도", "충북 청주시 흥덕구 직지대로 393(송정동) 충북문화재연구원 옥상"),
    영동읍("충북", "영동읍", "충청북도", "충북 영동군 영동읍 계산로2길 25 레인보우도서관 옥상"),
    영천동("충북", "영천동", "충청북도", "충북 제천시 청풍호로8길 7 비점오염원 관리시설 뒤편 공터 (영천동)"),
    오송읍("충북", "오송읍", "충청북도", "충북 청주시 흥덕구 오송읍 오송생명로 150 오송읍 사무소 별관 지상"),
    오창읍("충북", "오창읍", "충청북도", "충북 청주시 청원구 오창읍 오창대로 197 오창중앙공원내"),
    옥천읍("충북", "옥천읍", "충청북도", "충북 옥천군 옥천읍 중앙로 99(옥천군청 통합관제 센터 옥상) 옥천군청 통합관제 센터 옥상"),
    용담동("충북", "용담동", "충청북도", "충북 청주시 상당구 교동로139번길 20 라일락소공원 지상 (용담동)"),
    용암동("충북", "용암동", "충청북도", "충북 청주시 상당구 용암동 1590(중흥로 29), 용암1동 주민센터 3층 옥상 용암1동 주민센터 옥상"),
    음성읍("충북", "음성읍", "충청북도", "충북 음성군 음성읍 중앙로 49 읍성보건소 옥상"),
    장락동("충북", "장락동", "충청북도", "충북 제천시 장락동 672-8(내제로 318),(시립도서관 주차장 옆, 화단) 의병도서관 지상"),
    중앙탑면("충북", "중앙탑면", "충청북도", "충북 충주시 중앙탑면 기업도시로 237 서충주 국공립어린이집 측면부지"),
    증평읍("충북", "증평읍", "충청북도", "충북 증평군 증평읍 남하용강로 16 증평자전거공원 내 부지"),
    진천읍("충북", "진천읍", "충청북도", "충북 진천군 진천읍 상산로 65 읍내리 370-1 진천읍사무소 옥상"),
    청풍면("충북", "청풍면", "충청북도", "충북 제천시 청풍면 청풍호로 2115 청풍면행정복지센터 옆쪽 공터"),
    칠금동("충북", "칠금동", "충청북도", "충북 충주시 칠금동 874번지(칠금동 주민센터 옥상)(칠금 중랑로 37) 칠금금릉동 주민센터 옥상"),
    호암동("충북", "호암동", "충청북도", "충북 충주시 호암동 562(충주시 청소년수련원 옥상)(중원대로 3324) 청소년수련원 옥상"),
    황간면("충북", "황간면", "충청북도", "충북 영동군 황간면 남성리 185 황간근린공원"),
    부강면("세종", "부강면", "세종특별시", "세종특별자치시 부강면 부강외천로 20 문화복지회관 옥상"),
    신흥동("세종", "신흥동", "세종특별시", "세종특별자치시 조치원읍 군청로 87-16(신흥동) 세종특별자치시 조치원청사 옥상"),
    아름동("세종", "아름동", "세종특별시", "세종특별자치시 보듬3로 114 아름동커뮤니티센터 옥상 (아름동)"),
    전의면("세종", "전의면", "세종특별시", "세종특별자치시 전의면 운주산로 1270 행정복지센터 지상"),
    한솔동("세종", "한솔동", "세종특별시", "세종특별자치시 누리로 27 첫마을 6단지 관리사무소 옥상 (한솔동, 첫마을6단지)"),
    개금동("부산", "개금동", "부산광역시", "부산광역시 부산진구 개금온정로17번길 51 개금3동 어린이놀이터 지상 (개금동)"),
    광복동("부산", "광복동", "부산광역시", "부산광역시 중구 광복로 55번길 10 광복동주민센터 옥상"),
    광안동("부산", "광안동", "부산광역시", "부산광역시 수영구 광안로21번가길 57 한바다중학교 옥상"),
    기장읍("부산", "기장읍", "부산광역시", "부산광역시 기장군 기장읍 읍내로 69 기장초등학교 옥상"),
    녹산동("부산", "녹산동", "부산광역시", "부산광역시 강서구 녹산산단 382로 49번길 39 부산환경공단 녹산사업소"),
    당리동("부산", "당리동", "부산광역시", "부산광역시 사하구 제석로 41 낙동초등학교 운동장 동편 화단 (당리동)"),
    대신동("부산", "대신동", "부산광역시", "부산광역시 서구 대신로 150 부산국민체육센터 옥상"),
    대연동("부산", "대연동", "부산광역시", "부산광역시 남구 수영로 196번길 80 부산공업고등학교 공동실습관 옥상"),
    대저동("부산", "대저동", "부산광역시", "부산광역시 강서구 체육공원로 43 강서체육공원 (대저1동)"),
    덕천동("부산", "덕천동", "부산광역시", "부산광역시 북구 덕천2길 10 덕천초등학교 운동장 남쪽 화단"),
    덕포동("부산", "덕포동", "부산광역시", "부산광역시 사상구 삼덕로 83 덕포초등학교 운동장 북서쪽 화단 (덕포동)"),
    명장동("부산", "명장동", "부산광역시", "부산광역시 동래구 명장로 32 명장1동 주민센터 옥상"),
    명지동("부산", "명지동", "부산광역시", "부산광역시 강서구 명지동 3513-3 봄뜰공원 (명지동)"),
    부곡동("부산", "부곡동", "부산광역시", "부산광역시 금정구 부곡로156번길 7 부곡2동 주민센터 옥상 (부곡동)"),
    수정동("부산", "수정동", "부산광역시", "부산광역시 동구 구청로 1 동구청 지상"),
    연산동("부산", "연산동", "부산광역시", "부산광역시 연제구 중앙대로 1001 부산광역시청 녹음광장 창고"),
    용수리("부산", "용수리", "부산광역시", "부산광역시 기장군 정관읍 용수로 4 정관읍사무소 옥상"),
    용호동("부산", "용호동", "부산광역시", "부산광역시 남구 이기대공원로 11 부산환경공단 남부사업소 북쪽 (용호동)"),
    장림동("부산", "장림동", "부산광역시", "부산광역시 사하구 장림로 161번길 2 장림1동주민센터 옥상"),
    재송동("부산", "재송동", "부산광역시", "부산광역시 해운대구 센텀동로 191 동부하수처리장 (재송동)"),
    전포동("부산", "전포동", "부산광역시", "부산광역시 부산진구 전포대로209번길 26 놀이마루 운동장 남편 (전포동)"),
    좌동("부산", "좌동", "부산광역시", "부산광역시 해운대구 양운로 91 좌1동주민센터 옥상"),
    청룡동("부산", "청룡동", "부산광역시", "부산광역시 금정구 청룡로 25 청룡노포동주민센터 옥상"),
    청학동("부산", "청학동", "부산광역시", "부산광역시 영도구 청학남로13번길 18 청학동 어울림마당 (청학동)"),
    태종대("부산", "태종대", "부산광역시", "부산광역시 영도구 전망로 24 태종대유원지관리사무소 3층"),
    학장동("부산", "학장동", "부산광역시", "부산광역시 사상구 대동로 205 학장초등학교 옥상"),
    화명동("부산", "화명동", "부산광역시", "부산광역시 북구 용당로16번길 22 장미원 (화명동)"),
    회동동("부산", "회동동", "부산광역시", "부산광역시 금정구 금사로 217 회동마루 (회동동)"),
    농소동("울산", "농소동", "울산광역시", "울산광역시 북구 호수중앙로 14 농소운동장 주차장 (창평동)"),
    대송동("울산", "대송동", "울산광역시", "울산광역시 동구 대송5길 10 대송동주민센터 옥상"),
    덕신리("울산", "덕신리", "울산광역시", "울산광역시 울주군 온산읍 덕신로 229 고려아연(주) 사택 주차장"),
    무거동("울산", "무거동", "울산광역시", "울산광역시 남구 대학로 147번길 38 무거동주민센터"),
    범서읍("울산", "범서읍", "울산광역시", "울산광역시 울주군 범서읍 당앞로 14-50 천상정수사업소"),
    부곡동_울산("울산", "부곡동(울산)", "울산광역시", "울산광역시 남구 처용로 260-37 대경기계기술"),
    삼남읍("울산", "삼남읍", "울산광역시", "울산광역시 울주군 삼남읍 서향교1길 67-12 울주군보건소 옥상"),
    삼산동("울산", "삼산동", "울산광역시", "울산광역시 남구 삼산중로 131번길 36 삼산동 주민센터 옥상"),
    상남리("울산", "상남리", "울산광역시", "울산광역시 울주군 청량면 신덕하3길 5 청량면사무소 옥상"),
    성남동("울산", "성남동", "울산광역시", "울산광역시 중구 새즈믄해거리 28 농협 성남동 지점"),
    송정동("울산", "송정동 대기환경측정소", "울산광역시", "울산광역시 북구 송내14길 41 송정동 행정복지센터 (화봉동)"),
    신정동("울산", "신정동", "울산광역시", "울산광역시 남구 봉월로 20번길 9 신정2동주민센터 옥상"),
    야음동("울산", "야음동", "울산광역시", "울산광역시 남구 대암로 90번길 27 울산세관"),
    약사동("울산", "약사동", "울산광역시", "울산광역시 중구 종가로 560 약사고등학교"),
    여천동_울산("울산", "여천동(울산)", "울산광역시", "울산광역시 남구 부두로 9 현대자동차 엔진공장"),
    웅촌면("울산", "웅촌면", "울산광역시", "울산광역시 울주군 웅촌면 새초천길 12 웅촌운동장 주차장"),
    전하동("울산", "전하동", "울산광역시", "울산광역시 동구 진성4길 45 주민센터 3층 옥상 (전하동)"),
    화산리("울산", "화산리", "울산광역시", "울산광역시 울주군 온산읍 산암로 94 풍산금속 야외 주차장"),
    효문동("울산", "효문동", "울산광역시", "울산광역시 북구 염포로 290 효문배수펌프장 옥상"),
    군위읍("대구", "군위읍", "대구광역시", "대구광역시 군위군 군위읍 군청로 158 군위종합테니스장 옥상"),
    남산1동("대구", "남산1동", "대구광역시", "대구광역시 중구 남산로2길 125 대구명덕초등학교 (남산동)"),
    내당동("대구", "내당동", "대구광역시", "대구광역시 서구 서대구로3길 46 내당4동 행정복지센터 3층 옥상 (내당동)"),
    다사읍("대구", "다사읍", "대구광역시", "대구광역시 달성군 다사읍 매곡로12길 37 다사읍주민자치센터"),
    대명동("대구", "대명동", "대구광역시", "대구광역시 남구 성당로30길55 성명초등학교별관3층옥상 성명초등학교 별관 3층 옥상"),
    만촌동("대구", "만촌동", "대구광역시", "대구광역시 수성구 만촌2동 934 (동원초등학교)(국채보상로 1000) 동원초등학교"),
    본동("대구", "본동", "대구광역시", "대구광역시 달서구 구마로26길 62 본동행정복지센터 (본동)"),
    산격동("대구", "산격동", "대구광역시", "대구광역시 북구 연암로 40 시청별관 105동 3층 옥상 (산격동)"),
    서호동("대구", "서호동", "대구광역시", "대구광역시 동구 서호동 25-1(안심로49길 70) 반야월초등학교 옥상"),
    수창동("대구", "수창동", "대구광역시", "대구광역시 중구 수창동 73 (수창초등학교)(달성로 22길 30) 수창초등학교"),
    시지동("대구", "시지동", "대구광역시", "대구광역시 수성구 노변공원로 52 노변초등학교 (시지동)"),
    신암동("대구", "신암동", "대구광역시", "대구광역시 동구 신암동 72-1 (신암5동사무소)(아양로 37길 92) 주민센터"),
    유가읍("대구", "유가읍", "대구광역시", "대구광역시 달성군 유가읍 테크노북로6길 20 비슬공원"),
    이현동("대구", "이현동", "대구광역시", "대구광역시 서구 이현동 48-60 (중리초등학교)(국채보상로 135) 중리초등학교"),
    지산동("대구", "지산동", "대구광역시", "대구광역시 수성구 지산동 761-11(한국환경공단) (무학로 209) 한국환경공단"),
    진천동("대구", "진천동", "대구광역시", "대구광역시 달서구 월배로 131 월배초등학교 (진천동)"),
    침산동("대구", "침산동", "대구광역시", "대구광역시 북구 옥산로17길 21 대구일중학교 (침산동)"),
    태전동("대구", "태전동", "대구광역시", "대구광역시 북구 태전동 1076-5 (태암초등학교)(칠곡중앙대로 52길 56) 태암초등학교 남관 4층 옥상"),
    호림동("대구", "호림동", "대구광역시", "대구광역시 달서구 성서공단로 11길 32 대구기계부품연구원 1동 옥상 대구기계부품연구원"),
    화원읍("대구", "화원읍", "대구광역시", "대구광역시 달성군 화원읍 인흥1길 12 화원명곡체육공원"),
    경북_3공단("경북", "3공단", "경상북도", "경북 포항시 남구 대송면 철강산단로130번길 29 3공단 배수지"),
    경북_4공단("경북", "4공단", "경상북도", "경북 구미시 산동읍 첨단기업1로 17 구미전자정보기술원 혁신관 옥상"),
    가흥동("경북", "가흥동", "경상북도", "경북 영주시 가흥로 263 시립도서관 내 (가흥동)"),
    공단동("경북", "공단동", "경상북도", "경북 구미시 공단동 256-18 (근로자종합복지회) 근로자종합복지회"),
    대가야읍("경북", "대가야읍", "경상북도", "경북 고령군 대가야읍 성산로 46 고령배수지"),
    대광동("경북", "대광동", "경상북도", "경북 김천시 공단2길 30-22 평생교육원 별관 2층 옥상"),
    대도동("경북", "대도동", "경상북도", "경북 포항시 남구 대도동 111-6(상대동평생학습관) 상대동평생학습관"),
    대송면("경북", "대송면", "경상북도", "경북 포항시 남구 대송면 장동홍계길19 (대송면사무소 내) 대송면사무소"),
    명륜동("경북", "명륜동", "경상북도", "경북 안동시 퇴계로 115 (명륜동) 안동시청 경민관 옥상"),
    문경시("경북", "문경시", "경상북도", "경북 문경시 시청2길 45 모전도서관 옥상 (모전동)"),
    보덕동("경북", "보덕동", "경상북도", "경북 경주시 경감로 587-18 경주스마트미디어센터 지상"),
    봉화군청("경북", "봉화군청", "경상북도", "경북 봉화군 봉화읍 봉화로 1111 봉화군청 입구"),
    상주시("경북", "상주시", "경상북도", "경북 상주시 북천로 63 북문동주민센터"),
    석포면("경북", "석포면", "경상북도", "경북 봉화군 석포면 석포로1길 55 석포면사무소 앞"),
    성건동("경북", "성건동", "경상북도", "경북 경주시 성건동 667-3(성건동주민센터) 성건동주민센터"),
    성주군("경북", "성주군", "경상북도", "경북 성주군 성주읍 성주로 3258 성주군 별고을교육원 옥상"),
    송도동("경북", "송도동", "경상북도", "경북 포항시 남구 축항로 55 송림초등학교 (송도동)"),
    안강읍("경북", "안강읍", "경상북도", "경북 경주시 안강읍 비화동길 9-40 대한노인회 경주시지회 안강읍분회 옥상"),
    안계면("경북", "안계면", "경상북도", "경북 의성군 안계면 안계길 114 안계면사무소 옥상"),
    양덕동("경북", "양덕동", "경상북도", "경북 포항시 북구 천마로 161 (양덕동) (장량동 다목적 구호소)"),
    연일읍("경북", "연일읍", "경상북도", "경북 포항시 남구 연일읍 동문로 67 연일복지회관 옥상"),
    영덕읍("경북", "영덕읍", "경상북도", "경북 영덕군 영덕읍 삼근길 6-7 영덕군민운동장 옆"),
    영양군("경북", "영양군", "경상북도", "경북 영양군 영양읍 군청길 37 영양군청 옥상"),
    영주동("경북", "영주동", "경상북도", "경북 영주시 광복로 65 수도사업소 옥상 (영주동)"),
    영천시("경북", "영천시", "경상북도", "경북 영천시 시청로 23 영천 별빛직장어린이집"),
    영해면("경북", "영해면", "경상북도", "경북 영덕군 영해면 예주3길 7 영해면행정복지센터 옥상"),
    예천군("경북", "예천군", "경상북도", "경북 예천군 호명면 행복7길 25-4 예천군 통합관제센터 옥상"),
    오천읍("경북", "오천읍", "경상북도", "경북 포항시 남구 오천읍 냉천로320번길 4-11 오천읍민복지회관"),
    외동읍("경북", "외동읍", "경상북도", "경북 경주시 외동읍 입실로3길 31 외동보건지소 옥상"),
    울릉읍("경북", "울릉읍", "경상북도", "경북 울릉군 울릉읍 도동2길 65 울릉군민회관"),
    울진군("경북", "울진군", "경상북도", "경북 울진군 울진읍 읍내10길 19 울진읍사무소"),
    원평동("경북", "원평동", "경상북도", "경북 구미시 원평동 56-4(구미중앙로 24) 동사무소"),
    율곡동("경북", "율곡동", "경상북도", "경북 김천시 혁신4로 21 율곡동 주민센터 옥상 (율곡동)"),
    의성읍("경북", "의성읍", "경상북도", "경북 의성군 의성읍 군청길 31 의성군청 별관 옥상"),
    장량동("경북", "장량동", "경상북도", "경북 포항시 북구 삼흥로 98 북구보건소 북구보건소"),
    장흥동("경북", "장흥동", "경상북도", "경북 포항시 남구 철강로 331 공단정수장 공단정수장"),
    제철동("경북", "제철동", "경상북도", "경북 포항시 남구 인덕로 52 인덕어울림복지회관 옥상 (인덕동)"),
    중방동("경북", "중방동", "경상북도", "경북 경산시 중방동 708-5 남매로 158 경산시보건소 정신보건센터 2층"),
    진량읍("경북", "진량읍", "경상북도", "경북 경산시 진량읍 낙산길 7 진량복지회관 옥상"),
    진미동("경북", "진미동", "경상북도", "경북 구미시 이계북로 149 진미동 행정복지센터 (진평동)"),
    청림동("경북", "청림동", "경상북도", "경북 포항시 남구 신항로 10 청림동주민센터 (청림동)"),
    청송읍("경북", "청송읍", "경상북도", "경북 청송군 청송읍 금월로 230 청송군 영농일자리지원센터 옥상"),
    칠곡군("경북", "칠곡군", "경상북도", "경북 칠곡군 왜관읍 관문로1길 30 칠곡군 보건소 건강증진센터 옥상"),
    평화남산동("경북", "평화남산동", "경상북도", "경북 김천시 평화순환길 291 평화남산동주민센터 옥상 (평화동)"),
    하양읍("경북", "하양읍", "경상북도", "경북 경산시 하양읍 하양로 119-1 기상청부지 지상"),
    형곡동("경북", "형곡동", "경상북도", "경북 구미시 형곡동 142(구미시립도서관) 구미시립도서관"),
    화양읍("경북", "화양읍", "경상북도", "경북 청도군 화양읍 도주관로 159 화양읍사무소 옥상"),
    가야읍("경남", "가야읍", "경상남도", "경남 함안군 가야읍 함안대로 505 가야읍행정복지센터 옥상"),
    거창읍("경남", "거창읍", "경상남도", "경남 거창군 거창읍 거함대로 3252 자전거교통안전교육장 옥상"),
    경화동("경남", "경화동", "경상남도", "경남 창원시 진해구 경화로16번길 31 (병암동주민센터)"),
    고성읍("경남", "고성읍", "경상남도", "경남 고성군 고성읍 중앙로 35 고성읍보건지소 2층 옥상"),
    고현동("경남", "고현동", "경상남도", "경남 거제시 계룡로 125 거제시청 옥상 (고현동)"),
    금성면("경남", "금성면", "경상남도", "경남 하동군 금성면 금성중앙길 14 금성꿈나무어린이집 옥상"),
    남해읍("경남", "남해읍", "경상남도", "경남 남해군 남해읍 남해대로 2745 남해유배문학관 옥상"),
    내서읍("경남", "내서읍", "경상남도", "경남 창원시 마산회원구 내서읍 광려로 8 삼계근린공원 지상"),
    내일동("경남", "내일동", "경상남도", "경남 밀양시 중앙로 346 내일동주민센터 (내일동)"),
    대안동("경남", "대안동", "경상남도", "경남 진주시 진주대로 1052 (중소기업은행)"),
    동상동("경남", "동상동", "경상남도", "경남 김해시 호계로 517번길 8 (동상동 주민센터)"),
    명서동("경남", "명서동", "경상남도", "경남 창원시 의창구 우곡로101번길 28 명서2동 민원센터 (명서동)"),
    무전동("경남", "무전동", "경상남도", "경남 통영시 안개4길 53 무전동주민센터 (무전동)"),
    물금읍("경남", "물금읍", "경상남도", "경남 양산시 물금읍 황산로 384 물금읍행정복지센터 옥상"),
    봉암동("경남", "봉암동", "경상남도", "경남 창원시 마산회원구 봉양로 148 봉암동 주민센터 (봉암동)"),
    북부동("경남", "북부동", "경상남도", "경남 양산시 북안남5길 21 중앙동주민센터 (북부동)"),
    사천읍("경남", "사천읍", "경상남도", "경남 사천시 사천읍 읍내로 52 (사천읍사무소)"),
    사파동("경남", "사파동", "경상남도", "경남 창원시 성산구 창이대로 706번길 16-23 (사파민원센터)"),
    산청읍("경남", "산청읍", "경상남도", "경남 산청군 산청읍 산엔청로 1 산청군청 주차장 지상"),
    삼방동("경남", "삼방동", "경상남도", "경남 김해시 활천로 303 (신어초등학교)"),
    삼호동("경남", "삼호동", "경상남도", "경남 양산시 삼호9길 11 웅상노인복지회관 (삼호동)"),
    상대동_진주("경남", "상대동(진주)", "경상남도", "경남 진주시 동진로 279 (한국전력공사 진주지점)"),
    상봉동("경남", "상봉동", "경상남도", "경남 진주시 북장대로64번길 14 중앙119안전센터 옥상 (봉곡동)"),
    성주동("경남", "성주동", "경상남도", "경남 창원시 성산구 외리로14번길 18 성주민원센터"),
    아주동("경남", "아주동", "경상남도", "경남 거제시 아주동 산164-1 거제시 옥포 유해대기측정소"),
    용지동("경남", "용지동", "경상남도", "경남 창원시 의창구 용지로 239번길 19-4 (용지동 주민센터)"),
    웅남동("경남", "웅남동", "경상남도", "경남 창원시 성산구 공단로 303 (효성굿스프링스)"),
    월영동("경남", "월영동", "경상남도", "경남 창원시 마산합포구 월영동16길 22 마산합포구도서관 옥상 (해운동)"),
    의령읍("경남", "의령읍", "경상남도", "경남 의령군 의령읍 의병로8길 44 서동생활공원 지상"),
    장유동("경남", "장유동", "경상남도", "경남 김해시 장유동 능동로 149 (장유건강지원센터)"),
    정촌면("경남", "정촌면", "경상남도", "경남 진주시 정촌면 예하리 1340 예하초등학교 앞 공원 지상"),
    진영읍("경남", "진영읍", "경상남도", "경남 김해시 진영읍 김해대로365번길 6-24 진영건강증진센터 옥상"),
    창녕읍("경남", "창녕읍", "경상남도", "경남 창녕군 창녕읍 우포2로 1189-35 정신건강복지센터 옥상"),
    하동읍("경남", "하동읍", "경상남도", "경남 하동군 하동읍 군청로 23 (하동군청)"),
    함양읍("경남", "함양읍", "경상남도", "경남 함양군 함양읍 고운로 35 함양군청 민원봉사과 옥상"),
    합천읍("경남", "합천읍", "경상남도", "경남 합천군 합천읍 대야로 888-20 보훈회관 옥상"),
    향촌동("경남", "향촌동", "경상남도", "경남 사천시 향촌5길 28 향촌동행정복지센터 옥상 (향촌동)"),
    회원동("경남", "회원동", "경상남도", "경남 창원시 마산회원구 회원동 11번길 7 (회원1동 주민센터)"),
    강진읍("전남", "강진읍", "전라남도", "전남 강진군 강진읍 동성로 72 강진읍 측정소"),
    고흥읍("전남", "고흥읍", "전라남도", "전남 고흥군 고흥읍 터미널길 11 고흥읍사무소"),
    곡성읍("전남", "곡성읍", "전라남도", "전남 곡성군 곡성읍 학정3길 6 곡성읍 측정소"),
    광양읍("전남", "광양읍", "전라남도", "전남 광양시 광양읍 인덕로 1100(칠성리) 광양읍 2청사 옥상"),
    구례읍("전남", "구례읍", "전라남도", "전남 구례군 구례읍 동편제길 30 구례읍 측정소"),
    담양읍("전남", "담양읍", "전라남도", "전남 담양군 담양읍 면앙정로 730 담양군 농업기술센터 생명농업연구동 뒤편"),
    대불("전남", "대불", "전라남도", "전남 영암군 삼호읍 대불주거9로 27 대불종합체육관"),
    덕충동("전남", "덕충동", "전라남도", "전남 여수시 덕충안길 95 만덕동주민자치센터"),
    무안읍("전남", "무안읍", "전라남도", "전남 무안군 무안읍 성내1길 2 무안읍사무소"),
    문수동("전남", "문수동", "전라남도", "전남 여수시 여문1로 71(문수동) 문수동주민센터 옥상"),
    벌교읍("전남", "벌교읍", "전라남도", "전남 보성군 벌교읍 체육공원길 35 벌교읍 측정소"),
    보성읍("전남", "보성읍", "전라남도", "전남 보성군 보성읍 현충로 42-36 원봉3구회관(노인당) 옥상"),
    봉강면("전남", "봉강면", "전라남도", "전남 광양시 봉강면 조양길 46 봉강면사무소 옥상"),
    부흥동("전남", "부흥동", "전라남도", "전남 목포시 삼향천로 28(옥암동) 부흥동주민센터"),
    빛가람동("전남", "빛가람동", "전라남도", "전남 나주시 빛가람로 719 빛가람동 주민센터 옥상"),
    삼일동("전남", "삼일동", "전라남도", "전남 여수시 상암로 601-1 상암보건지소 (상암동)"),
    서강동("전남", "서강동", "전라남도", "전남 여수시 서교1길 28-1 서강동주민자치센터 (서교동)"),
    순천만("전남", "순천만", "전라남도", "전남 순천시 순천만길 513-25(대대동) 순천만 자연생태관 옥상"),
    신대("전남", "신대", "전라남도", "전남 순천시 해룡면 매안로 162 순천시립신대도서관"),
    신안군("전남", "신안군", "전라남도", "전남 신안군 안좌면 중부로 860 신안군 측정소"),
    신지면("전남", "신지면", "전라남도", "전남 완도군 신지면 신지로 567 신지면 문화센터"),
    여천동_여수("전남", "여천동(여수)", "전라남도", "전남 여수시 무선로 190(선원동) 여천동 주민센터 뒷편"),
    연향동("전남", "연향동", "전라남도", "전남 순천시 연향번영길 54(연향동) 연향도서관 옥상"),
    영광읍("전남", "영광읍", "전라남도", "전남 영광군 영광읍 물무로2길 61 영광읍사무소"),
    영암읍("전남", "영암읍", "전라남도", "전남 영암군 영암읍 낭주로 202-2 영암 종합스포츠타운 야구장"),
    용당동("전남", "용당동", "전라남도", "전남 목포시 동부로 31번길 20(용당1동 주민센터 옥상) 용당1동 주민센터 옥상"),
    월내동("전남", "월내동", "전라남도", "전남 여수시 여수산단로 1201(월내동) 여수산단 월내 폐수종말처리장"),
    율촌면("전남", "율촌면", "전라남도", "전남 여수시 율촌면 동산개길 2 율촌면 보건지소"),
    장성읍("전남", "장성읍", "전라남도", "전남 장성군 장성읍 영천로 211 장성읍사무소 옥상"),
    장천동("전남", "장천동", "전라남도", "전남 순천시 장명로 30(장천동) 순천시청 별관 옥상"),
    장흥읍("전남", "장흥읍", "전라남도", "전남 장흥군 장흥읍 흥성로 23 정남진도서관"),
    중동("전남", "중동(유해+중금속)", "전라남도", "전남 광양시 중마중앙로 109 광양소방서 옥상"),
    진도읍("전남", "진도읍", "전라남도", "전남 진도군 진도읍 진도대로 7195 진도여성플라자"),
    진월면("전남", "진월면", "전라남도", "전남 광양시 진월면 선소중앙길 31 진월면사무소 옥상"),
    태인동("전남", "태인동", "전라남도", "전남 광양시 태인길 376(태인동) 태인폐정수장 사무실"),
    함평읍("전남", "함평읍", "전라남도", "전남 함평군 함평읍 중앙길 39 함평군노인복지회관"),
    해남읍("전남", "해남읍", "전라남도", "전남 해남군 해남읍 남부순환로 114 해남읍사무소"),
    호두리("전남", "호두리", "전라남도", "전남 순천시 해룡면 호두리 276-9 호두정수장"),
    화순읍("전남", "화순읍", "전라남도", "전남 화순군 화순읍 동헌길 9-24 화순군 CCTV 관제센터"),
    화양면("전남", "화양면", "전라남도", "전남 여수시 화양면 평촌길 2-6 화동경로당"),
    건국동("광주", "건국동", "광주광역시", "광주광역시 북구 첨단과기로 333 (광주테크노파크 벤처지원센터 옥상) 광주테크노파크 벤처지원센터 옥상"),
    노대동("광주", "노대동", "광주광역시", "광주광역시 남구 덕남길 7 문화관 근처 (노대동)"),
    농성동("광주", "농성동", "광주광역시", "광주광역시 서구 상무대로 1165 (광주시립미술관 상록전시관 단독건물) 광주시립미술관"),
    두암동("광주", "두암동", "광주광역시", "광주광역시 북구 군왕로 141번길 6 (두암보건지소) 두암보건지소 3층 옥상"),
    서석동("광주", "서석동", "광주광역시", "광주광역시 동구 서남로 1 동구청보건소"),
    오선동("광주", "오선동", "광주광역시", "광주광역시 광산구 하남산단 6번로 107 삼성전자 환경안전센터"),
    우산동_광주("광주", "우산동(광주)", "광주광역시", "광주광역시 광산구 우산동 1026-2 월곡119안전센터 인근 사유지 (우산동)"),
    유촌동("광주", "유촌동", "광주광역시", "광주광역시 서구 천변우하로 203 광주보건환경연구원 신청사 옥상 (유촌동)"),
    일곡동("광주", "일곡동", "광주광역시", "광주광역시 북구 모룡대길 68 교통문화연수원 옥상 (일곡동)"),
    주월동("광주", "주월동", "광주광역시", "광주광역시 남구 회서로 21번가길 13 주월1동 주민센터"),
    평동("광주", "평동", "광주광역시", "광주광역시 광산구 평동산단로 184-1 평동종합비즈니스센터 후문 주차장 입구 (월전동)"),
    계화면("전북", "계화면", "전라북도", "전북 부안군 계화면 간재로 405 계화면사무소 옥상"),
    고산면("전북", "고산면", "전라북도", "전북 완주군 고산면 고산로 69-13 고산면주민자치센터 옥상"),
    고창읍("전북", "고창읍", "전라북도", "전북 고창군 고창읍 월곡공원1길 36 고창군여성회관"),
    관촌면("전북", "관촌면", "전라북도", "전북 임실군 관촌면 사선1길 13 관촌면 행정복지센터 옥상"),
    광활면("전북", "광활면", "전라북도", "전북 김제시 광활면 지평선로 638 광활면 화합관 옥상"),
    구이면("전북", "구이면", "전라북도", "전북 완주군 구이면 덕천전원길 232-58 술테마박물관 부지"),
    노송동("전북", "노송동", "전라북도", "전북 전주시 완산구 물왕멀3길 29 전주도시혁신센터 옥상 (서노송동)"),
    모현동("전북", "모현동", "전라북도", "전북 익산시 배산로 189-10 익산시 청소년문화의 집 옥상"),
    무주읍("전북", "무주읍", "전라북도", "전북 무주군 무주읍 향학로 49 무주읍사무소 옥상"),
    봉동읍("전북", "봉동읍", "전라북도", "전북 완주군 봉동읍 삼봉로 933 3층 옥외광장"),
    부안읍("전북", "부안읍", "전라북도", "전북 부안군 행안면 변산로 16 농업인 회관"),
    비응도동("전북", "비응도동", "전라북도", "전북 군산시 새만금북로 43 비응 119 안전센터 옥상 (비응도동)"),
    사정동("전북", "사정동", "전라북도", "전북 군산시 번영로 329 개정작은도서관 옥상 (사정동)"),
    삼기면("전북", "삼기면", "전라북도", "전북 익산시 삼기면 황금로 513 삼기면 행정복지센터 옥상"),
    삼천동("전북", "삼천동", "전라북도", "전북 전주시 완산구 용리로 107 삼천도서관 옥상"),
    소룡동("전북", "소룡동2", "전라북도", "전북 군산시 동장산2길 6 자동차융합기술원 연구실험동 옥상 (소룡동)"),
    송천동("전북", "송천동", "전라북도", "전북 전주시 덕진구 동부대로 1183 전주시 농수산물도매시장 관리동 (송천동2가)"),
    순창읍("전북", "순창읍", "전라북도", "전북 순창군 순창읍 경천로 33 순창군청 3층 옥상"),
    신태인("전북", "신태인", "전라북도", "전북 정읍시 신태인읍 신태인중앙로 40 신태인여성문화관 옥상"),
    신풍동_군산("전북", "신풍동(군산)", "전라북도", "전북 군산시 대학로 215 신풍동주민센터 옥상 (문화동)"),
    심원면("전북", "심원면", "전라북도", "전북 고창군 심원면 심원로 211 심원면사무소"),
    여산면("전북", "여산면", "전라북도", "전북 익산시 여산면 가람로 393 여산보건지소 옥상"),
    여의동("전북", "여의동", "전라북도", "전북 전주시 덕진구 여암2길 9 전주시립쪽구름도서관 옥상 (반월동) (반월동)"),
    연지동("전북", "연지동", "전라북도", "전북 정읍시 조곡천1길 7. 여성문화관 옥상 "),
    영파동("전북", "영파동", "전라북도", "전북 정읍시 영파동 232-1 정읍 공공하수처리시설 옥상 (영파동)"),
    옥산면("전북", "옥산면", "전라북도", "전북 군산시 옥산면 산성로 200 옥산면사무소 옥상"),
    요촌동("전북", "요촌동", "전라북도", "전북 김제시 요촌중길 50 요촌동 주민센터 옥상"),
    용동면("전북", "용동면", "전라북도", "전북 익산시 용동면 용동1길 80-4 용동복지회관 옥상"),
    운봉읍("전북", "운봉읍", "전라북도", "전북 남원시 운봉읍 황산로 1083 운봉읍 행정복지센터 옥상"),
    임실읍("전북", "임실읍", "전라북도", "전북 임실군 임실읍 운수로 33-50 청소년문화의집 옥상"),
    장수읍("전북", "장수읍", "전라북도", "전북 장수군 장수읍 호비로 10 장수군청 옥상"),
    죽항동("전북", "죽항동", "전라북도", "전북 남원시 비석길 72 죽항동주민센터 옥상 (죽항동)"),
    진안읍("전북", "진안읍", "전라북도", "전북 진안군 진안읍 진무로 1189 진안군 보건소 옥상"),
    춘포면("전북", "춘포면", "전라북도", "전북 익산시 춘포면 춘포2길 11 춘포보건지소 옥상"),
    팔복동("전북", "팔복동", "전라북도", "전북 전주시 덕진구 서귀로 107 청소년자유센터 옥상 (팔복동3가)"),
    팔봉동("전북", "팔봉동", "전라북도", "전북 익산시 무왕로 1338. 익산소방서 옥상"),
    함열읍("전북", "함열읍", "전라북도", "전북 익산시 함열읍 함열중앙로 83 익산시청 북부청사 옥상"),
    혁신동("전북", "혁신동", "전라북도", "전북 전주시 덕진구 중동로 150 공원 내 (장동)"),
    효자동("전북", "효자동", "전라북도", "전북 전주시 완산구 쑥고개로 259 (효자동2가) 전주역사박물관 옥상 (효자동2가)"),
    강정동("제주", "강정동", "제주특별자치도", "제주특별자치도 서귀포시 일주서로 166 제주특별자치도 유나이티드 연습구장 옆(지상) (강정동)"),
    남원읍("제주", "남원읍", "제주특별자치도", "제주특별자치도 서귀포시 남원읍 남한로 67 서귀포시 동부노인복지회관"),
    대정읍("제주", "대정읍", "제주특별자치도", "제주특별자치도 서귀포시 대정읍 동일하모로149번길 21-8 대정청소년수련관"),
    동홍동("제주", "동홍동", "제주특별자치도", "제주특별자치도 서귀포시 동홍동 453-1(서귀포소방서) 서귀포소방서"),
    성산읍("제주", "성산읍", "제주특별자치도", "제주특별자치도 서귀포시 성산읍 일주동로 4120번길 7 (동부소방서)"),
    애월읍("제주", "애월읍", "제주특별자치도", "제주특별자치도 제주시 애월읍 고내리 1319 애월근린공원 옆"),
    연동("제주", "연동", "제주특별자치도", "제주특별자치도 제주시 연동 322-1 번지 제주특별자치도청 제2청사 제주특별자치도청 제2청사 옥상"),
    이도동("제주", "이도동", "제주특별자치도", "제주특별자치도 제주시 이도2동 1176-1(제주시청) 제주시청"),
    조천읍("제주", "조천읍", "제주특별자치도", "제주특별자치도 제주시 조천읍 조천18길 11-1 조천읍 체육관"),
    한림읍("제주", "한림읍", "제주특별자치도", "제주특별자치도 제주시 한림읍 한림중앙로 71-9 한림읍 체육관"),
    화북동("제주", "화북동", "제주특별자치도", "제주특별자치도 제주시 화북일동 1098 지상 (화북일동)");

    private String stationRegion;
    private String stationName;
    private String region;
    private String address;

    StationType(String stationRegion, String stationName) {
        this.stationRegion = stationRegion;
        this.stationName = stationName;
    }

    StationType(String stationName) {
        this.stationName = stationName;
    }


    /**
     * 정확한 측정소 명으로 반환한다.
     * 만약 동일명이면 region도 체크한다.(airService에서)
     */
    public static List<StationType> getStationListByDong(String dong) {
        List<StationType> stationList = new ArrayList<>();

        for(StationType station : StationType.values()) {
            if(station.stationName.contains(dong)) {
                stationList.add(station);
            }
        }

        return stationList;
    }

    /**
     * 해당 지역의 측정소 목록을 반환한다.
     */
    public static List<StationType> getStationListByRegion(String region) {
        List<StationType> stationList = new ArrayList<>();

        for(StationType station : StationType.values()) {
            if(station.region.contains(region) ||
                station.stationRegion.contains(region)) {
                stationList.add(station);
            }
        }

        return stationList;
    }

    /**
     * 해당 지역의 측정소 목록중에 세부 주소가 같은 측정소 한개를 반환한다.
     */
    public static StationType getStation(List<StationType> stationList, String regionDetail) {
        for(StationType station : stationList) {
            if(station.stationName.contains(regionDetail)) {
                return station;
            }
        }

        return null;
    }

}
