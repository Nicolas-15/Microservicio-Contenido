📘 Microservicio Contenido – REST API (Spring Boot)

Este proyecto corresponde a un microservicio desarrollado en Spring Boot, diseñado para la gestión de contenidos mediante una API REST. Implementa buenas prácticas de arquitectura, separación por capas y conexión con una base de datos relacional.

🚀 Tecnologías Utilizadas

Java 17

Spring Boot 3

Spring Web

Spring Data JPA

Oracle/MySQL (configurable)

Maven

Postman / Thunder Client para pruebas

📂 Estructura del Proyecto
src/main/java/com/contenido/
│── controller/      → Controladores REST (endpoints)
│── service/         → Lógica de negocio
│── repository/      → Acceso a datos (JPA)
│── model/           → Entidades del sistema
│── dto/             → Objetos de transferencia
└── MicroservicioContenidoApplication.java

🧩 Funcionalidades

CRUD completo de contenidos.

API REST estándar con respuestas JSON.

Validación básica.

Manejo organizado de excepciones.

Conexión a base de datos vía Spring Data JPA.

🔌 Endpoints Principales
GET    /contenido           → Obtener todos los contenidos
GET    /contenido/{id}      → Obtener contenido por ID
POST   /contenido           → Crear nuevo contenido
PUT    /contenido/{id}      → Actualizar contenido
DELETE /contenido/{id}      → Eliminar contenido


Los nombres pueden ajustarse según tu implementación exacta.

🗄 Configuración de Base de Datos

Ejemplo en application.properties:

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=USER
spring.datasource.password=PASS

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶ Cómo Ejecutarlo

Clonar el repositorio:

git clone https://github.com/Nicolas-15/Microservicio-Contenido


Abrir en IntelliJ IDEA o Spring Tools Suite.

Instalar dependencias:

mvn clean install


Ejecutar:

mvn spring-boot:run


Probar la API en http://localhost:8080 usando Postman, ThunderClient o navegador.

📌 Estado del Proyecto

Proyecto académico orientado a la práctica profesional, enfocado en aplicar principios de desarrollo Backend y arquitectura de microservicios.

🧑‍💻 Autor

Nicolás López
Estudiante de Analista Programador — Backend & FullStack en formación
GitHub: https://github.com/Nicolas-15
