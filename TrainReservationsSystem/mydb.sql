-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 22, 2016 at 11:26 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24
Create database mydb;
use mydb;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `psgId` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `tel_no` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`psgId`, `username`, `password`, `firstname`, `lastname`, `address`, `tel_no`, `email`) VALUES
(1, 'Film', '12345', 'Filmm', 'Tana', '80/1,WichitSongklam road,Village No.1,Kathu, Phuket 83120', '0833919391', 'film@live.com'),
(2, 'Fang@live.com', '12345', 'Sutita', 'Saraya', NULL, '0822341122', 'Fang@live.com'),
(3, 'pop@live.com', '12345', 'Tunyared', 'Khiawthong', NULL, '083123445', 'poppy@live.com');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `paymentId` varchar(45) NOT NULL,
  `ticketId` varchar(45) DEFAULT NULL,
  `card_number` varchar(16) NOT NULL,
  `card_name` varchar(45) NOT NULL,
  `exp_month` varchar(2) NOT NULL,
  `exp_year` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`paymentId`, `ticketId`, `card_number`, `card_name`, `exp_month`, `exp_year`) VALUES
('1', '1', 'Film Tanawat', '1234567812345642', '02', '2017'),
('2', '2', 'Film Tanawat', '1234567812345642', '02', '2017');

-- --------------------------------------------------------

--
-- Table structure for table `ticketinfo`
--

CREATE TABLE `ticketinfo` (
  `ticketId` int(11) NOT NULL,
  `psgId` int(11) NOT NULL,
  `train_travelId` int(11) NOT NULL,
  `departure_date` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `psgQuantity` int(11) NOT NULL,
  `priceAll` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ticketinfo`
--

INSERT INTO `ticketinfo` (`ticketId`, `psgId`, `train_travelId`, `departure_date`, `status`, `psgQuantity`, `priceAll`) VALUES
(1, 1, 1, '17-Dec-2016', 'Seccess ..', 1, 180),
(2, 1, 18, '18-Dec-2016', 'Seccess ..', 1, 240),
(3, 3, 17, '18-Dec-2016', 'Seccess ..', 1, 240),
(4, 3, 28, '19-Dec-2016', 'Seccess ..', 1, 240),
(5, 3, 39, '20-Dec-2016', 'Seccess ..', 1, 170),
(6, 3, 50, '21-Dec-2016', 'Seccess ..', 1, 170);

-- --------------------------------------------------------

--
-- Table structure for table `train`
--

CREATE TABLE `train` (
  `train_travelId` int(11) NOT NULL,
  `trainId` int(11) DEFAULT NULL,
  `trainname` varchar(45) DEFAULT NULL,
  `from_location` varchar(45) DEFAULT NULL,
  `to_location` varchar(45) DEFAULT NULL,
  `departure_time` varchar(45) DEFAULT NULL,
  `arrival_time` varchar(45) DEFAULT NULL,
  `duration` varchar(45) DEFAULT NULL,
  `total_seat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `train`
--

INSERT INTO `train` (`train_travelId`, `trainId`, `trainname`, `from_location`, `to_location`, `departure_time`, `arrival_time`, `duration`, `total_seat`) VALUES
(1, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(2, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(3, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(4, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(5, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(6, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(7, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(8, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(9, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(10, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(11, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(12, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(13, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(14, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(15, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(16, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(17, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(18, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(19, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(20, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(21, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(22, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(23, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(24, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(25, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(26, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(27, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(28, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(29, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(30, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(31, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(32, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(33, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(34, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(35, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(36, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(37, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(38, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(39, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(40, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(41, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(42, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(43, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(44, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(45, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(46, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(47, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(48, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(49, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(50, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(51, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(52, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(53, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(54, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(55, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(56, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(57, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(58, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(59, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(60, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(61, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(62, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(63, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(64, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(65, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(66, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(67, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(68, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(69, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(70, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(71, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(72, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(73, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(74, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(75, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(76, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(77, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(78, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(79, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(80, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(81, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(82, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(83, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(84, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(85, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(86, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(87, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(88, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(89, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(90, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80),
(91, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '8.00', '9.30', '1.30', 80),
(92, 2, 'Trep Train', 'Phuket', 'Phang-nga', '8.30', '9.30', '1.00', 65),
(93, 3, 'Redondo Train', 'Phuket', 'Krabi', '9.00', '10.00', '1.00', 80),
(94, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '1.30', 80),
(95, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '1.00', 65),
(96, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '1.30', 80),
(97, 4, 'Sri Trang Train', 'Phuket ', 'Trang', '8.00', '11.00', '3.00', 80),
(98, 4, 'Sri Trang Train', 'Trang', 'Phuket', '13.00', '16.00', '3.00', 80),
(99, 5, 'Anda Train', 'Phuket', 'Ranong', '8.45', '10.45', '2.00', 80),
(100, 5, 'Anda Train', 'Ranong', 'Phuket', '12.45', '14.45', '2.00', 80);

-- --------------------------------------------------------

--
-- Table structure for table `train_detail`
--

CREATE TABLE `train_detail` (
  `train_travelId` int(11) NOT NULL,
  `departure_date` varchar(45) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `available_seat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `train_detail`
--

INSERT INTO `train_detail` (`train_travelId`, `departure_date`, `price`, `available_seat`) VALUES
(1, '17-Dec-2016', 180, 80),
(2, '17-Dec-2016', 110, 65),
(3, '17-Dec-2016', 110, 80),
(4, '17-Dec-2016', 180, 80),
(5, '17-Dec-2016', 110, 65),
(6, '17-Dec-2016', 110, 80),
(7, '17-Dec-2016', 240, 80),
(8, '17-Dec-2016', 240, 80),
(9, '17-Dec-2016', 170, 80),
(10, '17-Dec-2016', 170, 80),
(11, '18-Dec-2016', 180, 80),
(12, '18-Dec-2016', 110, 65),
(13, '18-Dec-2016', 110, 80),
(14, '18-Dec-2016', 180, 80),
(15, '18-Dec-2016', 110, 65),
(16, '18-Dec-2016', 110, 80),
(17, '18-Dec-2016', 240, 80),
(18, '18-Dec-2016', 240, 80),
(19, '18-Dec-2016', 170, 80),
(20, '18-Dec-2016', 170, 80),
(21, '19-Dec-2016', 180, 80),
(22, '19-Dec-2016', 110, 65),
(23, '19-Dec-2016', 110, 80),
(24, '19-Dec-2016', 180, 80),
(25, '19-Dec-2016', 110, 65),
(26, '19-Dec-2016', 110, 80),
(27, '19-Dec-2016', 240, 80),
(28, '19-Dec-2016', 240, 80),
(29, '19-Dec-2016', 170, 80),
(30, '19-Dec-2016', 170, 80),
(31, '20-Dec-2016', 180, 80),
(32, '20-Dec-2016', 110, 65),
(33, '20-Dec-2016', 110, 80),
(34, '20-Dec-2016', 180, 80),
(35, '20-Dec-2016', 110, 65),
(36, '20-Dec-2016', 110, 80),
(37, '20-Dec-2016', 240, 80),
(38, '20-Dec-2016', 240, 80),
(39, '20-Dec-2016', 170, 80),
(40, '20-Dec-2016', 170, 80),
(41, '21-Dec-2016', 180, 80),
(42, '21-Dec-2016', 110, 65),
(43, '21-Dec-2016', 110, 80),
(44, '21-Dec-2016', 180, 80),
(45, '21-Dec-2016', 110, 65),
(46, '21-Dec-2016', 110, 80),
(47, '21-Dec-2016', 240, 80),
(48, '21-Dec-2016', 240, 80),
(49, '21-Dec-2016', 170, 80),
(50, '21-Dec-2016', 170, 80),
(51, '22-Dec-2016', 180, 80),
(52, '22-Dec-2016', 110, 65),
(53, '22-Dec-2016', 110, 80),
(54, '22-Dec-2016', 180, 80),
(55, '22-Dec-2016', 110, 65),
(56, '22-Dec-2016', 110, 80),
(57, '22-Dec-2016', 240, 80),
(58, '22-Dec-2016', 240, 80),
(59, '22-Dec-2016', 170, 80),
(60, '22-Dec-2016', 170, 80),
(61, '23-Dec-2016', 180, 80),
(62, '23-Dec-2016', 110, 65),
(63, '23-Dec-2016', 110, 80),
(64, '23-Dec-2016', 180, 80),
(65, '23-Dec-2016', 110, 65),
(66, '23-Dec-2016', 110, 80),
(67, '23-Dec-2016', 240, 80),
(68, '23-Dec-2016', 240, 80),
(69, '23-Dec-2016', 170, 80),
(70, '23-Dec-2016', 170, 80),
(71, '24-Dec-2016', 180, 80),
(72, '24-Dec-2016', 110, 65),
(73, '24-Dec-2016', 110, 80),
(74, '24-Dec-2016', 180, 80),
(75, '24-Dec-2016', 110, 65),
(76, '24-Dec-2016', 110, 80),
(77, '24-Dec-2016', 240, 80),
(78, '24-Dec-2016', 240, 80),
(79, '24-Dec-2016', 170, 80),
(80, '24-Dec-2016', 170, 80),
(81, '25-Dec-2016', 180, 80),
(82, '25-Dec-2016', 110, 65),
(83, '25-Dec-2016', 110, 80),
(84, '25-Dec-2016', 180, 80),
(85, '25-Dec-2016', 110, 65),
(86, '25-Dec-2016', 110, 80),
(87, '25-Dec-2016', 240, 80),
(88, '25-Dec-2016', 240, 80),
(89, '25-Dec-2016', 170, 80),
(90, '25-Dec-2016', 170, 80),
(91, '26-Dec-2016', 180, 80),
(92, '26-Dec-2016', 110, 65),
(93, '26-Dec-2016', 110, 80),
(94, '26-Dec-2016', 180, 80),
(95, '26-Dec-2016', 110, 65),
(96, '26-Dec-2016', 110, 80),
(97, '26-Dec-2016', 240, 80),
(98, '26-Dec-2016', 240, 80),
(99, '26-Dec-2016', 170, 80),
(100, '26-Dec-2016', 170, 80);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`psgId`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`paymentId`);

--
-- Indexes for table `ticketinfo`
--
ALTER TABLE `ticketinfo`
  ADD PRIMARY KEY (`ticketId`);

--
-- Indexes for table `train`
--
ALTER TABLE `train`
  ADD PRIMARY KEY (`train_travelId`);

--
-- Indexes for table `train_detail`
--
ALTER TABLE `train_detail`
  ADD PRIMARY KEY (`train_travelId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
