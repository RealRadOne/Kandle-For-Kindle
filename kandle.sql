-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 17, 2019 at 05:11 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kandle`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `BookID` varchar(5) NOT NULL,
  `BookName` text NOT NULL,
  `Points` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BookID`, `BookName`, `Points`) VALUES
('B0001', 'Abstract1', 120),
('B0002', 'Abstract2', 100);

-- --------------------------------------------------------

--
-- Table structure for table `dictionary`
--

CREATE TABLE `dictionary` (
  `WordID` varchar(5) NOT NULL,
  `Word` text NOT NULL,
  `Meaning` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dictionary`
--

INSERT INTO `dictionary` (`WordID`, `Word`, `Meaning`) VALUES
('W0001', 'bicker', 'to quarrel in a tiresome, insulting manner'),
('W0002', 'augend', 'a quantity to which another is added'),
('W0003', 'redolent', 'fragnant or aromatic'),
('W0004', 'ductile', 'capable of being pulled or stretched into thin wire by mechanical force without breaking'),
('W0005', 'divel', 'to separate into parts with force or sudden violence'),
('W0006', 'sappy', 'excessively sweet'),
('W0007', 'interject', 'to say as an interruption or aside'),
('W0008', 'extrinsic', 'external'),
('W0009', 'sizzle', 'to be exciting or dazzling'),
('W0010', 'envisage', 'to conceive or see something within one\'s mind');

-- --------------------------------------------------------

--
-- Table structure for table `goal`
--

CREATE TABLE `goal` (
  `UserID` varchar(5) NOT NULL,
  `BookID` varchar(5) NOT NULL,
  `StartDate` datetime NOT NULL,
  `EndDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `goal`
--

INSERT INTO `goal` (`UserID`, `BookID`, `StartDate`, `EndDate`) VALUES
('U0001', 'B0002', '2019-02-18 00:00:00', '2019-03-18 00:00:00'),
('U0002', 'B0001', '2019-03-01 00:00:00', '2019-03-31 00:00:00'),
('U0004', 'B0001', '2019-03-15 00:00:00', '2019-03-31 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `BookID` varchar(5) NOT NULL,
  `QuestionID` varchar(5) NOT NULL,
  `Question` text NOT NULL,
  `Option1` text NOT NULL,
  `Option2` text NOT NULL,
  `Option3` text NOT NULL,
  `Option4` text NOT NULL,
  `CorrectAnswer` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` varchar(5) NOT NULL,
  `Level` text NOT NULL,
  `KindlePoints` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Level`, `KindlePoints`) VALUES
('U0001', 'Beginner', 100),
('U0002', 'Intermediate', 180),
('U0003', 'Beginner', 120),
('U0004', 'Expert', 200),
('U0005', 'Intermediate', 150);

-- --------------------------------------------------------

--
-- Table structure for table `vocabulary`
--

CREATE TABLE `vocabulary` (
  `UserID` varchar(5) NOT NULL,
  `WordID` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vocabulary`
--

INSERT INTO `vocabulary` (`UserID`, `WordID`) VALUES
('U0001', 'W0002'),
('U0002', 'W0004'),
('U0002', 'W0005'),
('U0003', 'W0005'),
('U0004', 'W0002'),
('U0004', 'W0006'),
('U0005', 'W0004');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `dictionary`
--
ALTER TABLE `dictionary`
  ADD PRIMARY KEY (`WordID`);

--
-- Indexes for table `goal`
--
ALTER TABLE `goal`
  ADD PRIMARY KEY (`UserID`,`BookID`);

--
-- Indexes for table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`QuestionID`,`BookID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `vocabulary`
--
ALTER TABLE `vocabulary`
  ADD PRIMARY KEY (`UserID`,`WordID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
