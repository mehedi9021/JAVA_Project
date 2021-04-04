-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2020 at 08:07 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medical service application`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_information`
--

CREATE TABLE `doctor_information` (
  `Doctor_Name` varchar(200) NOT NULL,
  `Doctor_Phone` varchar(200) NOT NULL,
  `Doctor_Gender` varchar(200) NOT NULL,
  `Professional_Degree` varchar(200) NOT NULL,
  `Xpert_In` varchar(200) NOT NULL,
  `Password` varchar(2000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `patient_information`
--

CREATE TABLE `patient_information` (
  `pname` varchar(200) NOT NULL,
  `pphone` varchar(200) NOT NULL,
  `page` varchar(200) NOT NULL,
  `pgender` varchar(200) NOT NULL,
  `dphone` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  `pprb` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `patient_solution`
--

CREATE TABLE `patient_solution` (
  `date` varchar(200) NOT NULL,
  `pphone` varchar(200) NOT NULL,
  `pname` varchar(200) NOT NULL,
  `psolution` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
