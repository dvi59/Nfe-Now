-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06/09/2023 às 21:52
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `nfedb`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `nfe`
--

CREATE TABLE `nfe` (
  `cnpj` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nrSerie` varchar(255) DEFAULT NULL,
  `razaoSocial` varchar(255) DEFAULT NULL,
  `valor` double NOT NULL,
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `nfe`
--

INSERT INTO `nfe` (`cnpj`, `endereco`, `nrSerie`, `razaoSocial`, `valor`, `id`) VALUES
('53.577.090/0001-01', NULL, '1223', 'Empresa Teste', 40, 2),
('53.577.090/0001-01', 'Rua A, Centro , Lodrina-PR', '1223', 'Empresa Teste', 40, 53),
('53.577.090/0001-01', 'Rua A, Centro , Lodrina-PR', '1223', 'Empresa Teste', 40, 54),
('53.577.090/0001-59', 'Rua A, Centro , Lodrina-PR', '1223', 'Teste', 42, 55),
('53.577.090/0001-01', 'Rua A, Centro , Lodrina-PR', '1223', 'Empresa Teste', 40, 56),
('53.577.090/0001-11', 'Rua A, Centro , Lodrina-PR', '1223', 'Empresa Teste', 42400, 102),
('53.577.090/0001-11', 'Rua A, Centro , Lodrina-PR', '1223', 'Empresa Teste', 0, 103),
('53.577.090/0001-11', 'Rua A, Centro , Lodrina-PR', '54486502', 'Empresa Teste', 12, 152),
('53.577.090/0001-11', 'Rua A, Centro , Lodrina-PR', 'SP1235', 'Empresa Teste', 12, 202);

-- --------------------------------------------------------

--
-- Estrutura para tabela `nfe_seq`
--

CREATE TABLE `nfe_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `nfe_seq`
--

INSERT INTO `nfe_seq` (`next_val`) VALUES
(301);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `nfe`
--
ALTER TABLE `nfe`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
