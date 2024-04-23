# SQL SORGU
## Hotel Table
### Table Creation
```
CREATE TABLE `hotel` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `star` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `property` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `address` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Hotel Table
```
INSERT INTO `hotel` (`id`, `name`, `star`, `property`, `address`, `phone`, `email`) VALUES
(62, 'UK', '* * * * *', '-Spa\n-Sauna\n-Havuz', 'Ankara', '555 555 55 55', 'uk@uk.com'),
(63, 'İnn 14', '* * * *', '-Spa\n-Sauna\n', 'Ankara', '500 500 50 00', 'inn14@inn14.com'),
(64, 'Sami HOTEL', '* * *', '-Ücretsiz Otopark', 'İstanbul', '550 550 55 00', 'samihotel@hotel.com'),
(65, 'Sultan HOTEL', '* * *', '-Ücretsiz Otopark', 'İstanbul', '505 505 05 50', 'sultanhotel@hotel.com'),
(66, 'Milenium', '* * * * *', '-Spa\n-Sauna\n-Havuz\n-Masaj Odası', 'İstanbul', '500 000 00 00', 'milenium@milenium.com');

```
## Type_Hotel Table
### Table Creation
```
CREATE TABLE `type_hotel` (
  `id` int NOT NULL,
  `type` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `hotel_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Type_Hotel Table
```
INSERT INTO `type_hotel` (`id`, `type`, `hotel_id`) VALUES
(10, 'Ultra Herşey Dahil', 62),
(11, 'Oda Kahvaltı', 62),
(12, 'Tam Pansiyon', 62),
(13, 'Ultra Herşey Dahil', 63),
(14, 'Oda Kahvaltı', 63),
(15, 'Tam Pansiyon', 63),
(16, 'Herşey Dahil', 64),
(17, 'Yarım Pansiyon', 64),
(18, 'Herşey Dahil', 65),
(19, 'Sadece Yatak', 65),
(20, 'Ultra Herşey Dahil', 66),
(21, 'Oda Kahvaltı', 66),
(22, 'Tam Pansiyon', 66),
(23, 'Alkol Hariç Full credit', 66);

```
## User Table
### Table Creation
```
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `uname` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `pass` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `type` enum('operator','admin','') COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for User Table
```
INSERT INTO `user` (`id`, `name`, `uname`, `pass`, `type`) VALUES
(6, 'Ali Batuhan ŞAHİN', 'Batuhan', '123', 'admin'),
(7, 'Beyzanur SARICAOĞLU', 'Beyza', '111', 'operator'),
(8, 'Doğanay SARIÇELEBİ', 'Doğanay', '222', 'admin'),
(9, 'Umutcan YILDIRIM', 'Umut', '333', 'admin'),
(10, 'Doğa Duru TÖZÜN', 'Duru', '321', 'admin');

```
## Room Table
### Table Creation
```
CREATE TABLE `room` (
  `id` int NOT NULL,
  `room_type` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `stock` int NOT NULL,
  `season_id` int NOT NULL,
  `adult_price` int NOT NULL,
  `child_price` int NOT NULL,
  `hotel_type_id` int NOT NULL,
  `hotel_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Room Table
```
INSERT INTO `room` (`id`, `room_type`, `stock`, `season_id`, `adult_price`, `child_price`, `hotel_type_id`, `hotel_id`) VALUES
(5, 'Single', 11, 7, 600, 450, 10, 62),
(6, 'Single', 7, 10, 500, 400, 13, 63),
(7, 'Single', 4, 11, 300, 150, 17, 64),
(8, 'Single', 6, 13, 100, 75, 19, 65),
(9, 'Suit', 2, 15, 950, 700, 20, 66);

```
## Room_Properties Table
### Table Creation
```
CREATE TABLE `room_properties` (
  `id` int NOT NULL,
  `property` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `room_id` int NOT NULL,
  `bed` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `area` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Room_Properties Table
```
INSERT INTO `room_properties` (`id`, `property`, `room_id`, `bed`, `area`) VALUES
(5, 'Televizyon \nMinibar \nKasa', 5, '1 Adet Çift kişilik Queen Yatak', 25),
(6, 'Televizyon \nMinibar \nKasa', 6, '1 Adet Çift kişilik Yatak', 20),
(7, 'Televizyon ', 7, 'Tek Kişilik Yatak', 10),
(8, 'Televizyon ', 8, 'Tek Kişilik Yatak', 10),
(9, 'Televizyon \nMinibar \nOyun Konsolu\nKasa\nProjeksiyon', 9, 'Queen Yatak', 45);

```
## Season Table
### Table Creation
```
CREATE TABLE `season` (
  `id` int NOT NULL,
  `season_start` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `season_end` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `hotel_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Season Table
```
INSERT INTO `season` (`id`, `season_start`, `season_end`, `hotel_id`) VALUES
(7, '15.05.2023', '15.10.2023', 62),
(8, '15.10.2023', '15.05.2024', 62),
(9, '15.05.2023', '15.10.2023', 63),
(10, '15.10.2023', '15.05.2024', 63),
(11, '15.05.2023', '15.10.2023', 64),
(12, '15.05.2023', '15.05.2024', 64),
(13, '15.05.2023', '15.10.2023', 65),
(14, '15.05.2023', '15.05.2024', 65),
(15, '15.05.2023', '15.10.2023', 66),
(16, '15.05.2023', '15.05.2024', 66);

```
## Reservation_Info Table
### Table Creation
```
CREATE TABLE `reservation_info` (
  `id` int NOT NULL,
  `client_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `client_phone` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `client_email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `client_note` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `room_id` int NOT NULL,
  `check_in` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `check_out` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `adult_numb` int NOT NULL,
  `child_numb` int NOT NULL,
  `total_price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
### Sample Data Inseriton for Reservation_Info Table
```
INSERT INTO `reservation_info` (`id`, `client_name`, `client_phone`, `client_email`, `client_note`, `room_id`, `check_in`, `check_out`, `adult_numb`, `child_numb`, `total_price`) VALUES
(7, 'Ali Batuhan ŞAHİN', '500 505 05 50', 'batuhan@batuhan.com', 'Otoparkta yer ayırtılmasını istiyorum', 9, '20.05.2023', '25.05.2023', 2, 0, 9500),
(8, 'Beyzanur SARICAOĞLU ŞAHİN', '500 005 50 05', 'beyza@beyza.com', 'Saat 15.00 da giriş yapacağım', 8, '15.05.2023', '20.05.2023', 1, 0, 500),
(9, 'Doğanay SARIÇELEBİ', '500 005 05 05', 'doğanay@doğanay.com', 'Saat 17.00\' da giriş yapacağım', 7, '15.05.2023', '20.05.2023', 2, 0, 3000),
(10, 'Umutcan YILDIRIM', '505 050 05 05', 'umut@umut.com', 'Otoparkta yer ayırtılmasını istiyorum.', 6, '15.05.2023', '20.05.2023', 1, 0, 2500),
(11, 'Doğa Duru Tözün', '500 500 50 50', 'duru@duru.com', 'Saat 16.00\'da giriş yapacağım', 5, '15.05.2023', '20.05.2023', 2, 0, 6000);

```
# ALİ BATUHAN ŞAHİN