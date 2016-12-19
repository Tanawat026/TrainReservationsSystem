-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2016 at 06:21 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

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
(1, 'Film', '12345', 'Filmm', 'Tana', '80/1,WichitSongklam road,Village No.1,Kathu, Phuket 83120', '0833919391', 'film@live.com');

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
('1', '1', 'Film tt', '123456789123456', '02', '2017');

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
(1, 1, 1, '20-Dec-2016', 'Seccess ..', 1, 150);

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
(1, 1, 'Sai Bai Train', 'Phuket', 'Suratthani', '08.00', '09.30', '01.30', 80),
(2, 2, 'Trep Train', 'Phuket', 'Phang-nga', '08.30', '09.30', '01.00', 65),
(3, 3, 'Redondo Train', 'Phuket', 'Krabi', '09.00', '10.00', '01.00', 80),
(4, 1, 'Sai Bai Train', 'Suratthani', 'Phuket', '11.30', '13.00', '01.30', 80),
(5, 2, 'Trep Train', 'Phang-nga', 'Phuket', '10.30', '11.30', '01.00', 65),
(6, 3, 'Redondo Train', 'Krabi', 'Phuket', '11.00', '12.00', '01.30', 80);

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
(1, '20-Dec-2016', 150, 80),
(2, '20-Dec-2016', 110, 65),
(3, '20-Dec-2016', 120, 80),
(4, '20-Dec-2016', 150, 80),
(5, '20-Dec-2016', 110, 65),
(6, '20-Dec-2016', 120, 80);

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
