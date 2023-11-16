insert into users
(user_id, email, password, nickname, user_type, address)
values
('100000', 'dd39@naver.com', '$2a$10$QZYcnoc9zSPWzkkGm1fJ9uJIZhMwBP7ji6bO4BRfTSpGVcksZiGQK', '관리자유녕', 'ROLE_ADMIN', '세종특별자치시 조치원읍 군청로 87-16(신흥동) 세종특별자치시 조치원청사 옥상'),
('100001', 'test@test.com', '$2a$10$QZYcnoc9zSPWzkkGm1fJ9uJIZhMwBP7ji6bO4BRfTSpGVcksZiGQK', '문홍웅', 'ROLE_USER', '서울 관악구 관악로 6길');


insert into airstation (station_id, station_region, region_detail, station_name)
values
('1', '서울', '강남구', '강남구'),
('2', '서울', '강동구', '강동구'),
('3', '서울', '강북구', '강북구'),
('4', '서울', '강서구', '강서구'),
('48', '경기', '오산시', '오산동'),
('49', '경기', '파주시', '운정'),
('50', '경기', '의정부시', '의정부동'),
('51', '경기', '이천시', '창전동'),
('57', '세종', '조치원', '신흥동');

-- insert into airstation (station_id, station_region, region_detail, station_name)
-- values
-- ('1', '서울', '강남구', '강남구'),
-- ('2', '서울', '강동구', '강동구'),
-- ('3', '서울', '강북구', '강북구'),
-- ('4', '서울', '강서구', '강서구'),
-- ('5', '서울', '관악구', '관악구'),
-- ('6', '서울', '광진구', '광진구'),
-- ('7', '서울', '구로구', '구로구'),
-- ('8', '서울', '금천구', '금천구'),
-- ('9', '서울', '노원구', '노원구'),
-- ('10', '서울', '도봉구', '도봉구'),
-- ('11', '서울', '동대문구', '동대문구'),
-- ('12', '서울', '동작구', '동작구'),
-- ('13', '서울', '마포구', '마포구'),
-- ('14', '서울', '서대문구', '서대문구'),
-- ('15', '서울', '서초구', '서초구'),
-- ('16', '서울', '성동구', '성동구'),
-- ('17', '서울', '성북구', '성북구'),
-- ('18', '서울', '송파구', '송파구'),
-- ('19', '서울', '양천구', '양천구'),
-- ('20', '서울', '영등포구', '영등포구'),
-- ('21', '서울', '용산구', '용산구'),
-- ('22', '서울', '은평구', '은평구'),
-- ('23', '서울', '종로구', '종로구'),
-- ('24', '서울', '중구', '중구'),
-- ('25', '서울', '중랑구', '중랑구'),
-- ('26', '경기', '안산시', '고잔동'),
-- ('27', '경기', '성남시', '수내동'),
-- ('28', '경기', '용인시', '수지'),
-- ('29', '경기', '수원시', '인계동'),
-- ('30', '경기', '고양시', '주엽동'),
-- ('31', '경기', '안양시', '부림동'),
-- ('32', '경기', '광주시', '경안동'),
-- ('33', '경기', '의왕시', '고천동'),
-- ('34', '경기', '김포시', '고촌읍'),
-- ('35', '경기', '과천시', '과천동'),
-- ('36', '경기', '구리시', '교문동'),
-- ('37', '경기', '남양주시', '금곡동'),
-- ('38', '경기', '부천시', '내동'),
-- ('39', '경기', '여주시', '대신면'),
-- ('40', '경기', '화성시', '동탄'),
-- ('41', '경기', '시흥시', '배곧동'),
-- ('42', '경기', '양주시', '백석읍'),
-- ('43', '경기', '동두천시', '보산동'),
-- ('44', '경기', '안성시', '봉산동'),
-- ('45', '경기', '군포시', '산본동'),
-- ('46', '경기', '포천시', '선단동'),
-- ('47', '경기', '하남시', '신장동'),
-- ('48', '경기', '오산시', '오산동'),
-- ('49', '경기', '파주시', '운정'),
-- ('50', '경기', '의정부시', '의정부동'),
-- ('51', '경기', '이천시', '창전동'),
-- ('52', '경기', '광명시', '철산동'),
-- ('53', '경기', '평택시', '평택항'),
-- ('54', '경기', '가평군', '가평'),
-- ('55', '경기', '양평군', '양평읍'),
-- ('56', '경기', '연천군', '연천'),
-- ('57', '세종', '조치원', '신흥동'),
-- ('58', '인천', '서구', '검단'),
-- ('59', '인천', '계양구', '계산'),
-- ('60', '인천', '남동구', '구월동'),
-- ('61', '인천', '연수구', '동춘'),
-- ('62', '인천', '부평구', '부평'),
-- ('63', '인천', '동구', '송림'),
-- ('64', '인천', '중구', '영종'),
-- ('65', '인천', '미추홀구', '주안'),
-- ('66', '강원', '강릉시', '주문진읍'),
-- ('67', '강원', '동해시', '천곡동'),
-- ('68', '강원', '삼척시', '남양동1'),
-- ('69', '강원', '속초시', '금호동'),
-- ('70', '강원', '원주시', '지정면'),
-- ('71', '강원', '춘천시', '중앙로'),
-- ('72', '강원', '태백시', '황지동'),
-- ('73', '강원', '고성군', '상리'),
-- ('74', '강원', '양구군', '양구읍'),
-- ('75', '강원', '양양군', '양양읍'),
-- ('76', '강원', '영월군', '영월읍'),
-- ('77', '강원', '인제군', '인제읍'),
-- ('78', '강원', '정선군', '정선읍'),
-- ('79', '강원', '철원군', '갈말읍'),
-- ('80', '강원', '평창군', '평창읍'),
-- ('81', '강원', '홍천군', '홍천읍'),
-- ('82', '강원', '화천군', '화천읍'),
-- ('83', '강원', '횡성군', '횡성읍'),
-- ('84', '광주', '북구', '두암동'),
-- ('85', '광주', '동구', '서석동'),
-- ('86', '광주', '광산구', '오선동'),
-- ('87', '광주', '서구', '유촌동'),
-- ('88', '광주', '남구', '주월동'),
-- ('89', '대구', '서구', '내당동'),
-- ('90', '대구', '남구', '대명동'),
-- ('91', '대구', '북구', '산격동'),
-- ('92', '대구', '동구', '서호동'),
-- ('93', '대구', '중구', '수창동'),
-- ('94', '대구', '수성구', '지산동'),
-- ('95', '대구', '달서구', '호림동'),
-- ('96', '대전', '유성구', '구성동'),
-- ('97', '대전', '동구', '대성동'),
-- ('98', '대전', '서구', '둔산동'),
-- ('99', '대전', '중구', '문창동'),
-- ('100', '대전', '대덕구', '읍내동'),
-- ('101', '부산', '중구', '광복동'),
-- ('102', '부산', '수영구', '광안동'),
-- ('103', '부산', '강서구', '녹산동'),
-- ('104', '부산', '사하구', '당리동'),
-- ('105', '부산', '서구', '대신동'),
-- ('106', '부산', '북구', '덕천동'),
-- ('107', '부산', '사상구', '덕포동'),
-- ('108', '부산', '동래구', '명장동'),
-- ('109', '부산', '금정구', '부곡동'),
-- ('110', '부산', '동구', '수정동'),
-- ('111', '부산', '연제구', '연산동'),
-- ('112', '부산', '남구', '용호동'),
-- ('113', '부산', '해운대구', '재송동'),
-- ('114', '부산', '부산진구', '전포동'),
-- ('115', '부산', '영도구', '태종대'),
-- ('116', '울산', '동구', '대송동'),
-- ('117', '울산', '남구', '야음동'),
-- ('118', '울산', '중구', '약사동'),
-- ('119', '울산', '북구', '효문동'),
-- ('120', '경남_경상남도', '창원시', '내서읍'),
-- ('121', '경남_경상남도', '거제시', '고현동'),
-- ('122', '경남_경상남도', '밀양시', '내일동'),
-- ('123', '경남_경상남도', '통영시', '무전동'),
-- ('124', '경남_경상남도', '양산시', '북부동'),
-- ('125', '경남_경상남도', '사천시', '사천읍'),
-- ('126', '경남_경상남도', '김해시', '삼방동'),
-- ('127', '경남_경상남도', '진주시', '상봉동'),
-- ('128', '경남_경상남도', '하동군', '하동읍'),
-- ('129', '경남_경상남도', '함안군', '가야읍'),
-- ('130', '경남_경상남도', '거창군', '거창읍'),
-- ('131', '경남_경상남도', '고성군', '고성읍'),
-- ('132', '경남_경상남도', '남해군', '남해읍'),
-- ('133', '경남_경상남도', '산청군', '산청읍'),
-- ('134', '경남_경상남도', '의령군', '의령읍'),
-- ('135', '경남_경상남도', '창녕군', '창녕읍'),
-- ('136', '경남_경상남도', '함양군', '함양읍'),
-- ('137', '경남_경상남도', '합천군', '합천읍'),
-- ('138', '경북_경상북도', '포항시', '장흥동'),
-- ('139', '경북_경상북도', '안동시', '명륜동'),
-- ('140', '경북_경상북도', '문경시', '문경시'),
-- ('141', '경북_경상북도', '상주시', '상주시'),
-- ('142', '경북_경상북도', '영주시', '영주동'),
-- ('143', '경북_경상북도', '영천시', '영천시'),
-- ('144', '경북_경상북도', '김천시', '율곡동'),
-- ('145', '경북_경상북도', '경산시', '중방동'),
-- ('146', '경북_경상북도', '구미시', '형곡동'),
-- ('147', '경북_경상북도', '경주시', '외동읍'),
-- ('148', '경북_경상북도', '고령군', '대가야읍'),
-- ('149', '경북_경상북도', '울릉군', '울릉읍'),
-- ('150', '경북_경상북도', '울진군', '울진군'),
-- ('151', '경북_경상북도', '예천군', '예천군'),
-- ('152', '경북_경상북도', '봉화군', '봉화군청'),
-- ('153', '경북_경상북도', '성주군', '성주군'),
-- ('154', '경북_경상북도', '영덕군', '영덕읍'),
-- ('155', '경북_경상북도', '영양군', '영양군'),
-- ('156', '경북_경상북도', '의성군', '의성읍'),
-- ('157', '경북_경상북도', '청송군', '청송읍'),
-- ('158', '경북_경상북도', '칠곡군', '칠곡군'),
-- ('159', '경북_경상북도', '청도군', '화양읍'),
-- ('160', '전남_전라남도', '여수시', '덕충동'),
-- ('161', '전남_전라남도', '나주시', '빛가람동'),
-- ('162', '전남_전라남도', '목포시', '용당동'),
-- ('163', '전남_전라남도', '순천시', '장천동'),
-- ('164', '전남_전라남도', '광양시', '태인동'),
-- ('165', '전남_전라남도', '강진군', '강진읍'),
-- ('166', '전남_전라남도', '고흥군', '고흥읍'),
-- ('167', '전남_전라남도', '곡성군', '곡성읍'),
-- ('168', '전남_전라남도', '구례군', '구례읍'),
-- ('169', '전남_전라남도', '담양군', '담양읍'),
-- ('170', '전남_전라남도', '무안군', '무안읍'),
-- ('171', '전남_전라남도', '보성군', '보성읍'),
-- ('172', '전남_전라남도', '신안군', '신안군'),
-- ('173', '전남_전라남도', '완도군', '신지면'),
-- ('174', '전남_전라남도', '영광군', '영광읍'),
-- ('175', '전남_전라남도', '영암군', '영암읍'),
-- ('176', '전남_전라남도', '장성군', '장성읍'),
-- ('177', '전남_전라남도', '장흥군', '장흥읍'),
-- ('178', '전남_전라남도', '진도군', '진도읍'),
-- ('179', '전남_전라남도', '함평군', '함평읍'),
-- ('180', '전남_전라남도', '해남군', '해남읍'),
-- ('181', '전남_전라남도', '환순군', '화순읍'),
-- ('182', '전북_전라북도', '군산시', '소룡동'),
-- ('183', '전북_전라북도', '전주시', '여의동'),
-- ('184', '전북_전라북도', '정읍시', '연지동'),
-- ('185', '전북_전라북도', '김제시', '요촌동'),
-- ('186', '전북_전라북도', '남원시', '죽항동'),
-- ('187', '전북_전라북도', '익산시', '함열읍'),
-- ('188', '전북_전라북도', '고창군', '고창읍'),
-- ('189', '전북_전라북도', '무주군', '무주읍'),
-- ('190', '전북_전라북도', '완주군', '봉동읍'),
-- ('191', '전북_전라북도', '부안군', '부안읍'),
-- ('192', '전북_전라북도', '순창군', '순창읍'),
-- ('193', '전북_전라북도', '임실군', '임실읍'),
-- ('194', '전북_전라북도', '장수군', '장수읍'),
-- ('195', '전북_전라북도', '진안군', '진안읍'),
-- ('196', '충남_충청남도', '공주시', '공주'),
-- ('197', '충남_충청남도', '논산시', '논산'),
-- ('198', '충남_충청남도', '당진시', '당진시청사'),
-- ('199', '충남_충청남도', '서산시', '독곶리'),
-- ('200', '충남_충청남도', '아산시', '둔포면'),
-- ('201', '충남_충청남도', '천안시', '성거읍'),
-- ('202', '충남_충청남도', '계룡시', '엄사면'),
-- ('203', '충남_충청남도', '보령시', '주교면'),
-- ('204', '충남_충청남도', '금산군', '금산읍'),
-- ('205', '충남_충청남도', '부여군', '부여읍'),
-- ('206', '충남_충청남도', '서천군', '서천읍'),
-- ('207', '충남_충청남도', '예산군', '예산군'),
-- ('208', '충남_충청남도', '청양군', '청양읍'),
-- ('209', '충남_충청남도', '태안군', '태안읍'),
-- ('210', '충남_충청남도', '홍성군', '홍성읍'),
-- ('211', '충북_충청북도', '청주시', '사천동'),
-- ('212', '충북_충청북도', '제천시', '장락동'),
-- ('213', '충북_충청북도', '충주시', '호암동'),
-- ('214', '충북_충청북도', '괴산군', '괴산읍'),
-- ('215', '충북_충청북도', '단양군', '단양읍'),
-- ('216', '충북_충청북도', '보은군', '보은읍'),
-- ('217', '충북_충청북도', '영동군', '영동읍'),
-- ('218', '충북_충청북도', '옥천군', '옥천읍'),
-- ('219', '충북_충청북도', '음성군', '음성읍'),
-- ('220', '충북_충청북도', '증평군', '증평읍'),
-- ('221', '충북_충청북도', '진천군', '진천읍'),
-- ('222', '제주', '서귀포시', '동홍동'),
-- ('223', '제주', '제주시', '이도동');