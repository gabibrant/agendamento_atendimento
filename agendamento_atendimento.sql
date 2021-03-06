-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2016 at 09:25 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `agendamento_atendimento`
--
CREATE DATABASE IF NOT EXISTS `agendamento_atendimento` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `agendamento_atendimento`;

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `rg` varchar(45) DEFAULT NULL,
  `dataNasc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `rg_UNIQUE` (`rg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `habilidades`
--

DROP TABLE IF EXISTS `habilidades`;
CREATE TABLE IF NOT EXISTS `habilidades` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `habilidade` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `habilidades`
--

INSERT INTO `habilidades` (`id`, `habilidade`) VALUES
(1, 'Eletricista'),
(2, 'Bombeiro'),
(3, 'Pedreiro'),
(4, 'Limpador'),
(5, 'Outro');

-- --------------------------------------------------------

--
-- Table structure for table `materiais`
--

DROP TABLE IF EXISTS `materiais`;
CREATE TABLE IF NOT EXISTS `materiais` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `materiais`
--

INSERT INTO `materiais` (`id`, `nome`, `preco`) VALUES
(1, 'Fio de Cobre', 10.5),
(2, 'Chave de Fenda', 5);

-- --------------------------------------------------------

--
-- Table structure for table `materiais_orcamentos`
--

DROP TABLE IF EXISTS `materiais_orcamentos`;
CREATE TABLE IF NOT EXISTS `materiais_orcamentos` (
  `id_material` int(15) NOT NULL,
  `id_orcamento` int(15) NOT NULL,
  PRIMARY KEY (`id_material`,`id_orcamento`),
  KEY `id_orcamento_idx` (`id_orcamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `materiais_orcamentos`
--

INSERT INTO `materiais_orcamentos` (`id_material`, `id_orcamento`) VALUES
(1, 10),
(2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `orcamentos`
--

DROP TABLE IF EXISTS `orcamentos`;
CREATE TABLE IF NOT EXISTS `orcamentos` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `criacao` datetime DEFAULT NULL,
  `horasNecessarias` varchar(45) DEFAULT NULL,
  `prazoValidade` datetime DEFAULT NULL,
  `taxaISS` double DEFAULT NULL,
  `valorHora` double DEFAULT NULL,
  `valorTotal` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `orcamentos`
--

INSERT INTO `orcamentos` (`id`, `criacao`, `horasNecessarias`, `prazoValidade`, `taxaISS`, `valorHora`, `valorTotal`) VALUES
(10, NULL, '20', NULL, 0, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ordem_servico`
--

DROP TABLE IF EXISTS `ordem_servico`;
CREATE TABLE IF NOT EXISTS `ordem_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matr_tecnico` int(11) DEFAULT NULL,
  `habilidade` varchar(45) DEFAULT NULL,
  `cpf_cliente` varchar(45) DEFAULT NULL,
  `id_orcamento` int(15) DEFAULT NULL,
  `id_pagamento` int(15) DEFAULT NULL,
  `dataConclusao` datetime DEFAULT NULL,
  `observacao` tinytext,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cpf_idx` (`cpf_cliente`),
  KEY `matr_tecnico_idx` (`matr_tecnico`),
  KEY `id_orcamento_idx` (`id_orcamento`),
  KEY `id_pagamento_idx` (`id_pagamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
CREATE TABLE IF NOT EXISTS `pagamento` (
  `numRecibo` int(15) NOT NULL,
  `forma` varchar(45) DEFAULT NULL,
  `nomeInstituicao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`numRecibo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tecnicos`
--

DROP TABLE IF EXISTS `tecnicos`;
CREATE TABLE IF NOT EXISTS `tecnicos` (
  `matr` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `habilidade` int(15) DEFAULT NULL,
  PRIMARY KEY (`matr`),
  KEY `habilidade_idx` (`habilidade`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `tecnicos`
--

INSERT INTO `tecnicos` (`matr`, `nome`, `email`, `telefone`, `habilidade`) VALUES
(4, 'Olivia	', 'olivia@gmail.com', '99008877', 4),
(5, 'Pedro', 'pedro@uol.com.br', '88554433', 1),
(6, 'Pedro', 'pedro@hotmail.com', '12345678', 5);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `materiais_orcamentos`
--
ALTER TABLE `materiais_orcamentos`
  ADD CONSTRAINT `id_material` FOREIGN KEY (`id_material`) REFERENCES `materiais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_orcamento` FOREIGN KEY (`id_orcamento`) REFERENCES `orcamentos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ordem_servico`
--
ALTER TABLE `ordem_servico`
  ADD CONSTRAINT `cpf_cliente` FOREIGN KEY (`cpf_cliente`) REFERENCES `clientes` (`cpf`) ON UPDATE CASCADE,
  ADD CONSTRAINT `matr_tecnico` FOREIGN KEY (`matr_tecnico`) REFERENCES `tecnicos` (`matr`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tecnicos`
--
ALTER TABLE `tecnicos`
  ADD CONSTRAINT `habilidade` FOREIGN KEY (`habilidade`) REFERENCES `habilidades` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
