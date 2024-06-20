create database olimpiadasGrupo1;
use olimpiadasGrupo1;
CREATE TABLE Olimpiadas(
    nombre VARCHAR(100),
    año int PRIMARY KEY,
    ubicacion VARCHAR(100)
);

CREATE TABLE Disciplina(
    nombre VARCHAR(100),
    tipo VARCHAR(50),
    PRIMARY KEY(nombre,tipo)
);

CREATE TABLE Entrenador(
    cedula INT,
    nombre VARCHAR(100),
    edad int,
    disciplina VARCHAR (100),
    categoria VARCHAR(100),
    pais VARCHAR(100),
    PRIMARY KEY(cedula),
    FOREIGN KEY (disciplina,categoria) REFERENCES Disciplina(nombre,tipo)
);


CREATE TABLE Atleta(
    cedula INT,
    nombre VARCHAR(100),
    edad int,
    disciplina VARCHAR (100),
    categoria VARCHAR(100),
    peso int,
    genero varchar(50),
    pais VARCHAR(100),
    PRIMARY KEY(cedula),
    FOREIGN KEY (disciplina,categoria) REFERENCES Disciplina(nombre,tipo)
);

CREATE TABLE Equipo(
    nombre VARCHAR(100),
    pais VARCHAR(100),
    entrenador_ci INT,
    PRIMARY KEY(nombre),
    FOREIGN KEY (entrenador_ci) references Entrenador(cedula)
);

CREATE TABLE Evento(
    disciplina VARCHAR(100),
    categoria VARCHAR(100),
    fecha DATETIME,
    equipo VARCHAR(100),
    PRIMARY KEY(fecha,equipo),
    FOREIGN KEY (disciplina,categoria) REFERENCES Disciplina(nombre,tipo),
    FOREIGN KEY (equipo) REFERENCES Equipo(nombre)
);


CREATE TABLE Resultado(
    puntaje FLOAT,
    posicion INT,
    disciplina VARCHAR(100),
    categoria VARCHAR(100),
    equipo VARCHAR(100),
    fecha DATETIME,
    PRIMARY KEY(fecha,equipo),
    FOREIGN KEY (disciplina,categoria) REFERENCES Disciplina(nombre,tipo),
    FOREIGN KEY (fecha,equipo) REFERENCES Evento(fecha,equipo)
);

CREATE TABLE Record(
    id_record INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    puntaje FLOAT,
    equipo VARCHAR(100),
    atleta_ci INT,
    FOREIGN KEY (equipo) REFERENCES Equipo(nombre),
    FOREIGN KEY(atleta_ci) REFERENCES Atleta(cedula)
);

CREATE TABLE Login(
    ci int,
    contrasenia VARCHAR(255),
    jwt VARCHAR(255),
    PRIMARY KEY(ci)
);

insert into Disciplina(nombre,tipo) values ("Halterofilia", "LIBRE");
insert into Atleta(cedula,nombre,edad,disciplina,categoria,peso,genero,pais) values (56448791,"Lucas Giffuni", 22,"Halterofilia","LIBRE",70,"Hombre", "Uruguay" );
