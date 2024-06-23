Create database examen2;
use  examen2;

CREATE TABLE Personaje
(
 IdPersonaje 		INT NOT NULL AUTO_INCREMENT,
 NomPersonaje		VARCHAR(50) NOT NULL,
 ApePersonaje 		VARCHAR(50) NOT NULL,
 FechNacPersonaje	DATE NOT NULL,
 PRIMARY KEY (IdPersonaje)
);

CREATE TABLE ProgramaTv
(
 IdProgramaTv 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Resumen 			VARCHAR(250) NOT NULL,
 FechaInicio	DATE NOT NULL,
 IdPersonaje 			INT NOT NULL,
 PRIMARY KEY (IdProgramaTv),
 FOREIGN KEY (IdPersonaje) REFERENCES Personaje(IdPersonaje)
 );
 
 INSERT INTO Personaje (NomPersonaje, ApePersonaje, FechNacPersonaje) VALUES
('German', 'Valcarcel', '2000-06-08'),
('Martin', 'Raul', '2001-05-25'),
('Mario', 'Vargas', '2002-03-30'),
('Claudia', 'Zapata', '2003-11-10'),
('Charlie', 'Garcia', '2004-07-20');

INSERT INTO ProgramaTv (Titulo, Resumen, FechaInicio, IdPersonaje) VALUES
('Hora de aventura', 'Aventuras', '2010-04-05', 1),
('TVPeru', 'Hablando sobre peru', '2012-09-15', 2),
('Master Chef', 'Programa de cocina.', '2015-01-20', 3),
('QualityProducts', 'Productos que nunca utilizaras mas de una vez.', '2018-06-10', 4),
('Latina', 'Chismes y noticas falsas.', '2020-11-22', 5);