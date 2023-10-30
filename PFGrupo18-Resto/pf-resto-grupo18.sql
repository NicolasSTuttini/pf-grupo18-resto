-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 16:29:15
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pf-resto-grupo18`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administracion`
--

CREATE TABLE `administracion` (
  `dni` int(11) NOT NULL,
  `contrasenia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administracion`
--

INSERT INTO `administracion` (`dni`, `contrasenia`) VALUES
(4, '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `id_mesa` int(2) NOT NULL,
  `numero` int(2) NOT NULL,
  `capacidad` int(2) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `ocupada` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`id_mesa`, `numero`, `capacidad`, `estado`, `ocupada`) VALUES
(2, 1, 6, 0, 0),
(4, 2, 8, 0, 0),
(5, 2, 8, 1, 2),
(6, 4, 10, 0, 0),
(10, 5, 8, 0, 0),
(11, 6, 12, 1, 2),
(12, 7, 6, 0, 0),
(13, 3, 8, 1, 0),
(14, 1, 6, 1, 2),
(15, 4, 4, 1, 2),
(16, 5, 10, 1, 0),
(17, 7, 8, 1, 0),
(18, 9, 10, 1, 0),
(19, 10, 12, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `id_mesero` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `contrasenia` varchar(8) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`id_mesero`, `dni`, `nombre`, `apellido`, `contrasenia`, `estado`) VALUES
(1, 45, 'nicolas', 'plaza', '111', 0),
(2, 41126116, 'Javier', 'Servantes', '12345', 1),
(3, 41126114, 'Pedro', 'Calderon', '12345', 1),
(4, 40000000, 'Pedro', 'Calderon', '[C@c31aa', 1),
(5, 33256999, 'Agustina', 'Herrera', 'resto18a', 1),
(6, 31256688, 'Pablo', 'Etchetto', 'resto18e', 1),
(7, 41022611, 'Lourdes', 'Vertariuti', 'resto18l', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `id_mesa` int(11) DEFAULT NULL,
  `id_mesero` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `entregado` tinyint(1) NOT NULL,
  `pagado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_mesa`, `id_mesero`, `fecha`, `hora`, `importe`, `entregado`, `pagado`) VALUES
(69, 6, 3, '2023-10-13', '19:56:28', 4499.99, 0, 0),
(70, 2, 3, '2023-10-13', '20:03:56', 4500.99, 0, 0),
(73, 5, 3, '2023-10-13', '22:42:31', 3500, 1, 1),
(85, 5, 3, '2023-10-16', '22:04:48', 9000.98, 1, 1),
(88, 5, 3, '2023-10-16', '22:20:57', 5763.98, 1, 1),
(94, 5, 3, '2023-10-18', '10:40:38', 1755, 1, 1),
(100, 5, 3, '2023-10-18', '10:54:04', 4265, 1, 1),
(111, 5, 3, '2023-10-20', '11:08:58', 6000, 1, 1),
(114, 5, 3, '2023-10-23', '12:09:12', 4500, 1, 1),
(117, 14, 5, '2023-10-25', '11:28:20', 1490.99, 1, 1),
(120, 14, 3, '2023-10-25', '11:39:38', 8090.99, 1, 1),
(121, 14, 3, '2023-10-25', '11:40:59', 13999.96, 1, 1),
(123, 15, 7, '2023-10-25', '11:42:20', 6299.97, 1, 1),
(135, 16, 5, '2023-10-27', '14:44:38', 9199.97, 1, 1),
(142, 14, 6, '2023-10-27', '15:10:24', 1850, 1, 1),
(143, 5, 6, '2023-10-27', '15:11:03', 1850, 1, 1),
(148, 5, 4, '2023-10-27', '15:59:35', 6450, 1, 1),
(150, 5, 4, '2023-10-27', '16:05:56', 1300, 1, 1),
(152, 16, 5, '2023-10-27', '16:06:23', 1850, 1, 1),
(154, 14, 4, '2023-10-27', '16:11:11', 2790.99, 1, 1),
(155, 5, 5, '2023-10-27', '16:11:20', 1490.99, 1, 1),
(156, 5, 4, '2023-10-27', '16:11:29', 1650, 1, 1),
(158, 14, 4, '2023-10-27', '16:12:11', 1599.99, 1, 1),
(162, 5, 5, '2023-10-27', '16:15:31', 6290.99, 1, 1),
(171, 16, 3, '2023-10-30', '11:31:29', 3799.99, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` double(7,2) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre`, `precio`, `estado`) VALUES
(1, 'pizza común', 2050.00, 1),
(2, 'hamburguesa', 1650.00, 1),
(3, 'coca 1litro', 1300.00, 1),
(4, 'lomito', 1850.00, 0),
(5, 'coca 500cc', 500.00, 1),
(6, 'parrilla', 3799.99, 1),
(7, 'sorrentinos', 1500.00, 1),
(8, 'Pizza especial', 2199.99, 1),
(9, 'Milanesa c/puré', 1499.99, 1),
(10, 'sandwich de milanesa común', 1300.00, 1),
(11, 'sandwich de milanesa especial', 1599.99, 1),
(12, 'Pizza a la piedra', 1800.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productospedidos`
--

CREATE TABLE `productospedidos` (
  `id_prodPedido` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `cantidad` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productospedidos`
--

INSERT INTO `productospedidos` (`id_prodPedido`, `id_producto`, `id_pedido`, `cantidad`) VALUES
(101, 1, 69, 1),
(102, 2, 69, 1),
(103, 1, 70, 1),
(104, 2, 70, 1),
(105, 3, 70, 1),
(110, 2, 73, 1),
(118, 1, 85, 1),
(119, 2, 85, 1),
(120, 3, 85, 1),
(121, 2, 85, 1),
(122, 1, 85, 1),
(123, 1, 88, 1),
(124, 3, 88, 1),
(127, 3, 88, 1),
(128, 3, 88, 6),
(129, 1, 88, 1),
(130, 2, 88, 1),
(131, 3, 88, 1),
(132, 4, 88, 1),
(138, 4, 94, 1),
(139, 6, 94, 3),
(141, 2, 100, 1),
(143, 4, 100, 3),
(146, 6, 111, 4),
(147, 5, 111, 4),
(148, 6, 111, 4),
(150, 5, 114, 2),
(151, 2, 114, 1),
(152, 1, 117, 1),
(153, 1, 120, 1),
(154, 2, 120, 4),
(155, 3, 121, 4),
(156, 8, 121, 4),
(157, 5, 123, 3),
(158, 11, 123, 3),
(159, 3, 135, 2),
(160, 8, 135, 3),
(166, 4, 142, 1),
(167, 4, 143, 1),
(169, 2, 148, 1),
(170, 3, 148, 1),
(171, 4, 148, 1),
(172, 2, 148, 1),
(173, 3, 150, 1),
(174, 4, 152, 1),
(175, 1, 154, 1),
(176, 3, 154, 1),
(177, 1, 155, 1),
(178, 2, 156, 1),
(179, 11, 158, 1),
(180, 1, 162, 1),
(181, 2, 162, 1),
(182, 3, 162, 1),
(183, 4, 162, 1),
(186, 6, 171, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administracion`
--
ALTER TABLE `administracion`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`id_mesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`id_mesero`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_mesero` (`id_mesero`),
  ADD KEY `id_mesa` (`id_mesa`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `productospedidos`
--
ALTER TABLE `productospedidos`
  ADD PRIMARY KEY (`id_prodPedido`),
  ADD KEY `id_pedido` (`id_pedido`),
  ADD KEY `id_producto` (`id_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `id_mesa` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `id_mesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `productospedidos`
--
ALTER TABLE `productospedidos`
  MODIFY `id_prodPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=205;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_mesero`) REFERENCES `mesero` (`id_mesero`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`);

--
-- Filtros para la tabla `productospedidos`
--
ALTER TABLE `productospedidos`
  ADD CONSTRAINT `productospedidos_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `productospedidos_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
