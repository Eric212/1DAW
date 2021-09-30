CREATE DATABASE Ordenadores;
USE Ordenadores;

/*Create Tables*/

CREATE TABLE Ordenadores
	(id int(10),
	fk_tecnico int(10),
	fk_vendedor int(10),
	fk_cliente varchar(9));
CREATE TABLE Tecnicos
	(codigo int(10),
	nombre varchar(30),
	telefono varchar(11));
CREATE TABLE Vendedores
	(codigo_vendedor int(10),
	nombre varchar(30),
	telefono varchar(11));
CREATE TABLE Clientes
	(dni varchar(9),
	nombre varchar(30),
	telefono varchar(11));
CREATE TABLE Componentes
	(numero_serie bigint(50),
	nombre varchar(30),
	fk_marca int(10),
	fk_distribuidor int(10),
	precio int(10),
	stock int(10),
	fk_ordenador int(10),	
	fk_tipo int(10),
	fk_clase int(10));
CREATE TABLE Distribuidores
	(codigo_distribuidor int(10),
	nombre varchar(30),
	telefono varchar(11));
CREATE TABLE Marca
	(id int(10),
	nombre varchar(30),
	fk_fabricante int(10));
CREATE TABLE Tipo
	(id int(10),
	tipo varchar(10));
CREATE TABLE Clase
	(id int(10),
	clase varchar(30));
CREATE TABLE Fabricante
	(id int(10),
	nombre varchar(30));

/*Primary key*/

ALTER TABLE Ordenadores add primary key (id);
ALTER TABLE Tecnicos add primary key (codigo);
ALTER TABLE Vendedores add primary key (codigo_vendedor);
ALTER TABLE Clientes add primary key (dni);
ALTER TABLE Componentes add primary key (numero_serie);
ALTER TABLE Distribuidores add primary key (codigo_distribuidor);
ALTER TABLE Marca add primary key (id);
ALTER TABLE Tipo add primary key (id);
ALTER TABLE Clase add primary key (id);
ALTER TABLE Fabricante add primary key (id);

/*Foreign keys*/

ALTER TABLE Ordenadores add foreign key (fk_tecnico) references Tecnicos(codigo);
ALTER TABLE Ordenadores add foreign key (fk_vendedor) references Vendedores(codigo_vendedor);
ALTER TABLE Ordenadores add foreign key (fk_cliente) references Clientes(dni);
ALTER TABLE Componentes add foreign key (fk_marca) references Marca(id);
ALTER TABLE Componentes add foreign key (fk_ordenador) references Ordenadores(id);
ALTER TABLE Componentes add foreign key (fk_clase) references Clase(id);
ALTER TABLE Componentes add foreign key (fk_tipo) references Tipo(id);
ALTER TABLE Componentes add foreign key (fk_distribuidor) references Distribuidores(codigo_distribuidor);
ALTER TABLE Marca add foreign key (fk_fabricante) references Fabricante(id);

/*Inserts*/

INSERT INTO Clase VALUES (1,'Gaming');
INSERT INTO Clase VALUES (2,'Basic');
INSERT INTO Clase VALUES (3,'Enterprise');
INSERT INTO Tipo VALUES (1,'CPU');
INSERT INTO Tipo VALUES (2,'RAM');
INSERT INTO Tipo VALUES (3,'Placa base');
INSERT INTO Tipo VALUES (4,'Fuente de alimentacion');
INSERT INTO Tipo VALUES (5,'Tarjeta grafica');
INSERT INTO Tipo VALUES (6,'Disco duro');
INSERT INTO Tipo VALUES (7,'Disco SSD');
INSERT INTO Tipo VALUES (8,'Disco NVME');
INSERT INTO Tipo VALUES (9,'Torre');
INSERT INTO Tipo VALUES (10,'Monitor');
INSERT INTO Fabricante VALUES (1,'Asus');
INSERT INTO Fabricante VALUES (2,'Lenovo');
INSERT INTO Fabricante VALUES (3,'Gigabyte');
INSERT INTO Fabricante VALUES (4,'Nvidia');
INSERT INTO Fabricante VALUES (5,'AMD');
INSERT INTO Fabricante VALUES (6,'Intel');
INSERT INTO Fabricante VALUES (7,'Corsair');
INSERT INTO Fabricante VALUES (8,'Dell');
INSERT INTO Fabricante VALUES (9,'HP');
INSERT INTO Fabricante VALUES (10,'Acer');
INSERT INTO Marca VALUES (1,'Asus',1);
INSERT INTO Marca VALUES (2,'Asrock',1);
INSERT INTO Marca VALUES (3,'Thinkpad',2);
INSERT INTO Marca VALUES (4,'Legion',2);
INSERT INTO Marca VALUES (5,'Gigabyte',3);
INSERT INTO Marca VALUES (6,'Nvidia',4);
INSERT INTO Marca VALUES (7,'AMD',5);
INSERT INTO Marca VALUES (8,'Intel',6);
INSERT INTO Marca VALUES (9,'Corsair',7);
INSERT INTO Marca VALUES (10,'Dell',8);
INSERT INTO Marca VALUES (11,'AlienWare',8);
INSERT INTO Marca VALUES (12,'HP',9);
INSERT INTO Marca VALUES (13,'Compaq',9);
INSERT INTO Marca VALUES (14,'Acer',10);
INSERT INTO Distribuidores VALUES (1,'Pedro','644543231');
INSERT INTO Distribuidores VALUES (2,'Nathan','+04768543667');
INSERT INTO Distribuidores VALUES (3,'Miguel','667543123');
INSERT INTO Tecnicos VALUES (1,'Eric','644196907');
INSERT INTO Vendedores VALUES (1,'Angel','646787906');
INSERT INTO Vendedores VALUES (2,'Ainhoa','646327606');
INSERT INTO Clientes VALUES ('56748346D','Ramon','675849345');
INSERT INTO Clientes VALUES ('67584569N','Vicent','644532698');
INSERT INTO Ordenadores VALUES (1,1,1,'56748346D');
INSERT INTO Ordenadores VALUES (2,1,2,'67584569N');
INSERT INTO Ordenadores VALUES (3,1,2,'56748346D');
INSERT INTO Componentes VALUES (54321312341789,'RTX 3090',6,1,800,1,1,5,1);
INSERT INTO Componentes VALUES (75634254346839,'i7-10900K',8,2,700,5,2,1,1);
INSERT INTO Componentes VALUES (54321312343234,'32GBx2-RAM DDR4 3200Mhz CL16',7,3,600,3,3,2,1);
INSERT INTO Componentes VALUES (54321543457654,'500W Modular Plus Bronce',3,2,60,20,3,4,2);