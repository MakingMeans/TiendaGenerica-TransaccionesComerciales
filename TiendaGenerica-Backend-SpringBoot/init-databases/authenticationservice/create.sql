CREATE TABLE usuarios (
    id_usuario BIGSERIAL PRIMARY KEY,
    cedula_usuario VARCHAR(20) NOT NULL UNIQUE,
    nombre_usuario VARCHAR(20) NOT NULL,
    apellido_usuario VARCHAR(20) NOT NULL,
    email_usuario VARCHAR(50) NOT NULL UNIQUE,
    username VARCHAR(25) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    activo BOOLEAN DEFAULT TRUE
);