DROP DATABASE IF EXISTS tienda_db;
CREATE DATABASE tienda_db;
USE tienda_db;

-- =============================
-- USUARIOS
-- =============================
CREATE TABLE usuarios(
    cedula_usuario BIGINT PRIMARY KEY,
    email_usuario VARCHAR(255),
    nombre_usuario VARCHAR(255),
    password VARCHAR(255),
    usuario VARCHAR(255)
);

-- =============================
-- CLIENTES
-- =============================
CREATE TABLE clientes(
    cedula_cliente BIGINT PRIMARY KEY,
    direccion_cliente VARCHAR(255),
    email_cliente VARCHAR(255),
    nombre_cliente VARCHAR(255),
    telefono_cliente VARCHAR(255)
);

-- =============================
-- PROVEEDORES
-- =============================
CREATE TABLE proveedores(
    nitproveedor BIGINT PRIMARY KEY,
    ciudad_proveedor VARCHAR(255),
    direccion_proveedor VARCHAR(255),
    nombre_proveedor VARCHAR(255),
    telefono_proveedor VARCHAR(255)
);

-- =============================
-- PRODUCTOS
-- =============================
CREATE TABLE productos(
    codigo_producto BIGINT PRIMARY KEY,
    nombre_producto VARCHAR(50),
    nitproveedor BIGINT,
    precio_compra DOUBLE,
    ivacompra DOUBLE,
    precio_venta DOUBLE,
    FOREIGN KEY (nitproveedor) REFERENCES proveedores(nitproveedor)
);

-- =============================
-- VENTAS
-- =============================
CREATE TABLE ventas(
    codigo_venta BIGINT AUTO_INCREMENT PRIMARY KEY,
    cedula_cliente BIGINT,
    cedula_usuario BIGINT,
    ivaventa DOUBLE,
    total_venta DOUBLE,
    valor_venta DOUBLE,
    FOREIGN KEY (cedula_cliente) REFERENCES clientes(cedula_cliente),
    FOREIGN KEY (cedula_usuario) REFERENCES usuarios(cedula_usuario)
);

-- =============================
-- DETALLE VENTAS
-- =============================
CREATE TABLE detalle_ventas(
    codigo_detalle_venta BIGINT AUTO_INCREMENT PRIMARY KEY,
    cantidad_producto INT,
    codigo_producto BIGINT,
    codigo_venta BIGINT,
    valor_total DOUBLE,
    valor_venta DOUBLE,
    valoriva DOUBLE,
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto),
    FOREIGN KEY (codigo_venta) REFERENCES ventas(codigo_venta)
);