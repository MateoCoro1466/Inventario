CREATE DATABASE BDInventario;

USE BDInventario;

CREATE TABLE Productos
(
idproducto INT AUTO_INCREMENT,
nombreproducto VARCHAR(50),
unidad INT,
preciodecompra FLOAT,
preciodeventa FLOAT,
PRIMARY KEY (idproducto)
);

INSERT INTO BDInventario.Productos (nombreproducto,unidad,preciodecompra,preciodeventa) VALUES ('Lavandina',10,1050.00,1500.00);
INSERT INTO BDInventario.Productos (nombreproducto,unidad,preciodecompra,preciodeventa) VALUES ('Arroz',5,1250.00,1700.00);

CREATE TABLE Ventas
(
idventa INT AUTO_INCREMENT,
fechadeventa DATETIME,
totaldeventa FLOAT,
PRIMARY KEY (idventa)
);

CREATE TABLE ventasxproducto
(
idfactura int AUTO_INCREMENT,
idventa INT,
idproducto INT,
nombreproducto VARCHAR(50),
cantidadesvendidas INT,
preciodeventa FLOAT,
PRIMARY KEY (idfactura),
FOREIGN KEY (idventa) REFERENCES Ventas(idventa),
FOREIGN KEY (idproducto) REFERENCES Productos(idproducto)
);

CREATE TABLE Ganancia
(
idganancia INT AUTO_INCREMENT,
idventa INT,
fechadeventa DATETIME,
total INT,
PRIMARY KEY (idganancia),
FOREIGN KEY (idventa) REFERENCES Ventas(idventa)
) 
