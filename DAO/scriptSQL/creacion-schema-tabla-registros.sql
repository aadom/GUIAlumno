
CREATE DATABASE IF NOT EXISTS universidad
CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE universidad;

-- Crear la tabla alumnos

CREATE TABLE IF NOT EXISTS alumnos (
    DNI INT NOT NULL,
    NOMBRE VARCHAR(45) NOT NULL,
    APELLIDO VARCHAR(45) NOT NULL,
    FECNAC DATE NOT NULL,
    FECING DATE NOT NULL,
    PROMEDIO DECIMAL(4,2) NOT NULL,
    CANTMATAPROB SMALLINT NOT NULL DEFAULT 0,
    ESTADO CHAR(1) NOT NULL DEFAULT 'A',
    PRIMARY KEY (DNI)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Insertar datos de ejemplo (ahora con estado 'A' o 'I')
INSERT INTO alumnos (DNI, NOMBRE, APELLIDO, FECNAC, FECING, PROMEDIO, CANTMATAPROB, ESTADO) VALUES
(12345678, 'María', 'González', '2000-05-15', '2022-03-01', 8.75, 15, 'A'),
(23456789, 'Juan', 'Pérez', '1999-11-20', '2021-09-15', 6.50, 10, 'A'),
(34567890, 'Ana', 'Martínez', '2001-02-10', '2023-01-10', 9.20, 20, 'A'),
(45678901, 'Luis', 'Rodríguez', '2000-08-30', '2022-07-01', 4.80, 5, 'B'),
(56789012, 'Carla', 'López', '1998-12-05', '2020-03-20', 7.90, 12, 'A');

-- Verificar
SELECT * FROM alumnos;