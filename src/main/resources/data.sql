
insert into VAI_TRO(TEN_VAI_TRO) values ('USER');
insert into VAI_TRO(TEN_VAI_TRO) values ('ADMIN');

insert into TAI_KHOAN(TEN_TAI_KHOAN, EMAIL, NICK_NAME, MAT_KHAU, SDT,MA_XAC_NHAN, MA_VAI_TRO, HOAT_DONG) 
values('user2','test@gmail.com',N'Hoàng 2','E10ADC3949BA59ABBE56E057F20F883E', '987654321', 266474, 1, 1);
insert into TAI_KHOAN(TEN_TAI_KHOAN, EMAIL, NICK_NAME, MAT_KHAU, SDT,MA_XAC_NHAN, MA_VAI_TRO, HOAT_DONG) 
values('user3','test22@gmail.com',N'Hoàng 3','E10ADC3949BA59ABBE56E057F20F883E', '555555555', 221115, 1, 1);
insert into TAI_KHOAN(TEN_TAI_KHOAN, EMAIL, NICK_NAME, MAT_KHAU, SDT,MA_XAC_NHAN, MA_VAI_TRO, HOAT_DONG) 
values('user4','test21@gmail.com',N'Hoàng 4','E10ADC3949BA59ABBE56E057F20F883E', '55555554455', 845411, 2, 1);
insert into TAI_KHOAN(TEN_TAI_KHOAN, EMAIL, NICK_NAME, MAT_KHAU, SDT,MA_XAC_NHAN, MA_VAI_TRO, HOAT_DONG) 
values('user5','test221@gmail.com',N'Hoàng 5','E10ADC3949BA59ABBE56E057F20F883E', '555555545455', 994515, 2, 1);

insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Vũng Tàu',N'user_page/img/VungTau1.jpg')
insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Đà Lạt',N'user_page/img/DaLat1.jpg')
insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Huế',N'user_page/img/Hue1.jpg')
insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Tp. Hồ Chí Minh',N'user_page/img/HCM1.jpg')
insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Hà Nội',N'user_page/img/HaNoi1.jpg')
insert into DIA_DIEM(TEN_DIA_DIEM,HINH_ANH) VALUES (N'Đà Nẵng',N'user_page/img/DangNang1.jpg')

insert into KHACH_SAN(TEN_KHACH_SAN,MA_DIA_DIEM,VI_TRI,TIEN_ICH,HINH_ANH,HOAT_DONG) VALUES (N'Eastin Grand Hotell The Maris Vung Tau',1,N'https://www.google.com/maps/d/u/0/edit?mid=1O0bAuF9j6C8hOsrQSaM3qDI81Rs11Xo&ll=10.380079492726816%2C107.12671150431231&z=17',N'160 Ba Tháng Hai, Phường 10, Thành phố Vũng Tầu, Bà Rịa - Vũng Tàu 78000 +84 90 272 00 61',N'user_page/img/VungTau1.jpg',1)
insert into KHACH_SAN(TEN_KHACH_SAN,MA_DIA_DIEM,VI_TRI,TIEN_ICH,HINH_ANH,HOAT_DONG) VALUES (N'Hafi Hotel and Restaurant',1,N'https://www.google.com/maps/d/u/0/edit?mid=1O0bAuF9j6C8hOsrQSaM3qDI81Rs11Xo&ll=10.380079492726816%2C107.12671150431231&z=17',N'160 Ba Tháng Hai, Phường 10, Thành phố Vũng Tầu, Bà Rịa - Vũng Tàu 78000 +84 90 272 00 61',N'user_page/img/VungTau1.jpg',1)
insert into KHACH_SAN(TEN_KHACH_SAN,MA_DIA_DIEM,VI_TRI,TIEN_ICH,HINH_ANH,HOAT_DONG) VALUES (N'Petrosetco Vũng Tàu',1, N'https://www.google.com/maps/d/u/0/edit?mid=1O0bAuF9j6C8hOsrQSaM3qDI81Rs11Xo&ll=10.380079492726816%2C107.12671150431231&z=17',N'160 Ba Tháng Hai, Phường 10, Thành phố Vũng Tầu, Bà Rịa - Vũng Tàu 78000 +84 90 272 00 61',N'user_page/img/VungTau1.jpg',1)

insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,2,N'Phòng 01',N'Wifi miễn phí, phục vụ tốt',1)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,3,N'Phòng 02',N'Wifi miễn phí, phục vụ tốt',1)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,4,N'Phòng 03',N'Wifi miễn phí, phục vụ tốt',1)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,1,N'Phòng 04',N'Wifi miễn phí, phục vụ tốt',1)

insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,2,N'Phòng 01',N'Wifi miễn phí, phục vụ tốt',2)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,3,N'Phòng 02',N'Wifi miễn phí, phục vụ tốt',2)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,4,N'Phòng 03',N'Wifi miễn phí, phục vụ tốt',2)
insert into PHONG(HOAT_DONG,SO_NGUOI,TEN_PHONG,TIEN_ICH,MA_KHACH_SAN) VALUES(1,1,N'Phòng 04',N'Wifi miễn phí, phục vụ tốt',2)
