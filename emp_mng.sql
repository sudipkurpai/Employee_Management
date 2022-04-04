-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2022 at 07:10 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emp_mng`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `sl` int(11) NOT NULL,
  `mng_id` varchar(20) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`sl`, `mng_id`, `fname`, `lname`, `Phone`, `email`, `Password`, `status`) VALUES
(1, '123', 'Sudip', 'Maiti', '9134456790', 'maitiakash2018@gmail.com ', 'Sudip@123', 1),
(2, '1111', 'akash', 'maiti', '9134456790', 'sudip.maiti11@gmail.com', '1111', 1);

-- --------------------------------------------------------

--
-- Table structure for table `cus`
--

CREATE TABLE `cus` (
  `cus_id` varchar(20) NOT NULL,
  `cus_fname` varchar(100) NOT NULL,
  `cus_lname` varchar(100) NOT NULL,
  `cus_ph` varchar(20) NOT NULL,
  `cus_eml` varchar(50) NOT NULL,
  `cus_adde` varchar(300) NOT NULL,
  `cus_servic` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cus`
--

INSERT INTO `cus` (`cus_id`, `cus_fname`, `cus_lname`, `cus_ph`, `cus_eml`, `cus_adde`, `cus_servic`) VALUES
('ERP_C1001', 'Jay', 'Maa Tata', '121', 'ds@122', 'sdsdf', 'dfsdfsdf');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `emp_id` varchar(20) NOT NULL,
  `emp_fname` varchar(100) NOT NULL,
  `emp_lname` varchar(100) NOT NULL,
  `emp_phone` varchar(20) NOT NULL,
  `emp_email` varchar(50) NOT NULL,
  `emp_address` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`emp_id`, `emp_fname`, `emp_lname`, `emp_phone`, `emp_email`, `emp_address`) VALUES
('ERP_E1003', 'Sudip', 'Akash', '123', 'a@b', 'kurpai'),
('ERP_E1004', 'Wow', 'Momo', 'n00', 'No@gmil', 'ssadsad'),
('ERP_E1005', 'Mr.', ' Developer', '3534534', 'csd@123', 'asdasdfas');

-- --------------------------------------------------------

--
-- Table structure for table `emp_works`
--

CREATE TABLE `emp_works` (
  `emp_id` varchar(20) NOT NULL,
  `emp_name` varchar(200) NOT NULL,
  `cous_id` varchar(20) NOT NULL,
  `cous_name` varchar(200) NOT NULL,
  `date` varchar(20) NOT NULL,
  `time` varchar(20) NOT NULL,
  `service_dtl` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emp_works`
--

INSERT INTO `emp_works` (`emp_id`, `emp_name`, `cous_id`, `cous_name`, `date`, `time`, `service_dtl`) VALUES
('ERP_E1004', 'ami', '1111', 'tumi', '23/02/2022', '22:22:33', 'sddvasasbxdaszxdn baxcxmcm, zm,.dfzsdc asoaghxcolvidfo pvsd vcklfbdfvfdsvop;\'sdfjp\'sdk.adhia\'pjl/faemne'),
('a@b', 'ami', 'ERP_C1001', 'tumi', '26/02/2022', '22:77:111', 'fafdfguysauhsvdluisdffsdgsduiosdjdfgelisdfguifduhdfshioggfsd;uo');

-- --------------------------------------------------------

--
-- Table structure for table `id_store`
--

CREATE TABLE `id_store` (
  `emp_id` int(11) NOT NULL,
  `cus_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `id_store`
--

INSERT INTO `id_store` (`emp_id`, `cus_id`) VALUES
(1005, 1001);

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE `session` (
  `mng_id` varchar(20) NOT NULL,
  `mng_name` varchar(200) NOT NULL,
  `mng_email` varchar(50) NOT NULL,
  `mng_ph` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`mng_id`, `mng_name`, `mng_email`, `mng_ph`) VALUES
('1111', 'akash maiti', 'sudip.maiti11@gmail.com', '9134456790');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`sl`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `sl` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
