-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 21, 2014 at 04:16 PM
-- Server version: 5.1.33
-- PHP Version: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `product`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_01`
--

DROP TABLE IF EXISTS `admin_01`;
CREATE TABLE IF NOT EXISTS `admin_01` (
  `primary_key` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`primary_key`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `admin_01`
--

INSERT INTO `admin_01` (`primary_key`, `admin_name`, `password`) VALUES(1, 'NABIL SARWAR', 'black');
INSERT INTO `admin_01` (`primary_key`, `admin_name`, `password`) VALUES(2, 'ASHAD OPU', 'opu');

-- --------------------------------------------------------

--
-- Table structure for table `sales_man`
--

DROP TABLE IF EXISTS `sales_man`;
CREATE TABLE IF NOT EXISTS `sales_man` (
  `primary_key` int(11) NOT NULL AUTO_INCREMENT,
  `sales_man_id` int(11) NOT NULL,
  `sales_man_name` varchar(256) NOT NULL,
  `sales_man_password` varchar(256) NOT NULL,
  `date` varchar(256) NOT NULL,
  PRIMARY KEY (`primary_key`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `sales_man`
--

INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(12, 6, 'ABDUL RAHIM', 'rahim', 'Oct 16,2014');
INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(4, 3, 'ASHAD OPU', 'opu', 'Oct 01,2014');
INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(11, 5, 'ABDUL KARIM', 'karim', 'Oct 16,2014');
INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(9, 7, 'NABIL SARWAR', 'black', 'Oct 08,2014');
INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(10, 1, 'ASHAD ', 'QWERTY', 'Oct 16,2014');
INSERT INTO `sales_man` (`primary_key`, `sales_man_id`, `sales_man_name`, `sales_man_password`, `date`) VALUES(14, 9, 'ABDUL KARIM MIA', 'qwerty', 'Oct 16,2014');

-- --------------------------------------------------------

--
-- Table structure for table `table_01`
--

DROP TABLE IF EXISTS `table_01`;
CREATE TABLE IF NOT EXISTS `table_01` (
  `primary_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` double NOT NULL,
  `product_name` varchar(256) NOT NULL DEFAULT 'NULL',
  `unit_price` double NOT NULL DEFAULT '0',
  `stock` int(11) NOT NULL DEFAULT '0',
  `date` varchar(256) NOT NULL,
  PRIMARY KEY (`primary_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=96 ;

--
-- Dumping data for table `table_01`
--

INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(15, 2, 'khata', 20, 672, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(91, 34, 'TOOTHBRUSH', 56, 100, 'Oct 16,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(19, 6, 'mr.mango', 70, 10, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(21, 8, 'lab khata', 50, 82, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(22, 10, 'chips', 15, 89, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(23, 11, 'corneli', 50, 63, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(25, 13, 'sprite', 30, 26, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(26, 14, 'blade', 2, 55, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(27, 15, 'mountain dew', 35, 29, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(28, 16, 'pen', 10, 117, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(29, 17, 'pencil', 10, 94, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(30, 18, 'sandwich', 20, 83, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(31, 19, 'paracitamol', 10, 10, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(32, 20, 'black', 15, 100, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(33, 21, 'GOLDLEAF', 6, 100, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(34, 22, 'FILE', 15, 34, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(94, 3, 'Cereal', 45, 100, 'Oct 16,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(38, 26, 'SEZAN_JUICE', 16, 78, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(39, 27, 'AIR_FRESHNER', 34, 39, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(40, 28, 'CLEMON', 45, 78, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(41, 29, 'HORLICKS', 400, 45, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(42, 30, 'SAVLON', 78, 3, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(43, 31, 'LUX SOAP', 45, 50, '0Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(44, 32, 'MOJO', 24, 45, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(46, 35, 'PRAN', 220, 48, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(48, 36, 'COFFEE', 45, 56, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(49, 37, 'COMB', 56, 89, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(50, 38, 'RUBBER', 5, 56, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(52, 40, 'BRUSH', 34, 99, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(54, 42, 'NOODLES', 20, 56, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(56, 44, 'MIRINDA', 35, 21, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(60, 48, 'BUTTER BON', 6, 65, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(61, 49, 'DAIRY MILK', 10, 15, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(62, 50, 'T-SCALE', 120, 10, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(63, 51, 'SUPER GLUE', 20, 20, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(64, 52, 'LAB PAD', 50, 200, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(66, 54, 'PRAN DAL', 8, 46, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(69, 56, 'BALL', 34, 7, 'Sep 29,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(90, 90, 'MOBILE', 45, 100, 'Oct 15,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(95, 45, 'Fresh Water 3 liter', 56, 100, 'Oct 16,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(93, 1, 'Tomato Sauce', 57, 100, 'Oct 16,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(84, 408, 'MULTIPLUG', 67, 23, 'Oct 03,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(88, 57, 'CUP', 45, 100, 'Oct 08,2014');
INSERT INTO `table_01` (`primary_id`, `product_id`, `product_name`, `unit_price`, `stock`, `date`) VALUES(89, 58, 'PEPSI', 89, 100, 'Oct 08,2014');
