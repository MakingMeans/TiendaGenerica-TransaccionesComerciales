CREATE TABLE usuarios (
    id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    cedula_usuario VARCHAR(20) NOT NULL UNIQUE,
    nombre_usuario VARCHAR(20) NOT NULL,
    apellido_usuario VARCHAR(20) NOT NULL,
    email_usuario VARCHAR(50) NOT NULL UNIQUE,
    username VARCHAR(25) NOT NULL UNIQUE,
    password VARCHAR(25) NOT NULL,
    activo BOOLEAN DEFAULT TRUE
);

CREATE TABLE clientes (
    id_cliente BIGINT AUTO_INCREMENT PRIMARY KEY,
    cedula_cliente VARCHAR(20) NOT NULL UNIQUE,
    nombre_cliente VARCHAR(20) NOT NULL,
    apellido_cliente VARCHAR(20) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(15),
    email_cliente VARCHAR(50)
);

CREATE TABLE proveedores (
    id_proveedor BIGINT AUTO_INCREMENT PRIMARY KEY,
    nit VARCHAR(20) NOT NULL UNIQUE,
    nombre_proveedor VARCHAR(100) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(20),
    ciudad VARCHAR(100)
);

CREATE TABLE compras (
    id_compra BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_proveedor BIGINT NOT NULL,
    id_usuario BIGINT NOT NULL,
    total_compra DECIMAL(15,2) NOT NULL,
    fecha_compra TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE detalle_compras (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_compra BIGINT NOT NULL,
    id_producto BIGINT NOT NULL,
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(15,2) NOT NULL,
    FOREIGN KEY (id_compra) REFERENCES compras(id_compra) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

CREATE TABLE productos (
    id_producto BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_producto BIGINT NOT NULL UNIQUE,
    nombre_producto VARCHAR(100) NOT NULL,
    precio_venta DECIMAL(15,2) NOT NULL,
    iva DECIMAL(5,2) NOT NULL,
    stock INT DEFAULT 0,
    activo BOOLEAN DEFAULT TRUE
);



CREATE TABLE ventas (
    id_venta BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_venta BIGINT NOT NULL UNIQUE,
    id_cliente BIGINT NOT NULL,
    id_usuario BIGINT NOT NULL,
    total_venta DECIMAL(15,2) NOT NULL,
    total_iva DECIMAL(15,2) NOT NULL,
    total_con_iva DECIMAL(15,2) NOT NULL,
    fecha_venta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE detalle_ventas (
    id_detalle BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_venta BIGINT NOT NULL,
    id_producto BIGINT NOT NULL,
    cantidad INT NOT NULL,
    valor_unitario DECIMAL(15,2) NOT NULL,
    valor_total DECIMAL(15,2) NOT NULL,
    FOREIGN KEY (id_venta) REFERENCES ventas(id_venta) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);