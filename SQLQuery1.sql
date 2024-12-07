CREATE DATABASE Sistema_Colegio

USE Sistema_Colegio

-- Tabla para almacenar la información de los estudiantes

CREATE TABLE Estudiante (
EstudianteID INTEGER PRIMARY KEY,
DNI NUMERIC(8),
Nombre VARCHAR(50),
Apellido VARCHAR(50),
FechaNacimiento DATE,
DireccionPadres VARCHAR(100),
CodigoEstudiante VARCHAR(20),
AñoIngreso INTEGER,
PromedioGeneral DECIMAL(4,2),
GradoID INTEGER
);

CREATE TABLE Grado(GradoID INTEGER PRIMARY KEY,
Nombre VARCHAR (20),
Nivel NVARCHAR (20),
Seccion VARCHAR (10),
Turno VARCHAR (10)
);

ALTER TABLE Estudiante
ADD CONSTRAINT fk_grado
FOREIGN KEY (GradoID)
REFERENCES Grado(GradoID);

CREATE TABLE Profesor(ProfesorID INTEGER PRIMARY KEY,
Nombre NVARCHAR(50),
Apellido NVARCHAR(50),
DNI CHAR(8),
FechaNacimiento DATE,
Direccion NVARCHAR(100),
Especialidad NVARCHAR(50),
FechaContratacion DATE,
Salario DECIMAL(10,2),
Titulo NVARCHAR(50),
Email NVARCHAR (50)
);

CREATE TABLE Asignatura(AsignaturaID INTEGER PRIMARY KEY,
Nombre NVARCHAR (50),
Descripcion NVARCHAR(100),
Creditos INTEGER,
Duracion INTEGER,
Nivel NVARCHAR(20),
ProfesorID INTEGER
);

ALTER TABLE Asignatura
ADD CONSTRAINT fk_profesor
FOREIGN KEY (ProfesorID)
REFERENCES Profesor(ProfesorID);

CREATE TABLE EstudianteAsignatura(
AsignaturaID INTEGER
FOREIGN KEY (AsignaturaID) REFERENCES Asignatura(AsignaturaID),
EstudianteID INTEGER
FOREIGN KEY (EstudianteID) REFERENCES Estudiante(EstudianteID),
FechaInscripcion DATE
);

CREATE TABLE Ambiente(AmbienteID INTEGER PRIMARY KEY,
Nombre NVARCHAR(50),
Capacidad INTEGER,
Tipo NVARCHAR (20),
Ubicacion NVARCHAR (50),
Estado NVARCHAR(20)
);

CREATE TABLE AsignaturaAmbiente(
  AsignaturaID INTEGER,
  AmbienteID INTEGER,
  Horario NVARCHAR(50),
  PRIMARY KEY (AsignaturaID, AmbienteID),
  FOREIGN KEY (AsignaturaID) REFERENCES Asignatura(AsignaturaID),
  FOREIGN KEY (AmbienteID) REFERENCES Ambiente(AmbienteID)
);