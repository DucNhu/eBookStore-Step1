-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 21, 2020 lúc 02:05 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `sendbooks`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `books`
--

CREATE TABLE `books` (
  `BookID` varchar(50) DEFAULT NULL,
  `BookName` varchar(50) DEFAULT NULL,
  `Category` varchar(20) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `books`
--

INSERT INTO `books` (`BookID`, `BookName`, `Category`, `Author`, `Price`) VALUES
('CSS 3', 'CSS 4', 'TECHNOLOGI', 'DN', 40),
('CSS', 'CSS basic', 'TECHNOLOGI', 'DN', 40),
('CSS 3', 'CSS 3', 'TECHNOLOGI', 'DN', 20),
('CSS 4', 'CSS 4', 'TECHNOLOGI', 'DN', 40),
('HTML', 'HTML BASIC', 'TECHNOLOGI', 'DN', 50),
('HTML DOM', 'HTML DOM', 'TECHNOLOGI', 'DN', 60),
('HTML 5', 'HTML 5', 'TECHNOLOGI', 'DN', 70),
('JS', 'JAVA+ SCRIPT', 'TECHNOLOGI LANGUAGE', 'DN', 10),
('JAVA', 'JAVA BASIC', 'TECHNOLOGI LANGUAGE', 'DN', 100);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customers`
--

CREATE TABLE `customers` (
  `customersID` varchar(50) NOT NULL,
  `customersName` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `customers`
--

INSERT INTO `customers` (`customersID`, `customersName`, `Phone`) VALUES
('TH1', 'Mr.Lag', '12345'),
('TH12', 'Mr.Lagging', '123456789'),
('TH15', 'Mr.fixLag', '13579'),
('TH3', 'Mr.fixLag-bugs', '007-13579'),
('TH4', 'Mr.fixLag-bugs', '007-13579');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `oderbook`
--

CREATE TABLE `oderbook` (
  `orderID` varchar(50) DEFAULT NULL,
  `ordername` varchar(50) DEFAULT NULL,
  `orderBookname` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `orderTime` time DEFAULT NULL,
  `price` double DEFAULT NULL,
  `qty` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `oderbook`
--

INSERT INTO `oderbook` (`orderID`, `ordername`, `orderBookname`, `status`, `orderTime`, `price`, `qty`) VALUES
('TH1', 'Background', 'CSS 3', 5, '06:18:01', 120, 3),
('TH12', 'Background', 'HTML 5', 1, '06:18:01', 210, 3),
('TH3', 'display', 'JAVA BASIC', 0, '06:18:01', 200, 2),
('TH4', 'Background', 'CSS 4', 4, '06:18:01', 40, 1),
('TH15', 'mr.DN', 'JS', 5, '06:18:01', 50, 5);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customersID`);

--
-- Chỉ mục cho bảng `oderbook`
--
ALTER TABLE `oderbook`
  ADD KEY `orderID` (`orderID`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `oderbook`
--
ALTER TABLE `oderbook`
  ADD CONSTRAINT `oderbook_ibfk_1` FOREIGN KEY (`orderID`) REFERENCES `customers` (`customersID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
