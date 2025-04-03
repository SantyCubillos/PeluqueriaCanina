-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-06-2024 a las 21:10:31
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peluqueriacanina`
--
CREATE DATABASE IF NOT EXISTS `peluqueriacanina` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `peluqueriacanina`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dueno`
--

CREATE TABLE `dueno` (
  `IdDueno` int(11) NOT NULL,
  `NombreDueno` varchar(50) NOT NULL CHECK (`NombreDueno` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `CelDueno` varchar(10) NOT NULL CHECK (`CelDueno` regexp '^[0-9]*$'),
  `DireccionDueno` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `IdMascota` int(11) NOT NULL,
  `NombreMascota` varchar(20) NOT NULL CHECK (`NombreMascota` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `RazaMascota` varchar(20) NOT NULL CHECK (`RazaMascota` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `ColorMascota` varchar(50) NOT NULL CHECK (`ColorMascota` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `Alergico` varchar(2) NOT NULL CHECK (`Alergico` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `AtencionEspecial` varchar(2) NOT NULL CHECK (`AtencionEspecial` regexp '^[a-zA-Zá-úÁ-ÚñÑ ]*$'),
  `Observaciones` varchar(200) NOT NULL,
  `Dueno_IdDueno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `dueno`
--
ALTER TABLE `dueno`
  ADD PRIMARY KEY (`IdDueno`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`IdMascota`),
  ADD KEY `FK_MASCOTA_DUENO_IdDueno` (`Dueno_IdDueno`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `dueno`
--
ALTER TABLE `dueno`
  MODIFY `IdDueno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `IdMascota` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `FK_MASCOTA_DUENO_IdDueno` FOREIGN KEY (`DUENO_IdDueno`) REFERENCES `dueno` (`IdDueno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
