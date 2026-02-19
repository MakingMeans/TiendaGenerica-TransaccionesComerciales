# TiendaGenerica-Backend-SB
Sistema web para la gestión de una tienda desarrollado con **Spring Boot + MySQL**, como proyecto académico. Desarrollo del software escrito en lenguaje Java para Web para gestionar las transacciones comerciales de una tienda que sea funcional para cualquier tipo de comercio que maneje proveedores, clientes, compras, ventas, y productos. 

Permite administrar:

- Login de usuarios
- Gestión de usuarios
- Gestión de clientes
- Gestión de proveedores
- Carga masiva de productos (CSV)
- Registro de ventas
- Reportes y consultas

---

# Tecnologias

Backend:
- Java JDK 11
- Spring Boot 2.4.5
- Maven
- Tomcat

Base de datos:
- MySQL 8

---

# Requerimientos

Instalar:

- JDK 11
- Maven 3.6+
- MySQL 8
- IDE (Eclipse / IntelliJ / VS Code)
- Git

Verificar:

```
java -version
mvn -v
mysql --version
```

---

# ⚙️ Configuración del Proyecto

## 1 Clonar repositorio

```
git clone https://github.com/MakingMeans/TiendaGenerica-Backend-SB
cd tienda-virtual
```

---

## 2 Crear Base de Datos

En MySQL:

```
CREATE DATABASE tienda_db;
```

---

## 3 Configurar conexión

Editar:

```
src/main/resources/application.properties
```

```
spring.datasource.url=jdbc:mysql://localhost:3306/tienda_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
```

---

## 4 Ejecutar proyecto

Con Maven:

```
mvn spring-boot:run
```

o

```
mvn clean install
java -jar target/*.jar
```

---

# Acceso

```
http://localhost:8080
```

Usuario inicial:

```
usuario: admininicial
password: admin123456
```

---

# GitFlow

Ramas:

- main → producción estable
- develop → integración
- feature/* → nuevas funcionalidades

Ejemplo:

```
feature/login
feature/clientes-crud
feature/ventas-calculo
```


Uso académico.
