USE tienda_db;

-- =============================
-- USUARIOS
-- =============================
INSERT INTO usuarios VALUES
(1,'admin@tienda.com','Administrador','admin123456','admininicial'),
(2,'cajero@tienda.com','Cajero 1','1234','cajero');

-- =============================
-- CLIENTES
-- =============================
INSERT INTO clientes VALUES
(101,'Calle 10 #20-30','juan@mail.com','Juan Perez','3101111111'),
(102,'Cra 50 #12-40','maria@mail.com','Maria Lopez','3112222222'),
(103,'Av 68 #90-10','carlos@mail.com','Carlos Ruiz','3123333333');

-- =============================
-- PROVEEDORES
-- =============================
INSERT INTO proveedores VALUES
(1,'Bogotá','Zona Industrial 1','Proveedor Norte','6011111111'),
(2,'Medellín','Zona Industrial 2','Proveedor Centro','6042222222'),
(3,'Cali','Zona Industrial 3','Proveedor Sur','6023333333'),
(4,'Barranquilla','Zona Industrial 4','Proveedor Costa','6054444444'),
(5,'Cartagena','Zona Industrial 5','Proveedor Mar','6055555555');

-- =============================
-- PRODUCTOS (los del PDF)
-- =============================
INSERT INTO productos VALUES
(1,'Melocotones',1,25505,19,30351),
(2,'Manzanas',3,18108,19,21549),
(3,'Plátanos',4,29681,19,35320),
(4,'Lechuga',3,29788,19,35448),
(5,'Tomates',1,12739,19,15159),
(6,'Calabaza',1,21315,19,25365),
(7,'Apio',2,19249,19,22906),
(8,'Pepino',2,10958,19,13040),
(9,'Champiñones',2,11046,19,13145),
(10,'Leche',5,21150,19,25169),
(11,'Queso',5,26571,19,31619),
(12,'Huevos',2,12445,19,14810),
(13,'Requesón',1,14329,19,17052),
(14,'Crema agria',1,14856,19,17679),
(15,'Yogur',5,14941,19,17780),
(16,'Ternera',5,29335,19,34909),
(17,'Salmón salvaje',5,11878,19,14135),
(18,'Patas de cangrejo',1,29951,19,35642);