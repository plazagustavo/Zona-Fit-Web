# 🏋️‍♂️ Zona Fit Web - Sistema de Gestión de Gimnasio

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

**Zona Fit Web** es una aplicación robusta desarrollada en Java con **Spring Boot** para la administración eficiente de clientes en un gimnasio.

---

## 📌 Descripción del Proyecto

El sistema permite gestionar de manera integral el ciclo de vida de los socios de un gimnasio mediante operaciones **CRUD** (Create, Read, Update, Delete). A través de una interfaz web intuitiva.

### ✨ Características Principales
* **Visualización Dinámica:** Listado completo de clientes con ID, Nombre, Apellido y número de Membresía.
* **Gestión Centralizada:** Botones de acción directa para editar información o dar de baja a socios desde la misma tabla.
* **Persistencia Robusta:** Integración con **MySQL** mediante **JPA / Hibernate** para un manejo de datos seguro y escalable.
* **Arquitectura Modular:** Estructura limpia basada en el patrón MVC, facilitando futuros mantenimientos o expansiones.

---

## 🚀 Tecnologías Utilizadas

* **Backend:** Java 21+ con Spring Boot.
* **Acceso a Datos:** Spring Data JPA / Hibernate.
* **Frontend:** HTML5, CSS3.
* **Gestión de Dependencias:** Maven.
* **Base de Datos:** MySQL.

---

## ⚙️ Configuración e Instalación

### 1. Requisitos Previos
* **Java JDK 21** o superior.
* **MySQL Server** activo.
* IDE de preferencia (IntelliJ IDEA, NetBeans, Eclipse).

### 2. Configuración de la Base de Datos
Primero, crea el esquema en tu servidor MySQL:
```sql
CREATE DATABASE zona_fit_db;
```
Luego, ajusta tus credenciales en el archivo src/main/resources/application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/zona_fit_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

### 3. Ejecución
Clona el repositorio:
```
git clone [https://github.com/plazagustavo/Zona-Fit-Web.git](https://github.com/plazagustavo/Zona-Fit-Web.git)
```
* **Importa el proyecto** en tu IDE como un Proyecto Maven.
* **Ejecuta la clase principal:** `ZonaFitWeb.java`.
* **Accede en tu navegador a:** http://localhost:8080

📸 Interfaz de Usuario
<img width="1907" height="517" alt="image" src="https://github.com/user-attachments/assets/acbfdcb9-0538-4294-8772-19aca0986375" />
