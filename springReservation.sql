-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Apr 03, 2020 at 08:50 AM
-- Server version: 5.6.47
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springReservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `compra`
--

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `id_hotel` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_voo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `cidade` text NOT NULL,
  `nome` text NOT NULL,
  `descricao` text NOT NULL,
  `preco` float NOT NULL,
  `url_imagem` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nome` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `voo`
--

CREATE TABLE `voo` (
  `id` int(11) NOT NULL,
  `nomeEmp` text NOT NULL,
  `preco` float NOT NULL,
  `origem` text NOT NULL,
  `destino` text NOT NULL,
  `data_ida` date NOT NULL,
  `data_volta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_hotel` (`id_hotel`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_voo` (`id_voo`);

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `voo`
--
ALTER TABLE `voo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `voo`
--
ALTER TABLE `voo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `id_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`),
  ADD CONSTRAINT `id_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `id_voo` FOREIGN KEY (`id_voo`) REFERENCES `voo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
