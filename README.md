
# SpringCloud-PostgreSQL-Docker-Kubernetes

## Descripción
Proyecto **Spring Cloud** para gestión de usuarios, utilizando **PostgreSQL** como base de datos, desplegable con **Docker** y compatible con **Kubernetes**. Incluye comunicación entre microservicios mediante **OpenFeign** y configuración con **Spring Boot 3.4.5**.

---

## Tecnologías
- **Spring Boot 3.4.5**
- **Spring Cloud 2024.0.1**
- **Spring Data JPA**
- **Spring Web**
- **OpenFeign**
- **MySQL / PostgreSQL**
- **Docker**
- **Kubernetes**
- **DevTools**
- **JUnit / Spring Boot Test**

---

## Requisitos
- Java 21
- Maven
- Docker
- Kubernetes (opcional para despliegue en cluster)
- Base de datos MySQL o PostgreSQL

---

## Configuración del proyecto

1. Clonar el repositorio:

```bash
git clone <URL_DEL_REPOSITORIO>
cd msvc-usuarios
````

2. Configurar la base de datos en `application.properties` o `application.yml`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/usuariosdb
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

3. Construir y ejecutar con Maven:

```bash
mvn clean install
mvn spring-boot:run
```

4. Opcional: ejecutar en Docker y Kubernetes según la configuración de los archivos `Dockerfile` y `k8s-deploy.yaml`.

---

## Uso

* Accede a los endpoints REST del microservicio en `http://localhost:8080/api/usuarios`
* Para pruebas unitarias y de integración:

```bash
mvn test
```

---

## Autor

* **Alicia Ortega**
  Email: [Aliciaortega1986@gmail.com](mailto:Aliciaortega1986@gmail.com)

---

## Licencia

Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más detalles.


