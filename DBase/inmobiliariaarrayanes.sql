-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2023 a las 17:22:56
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmobiliariaarrayanes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `id` int(11) NOT NULL,
  `idPropiedad` int(11) DEFAULT NULL,
  `idInquilino` int(11) DEFAULT NULL,
  `idGarante` int(11) DEFAULT NULL,
  `idVendedor` int(11) DEFAULT NULL,
  `fechaContrato` date DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFinalizacion` date DEFAULT NULL,
  `precio` bigint(11) NOT NULL,
  `estado` varchar(30) NOT NULL COMMENT 'puede ser "vigente" "no vigente" "renovado"',
  `descripcion` varchar(255) DEFAULT NULL COMMENT 'pormenores del contrato, clausulas especiales'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `id` int(11) NOT NULL,
  `idPropietario` int(11) NOT NULL,
  `superficie` int(11) NOT NULL,
  `cantAmbientes` int(11) NOT NULL,
  `canBaños` int(11) NOT NULL,
  `fechaConstruccion` date NOT NULL,
  `garage` int(11) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `direccion` varchar(120) NOT NULL,
  `zona` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `condicionesContrato` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inspecciones`
--

CREATE TABLE `inspecciones` (
  `id` int(11) NOT NULL,
  `idInspector` int(11) DEFAULT NULL,
  `idInmueble` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inspectores`
--

CREATE TABLE `inspectores` (
  `id` int(11) NOT NULL,
  `idPersona` int(11) DEFAULT NULL,
  `usuario` varchar(60) DEFAULT NULL,
  `contraseña` char(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multa`
--

CREATE TABLE `multa` (
  `id` int(11) NOT NULL,
  `idInspeccion` int(11) DEFAULT NULL,
  `idInquilino` int(11) DEFAULT NULL,
  `fechaConfeccion` date NOT NULL,
  `fechaPago` date DEFAULT NULL,
  `monto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `dni` int(8) NOT NULL,
  `cuil` bigint(11) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `telefono` int(11) NOT NULL,
  `eMail` varchar(60) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`id`, `nombre`, `apellido`, `dni`, `cuil`, `domicilio`, `telefono`, `eMail`, `estado`) VALUES
(1, 'María', 'García', 34567890, 2147483647, 'Calle 123, Ciudad', 1234567890, 'maria@example.com', 1),
(2, 'Juan', 'Rodríguez', 34567891, 2147483647, 'Av. Principal 456, Pueblo', 1234567891, 'juan@example.com', 1),
(3, 'Carlos', 'López', 34567892, 2147483647, 'Calle 789, Villa', 1234567892, 'carlos@example.com', 1),
(4, 'Ana', 'Fernández', 34567893, 2147483647, 'Calle 456, Ciudad', 1234567893, 'ana@example.com', 1),
(5, 'Lucía', 'Pérez', 34567894, 2147483647, 'Av. Central 789, Pueblo', 1234567894, 'lucia@example.com', 1),
(6, 'Luis', 'Gómez', 34567895, 2147483647, 'Calle 567, Villa', 1234567895, 'luis@example.com', 1),
(7, 'Laura', 'Martínez', 34567896, 2147483647, 'Calle 890, Ciudad', 1234567896, 'laura@example.com', 1),
(8, 'Pedro', 'Díaz', 34567897, 2147483647, 'Av. Principal 123, Pueblo', 1234567897, 'pedro@example.com', 1),
(9, 'Sofía', 'Hernández', 34567898, 2147483647, 'Calle 234, Villa', 1234567898, 'sofia@example.com', 1),
(10, 'Diego', 'López', 34567899, 2147483647, 'Calle 567, Ciudad', 1234567899, 'diego@example.com', 1),
(11, 'Marcela', 'González', 34567900, 2147483647, 'Av. Central 890, Pueblo', 1234567900, 'marcela@example.com', 1),
(12, 'Javier', 'Martínez', 34567901, 2147483647, 'Calle 789, Villa', 1234567901, 'javier@example.com', 1),
(13, 'Marta', 'Ramírez', 34567902, 2147483647, 'Av. Principal 456, Ciudad', 1234567902, 'marta@example.com', 1),
(14, 'Ricardo', 'Fernández', 34567903, 2147483647, 'Calle 123, Pueblo', 1234567903, 'ricardo@example.com', 1),
(15, 'Natalia', 'García', 34567904, 2147483647, 'Calle 567, Villa', 1234567904, 'natalia@example.com', 1),
(16, 'Alejandro', 'Pérez', 34567905, 2147483647, 'Av. Central 789, Ciudad', 1234567905, 'alejandro@example.com', 1),
(17, 'Valentina', 'Díaz', 34567906, 2147483647, 'Calle 890, Pueblo', 1234567906, 'valentina@example.com', 1),
(18, 'Gustavo', 'Hernández', 34567907, 2147483647, 'Calle 234, Villa', 1234567907, 'gustavo@example.com', 1),
(19, 'Camila', 'Rodríguez', 34567908, 2147483647, 'Av. Principal 123, Ciudad', 1234567908, 'camila@example.com', 1),
(20, 'Sebastián', 'Gómez', 34567909, 2147483647, 'Calle 456, Pueblo', 1234567909, 'sebastian@example.com', 1),
(21, 'María', 'García', 34567890, 20345678901, 'Calle 123, Ciudad', 1234567890, 'maria@example.com', 1),
(22, 'Juan', 'Rodríguez', 34567891, 20345678902, 'Av. Principal 456, Pueblo', 1234567891, 'juan@example.com', 1),
(23, 'Carlos', 'López', 34567892, 20345678903, 'Calle 789, Villa', 1234567892, 'carlos@example.com', 1),
(24, 'Ana', 'Fernández', 34567893, 20345678904, 'Calle 456, Ciudad', 1234567893, 'ana@example.com', 1),
(25, 'Lucía', 'Pérez', 34567894, 20345678905, 'Av. Central 789, Pueblo', 1234567894, 'lucia@example.com', 1),
(26, 'Luis', 'Gómez', 34567895, 20345678906, 'Calle 567, Villa', 1234567895, 'luis@example.com', 1),
(27, 'Laura', 'Martínez', 34567896, 20345678907, 'Calle 890, Ciudad', 1234567896, 'laura@example.com', 1),
(28, 'Pedro', 'Díaz', 34567897, 20345678908, 'Av. Principal 123, Pueblo', 1234567897, 'pedro@example.com', 1),
(29, 'Sofía', 'Hernández', 34567898, 20345678909, 'Calle 234, Villa', 1234567898, 'sofia@example.com', 1),
(30, 'Diego', 'López', 34567899, 20345678910, 'Calle 567, Ciudad', 1234567899, 'diego@example.com', 1),
(31, 'Marcela', 'González', 34567900, 20345678911, 'Av. Central 890, Pueblo', 1234567900, 'marcela@example.com', 1),
(32, 'Javier', 'Martínez', 34567901, 20345678912, 'Calle 789, Villa', 1234567901, 'javier@example.com', 1),
(33, 'Marta', 'Ramírez', 34567902, 20345678913, 'Av. Principal 456, Ciudad', 1234567902, 'marta@example.com', 1),
(34, 'Ricardo', 'Fernández', 34567903, 20345678914, 'Calle 123, Pueblo', 1234567903, 'ricardo@example.com', 1),
(35, 'Natalia', 'García', 34567904, 20345678915, 'Calle 567, Villa', 1234567904, 'natalia@example.com', 1),
(36, 'Alejandro', 'Pérez', 34567905, 20345678916, 'Av. Central 789, Ciudad', 1234567905, 'alejandro@example.com', 1),
(37, 'Valentina', 'Díaz', 34567906, 20345678917, 'Calle 890, Pueblo', 1234567906, 'valentina@example.com', 1),
(38, 'Gustavo', 'Hernández', 34567907, 20345678918, 'Calle 234, Villa', 1234567907, 'gustavo@example.com', 1),
(39, 'Camila', 'Rodríguez', 34567908, 20345678919, 'Av. Principal 123, Ciudad', 1234567908, 'camila@example.com', 1),
(40, 'Sebastián', 'Gómez', 34567909, 20345678920, 'Calle 456, Pueblo', 1234567909, 'sebastian@example.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `id` int(11) NOT NULL,
  `idPersona` int(11) DEFAULT NULL,
  `usuario` varchar(60) DEFAULT NULL,
  `contraseña` char(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idInquilino` (`idInquilino`),
  ADD KEY `idGarante` (`idGarante`),
  ADD KEY `idVendedor` (`idVendedor`);

--
-- Indices de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPropietario` (`idPropietario`);

--
-- Indices de la tabla `inspecciones`
--
ALTER TABLE `inspecciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idInspector` (`idInspector`),
  ADD KEY `idInmueble` (`idInmueble`);

--
-- Indices de la tabla `inspectores`
--
ALTER TABLE `inspectores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `multa`
--
ALTER TABLE `multa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idInspeccion` (`idInspeccion`),
  ADD KEY `idInquilino` (`idInquilino`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPersona` (`idPersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contrato`
--
ALTER TABLE `contrato`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inspecciones`
--
ALTER TABLE `inspecciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inspectores`
--
ALTER TABLE `inspectores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `multa`
--
ALTER TABLE `multa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_2` FOREIGN KEY (`idInquilino`) REFERENCES `personas` (`id`),
  ADD CONSTRAINT `contrato_ibfk_3` FOREIGN KEY (`idGarante`) REFERENCES `personas` (`id`),
  ADD CONSTRAINT `contrato_ibfk_4` FOREIGN KEY (`idVendedor`) REFERENCES `vendedor` (`id`);

--
-- Filtros para la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD CONSTRAINT `inmueble_ibfk_1` FOREIGN KEY (`idPropietario`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `inspecciones`
--
ALTER TABLE `inspecciones`
  ADD CONSTRAINT `inspecciones_ibfk_1` FOREIGN KEY (`idInspector`) REFERENCES `inspectores` (`id`),
  ADD CONSTRAINT `inspecciones_ibfk_2` FOREIGN KEY (`idInmueble`) REFERENCES `inmueble` (`id`);

--
-- Filtros para la tabla `inspectores`
--
ALTER TABLE `inspectores`
  ADD CONSTRAINT `inspectores_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `multa`
--
ALTER TABLE `multa`
  ADD CONSTRAINT `multa_ibfk_1` FOREIGN KEY (`idInspeccion`) REFERENCES `inspecciones` (`id`),
  ADD CONSTRAINT `multa_ibfk_2` FOREIGN KEY (`idInquilino`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD CONSTRAINT `vendedor_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
