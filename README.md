# SampleApp

Este proyecto, denominado SampleApp, es una aplicación de ejemplo desarrollada con el framework Spring Boot en el lenguaje de programación Java. Está diseñado para servir como un modelo básico para aplicaciones de comercio electrónico, específicamente en el contexto de la gestión de precios de productos para diferentes marcas.

La aplicación utiliza tecnologías como Spring Boot y Spring Data JPA para facilitar el desarrollo de servicios RESTful y el acceso a datos a través de JPA. La base de datos H2 se emplea como una base de datos en memoria para propósitos de desarrollo y pruebas.

La arquitectura de la aplicación sigue el patrón Modelo-Vista-Controlador (MVC), separando las responsabilidades en modelos de datos, controladores para gestionar las solicitudes HTTP y servicios que contienen la lógica de negocio. Se implementa la inyección de dependencias con Spring para mejorar la modularidad y la mantenibilidad del código.

La aplicación proporciona un endpoint para consultar precios de productos en función de la fecha de aplicación, el identificador del producto y la marca. Además, se incluyen pruebas unitarias escritas con JUnit y Mockito para garantizar la robustez del código.

La estructura del proyecto sigue las convenciones de Maven, facilitando la gestión de dependencias y la construcción del proyecto.

Este proyecto puede ser utilizado como punto de partida o referencia para el desarrollo de aplicaciones similares en el dominio del comercio electrónico y la gestión de precios.

## Tecnologías Utilizadas

### Spring Boot
- **Descripción:** Framework de desarrollo para crear aplicaciones Java basado en Spring que facilita la creación de servicios RESTful.
- **Enlace:** [Spring Boot](https://spring.io/projects/spring-boot)

### Spring Data JPA
- **Descripción:** Implementación de Spring para el acceso a datos basada en el estándar JPA (Java Persistence API).
- **Enlace:** [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

### H2 Database
- **Descripción:** Base de datos en memoria utilizada para desarrollo y pruebas.
- **Enlace:** [H2 Database](https://www.h2database.com/html/main.html)

### Maven
- **Descripción:** Herramienta de gestión de proyectos que simplifica la construcción y gestión de dependencias.
- **Enlace:** [Maven](https://maven.apache.org/)

### JUnit y Mockito
- **Descripción:** Bibliotecas de pruebas unitarias para Java. JUnit se utiliza para escribir y ejecutar tests, mientras que Mockito facilita la creación de mocks.
- **Enlaces:** [JUnit](https://junit.org/junit5/), [Mockito](https://site.mockito.org/)

## Arquitectura y Patrones

### Arquitectura MVC
- **Descripción:** Patrón arquitectónico que separa la aplicación en tres componentes principales: Modelo (representación de datos), Vista (interfaz de usuario) y Controlador (gestiona las interacciones).
- **Enlace:** [MVC Architecture](https://www.baeldung.com/spring-mvc-tutorial)

### Inyección de Dependencias (DI) con Spring
- **Descripción:** Patrón que permite invertir el control de las dependencias, facilitando la creación de componentes más desacoplados.
- **Enlace:** [Spring - Inyección de Dependencias](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-introduction)

## Configuración del Entorno

1. Clona el repositorio: `git clone https://github.com/tuusuario/tuproyecto.git`
2. Navega al directorio del proyecto: `cd tuproyecto`

## Ejecución del Proyecto

```bash
mvn spring-boot:run
```
 El servicio estará disponible en http://localhost:8080.

## Estructura del Proyecto
- **src/main/java:** Contiene el código fuente Java.
- **com.sample.bcnc:** Paquete principal del proyecto.
- **controller:** Controladores REST.
- **service:** Lógica de negocio y servicios.
- **repository:** Interfaces de repositorios JPA.
- **entity:** Entidades de datos.
- **src/test/java:** Contiene los tests unitarios.
## Endpoints
### Consultar Precio
Endpoint para consultar precios.

#### URL

```bash
GET /prices/calculate
```
#### Parámetros de la URL

- **applicationDate** (obligatorio): Fecha de aplicación en formato "yyyy-MM-dd HH:mm:ss".
- **productId** (obligatorio): ID del producto.
- **brandId** (obligatorio): ID de la marca.
#### Ejemplo de Uso

```bash
curl -X GET "http://localhost:8080/prices/calculate?applicationDate=2022-01-01%2010:00:00&productId=35455&brandId=1"
```

## Pruebas
Las pruebas unitarias están escritas utilizando JUnit y Mockito. Ejecútalas con el siguiente comando:

```bash
mvn test
```
## Contribuciones
¡Contribuciones son bienvenidas! Abre un issue o una solicitud de extracción para discutir cambios.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

## Contacto
https://www.linkedin.com/in/espinosasantiago/

## Notas de Versión
1.0
