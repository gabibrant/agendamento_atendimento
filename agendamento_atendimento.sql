-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2016 at 05:49 AM
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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
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
-- Table structure for table `materiais_orcamento`
--

DROP TABLE IF EXISTS `materiais_orcamento`;
CREATE TABLE IF NOT EXISTS `materiais_orcamento` (
  `id_material` int(15) NOT NULL,
  `id_orcamento` int(15) NOT NULL,
  PRIMARY KEY (`id_material`,`id_orcamento`),
  KEY `id_orcamento_idx` (`id_orcamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `id` int(15) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `quantidade` int(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `orcamento`
--

DROP TABLE IF EXISTS `orcamento`;
CREATE TABLE IF NOT EXISTS `orcamento` (
  `id` int(15) NOT NULL,
  `criacao` datetime DEFAULT NULL,
  `horasNecessarias` varchar(45) DEFAULT NULL,
  `prazoValidade` datetime DEFAULT NULL,
  `taxaISS` double DEFAULT NULL,
  `valorHora` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Table structure for table `tecnico`
--

DROP TABLE IF EXISTS `tecnico`;
CREATE TABLE IF NOT EXISTS `tecnico` (
  `matr` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `habilidade` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`matr`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tecnico`
--

INSERT INTO `tecnico` (`matr`, `nome`, `email`, `telefone`, `habilidade`) VALUES
(2, 'José da Silva', 'josesilva@gmail.com', '99887766', 'Bombeiro');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `materiais_orcamento`
--
ALTER TABLE `materiais_orcamento`
  ADD CONSTRAINT `id_material` FOREIGN KEY (`id_material`) REFERENCES `material` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `id_orcamento` FOREIGN KEY (`id_orcamento`) REFERENCES `orcamento` (`id`) ON UPDATE CASCADE;

--
-- Constraints for table `ordem_servico`
--
ALTER TABLE `ordem_servico`
  ADD CONSTRAINT `cpf_cliente` FOREIGN KEY (`cpf_cliente`) REFERENCES `cliente` (`cpf`) ON UPDATE CASCADE,
  ADD CONSTRAINT `matr_tecnico` FOREIGN KEY (`matr_tecnico`) REFERENCES `tecnico` (`matr`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
