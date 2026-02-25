USE tienda_db;

-- =============================
-- USUARIOS
-- =============================
INSERT INTO usuarios 
(cedula_usuario, nombre_usuario, apellido_usuario, email_usuario, username, password, activo)
VALUES
('1001','Admin','Principal','admin@tienda.com','admin','admin123456',TRUE),
('1002','Cajero','Uno','cajero@tienda.com','cajero','1234',TRUE);

-- =============================
-- CLIENTES
-- =============================
INSERT INTO clientes
(cedula_cliente, nombre_cliente, apellido_cliente, direccion, telefono, email_cliente)
VALUES
('101','Juan','Perez','Calle 10 #20-30','3101111111','juan@mail.com'),
('102','Maria','Lopez','Cra 50 #12-40','3112222222','maria@mail.com'),
('103','Carlos','Ruiz','Av 68 #90-10','3123333333','carlos@mail.com');

-- =============================
-- PROVEEDORES
-- =============================
INSERT INTO proveedores
(nit, nombre_proveedor, direccion, telefono, ciudad)
VALUES
('900001','Proveedor Norte','Zona Industrial 1','6011111111','Bogotá'),
('900002','Proveedor Centro','Zona Industrial 2','6042222222','Medellín'),
('900003','Proveedor Sur','Zona Industrial 3','6023333333','Cali'),
('900004','Proveedor Costa','Zona Industrial 4','6054444444','Barranquilla'),
('900005','Proveedor Mar','Zona Industrial 5','6055555555','Cartagena');

-- =============================
-- PRODUCTOS
-- =============================
INSERT INTO productos
(codigo_producto, nombre_producto, precio_venta, iva, stock, activo)
VALUES
(1,'Melocotones',25505,19,30351,TRUE),
(2,'Manzanas',18108,19,21549,TRUE),
(3,'Plátanos',29681,19,35320,TRUE),
(4,'Lechuga',29788,19,35448,TRUE),
(5,'Tomates',12739,19,15159,TRUE),
(6,'Calabaza',21315,19,25365,TRUE),
(7,'Apio',19249,19,22906,TRUE),
(8,'Pepino',10958,19,13040,TRUE),
(9,'Champiñones',11046,19,13145,TRUE),
(10,'Leche',21150,19,25169,TRUE),
(11,'Queso',26571,19,31619,TRUE),
(12,'Huevos',12445,19,14810,TRUE),
(13,'Requesón',14329,19,17052,TRUE),
(14,'Crema agria',14856,19,17679,TRUE),
(15,'Yogur',14941,19,17780,TRUE),
(16,'Ternera',29335,19,34909,TRUE),
(17,'Salmón salvaje',11878,19,14135,TRUE),
(18,'Patas de cangrejo',29951,19,35642,TRUE);

USE tienda_db;

-- =============================
-- COMPRAS
-- =============================
INSERT INTO compras
(id_proveedor, id_usuario, total_compra)
VALUES
(1,1,500000),
(2,2,350000);

-- =============================
-- DETALLE_COMPRAS
-- =============================
INSERT INTO detalle_compras
(id_compra, id_producto, cantidad, precio_unitario)
VALUES
(1,1,50,20000),
(1,2,40,15000),
(2,3,30,25000),
(2,4,20,22000);

-- =============================
-- VENTAS
-- =============================
INSERT INTO ventas
(codigo_venta, id_cliente, id_usuario, total_venta, total_iva, total_con_iva)
VALUES
(10001,1,1,50000,9500,59500),
(10002,2,2,80000,15200,95200);

-- =============================
-- DETALLE_VENTAS
-- =============================
INSERT INTO detalle_ventas
(id_venta, id_producto, cantidad, valor_unitario, valor_total)
VALUES
(1,1,2,25505,51010),
(1,5,1,12739,12739),
(2,3,2,29681,59362),
(2,10,1,21150,21150);