# Prices API
## _/api/prices_
Presenta un método GET que:
- Acepta como parámetros de entrada: fecha de aplicación, identificador de producto,
  identificador de cadena.
- Devuelve como datos de salida: identificador de producto, identificador de cadena, tarifa a
  aplicar, fechas de aplicación y precio final a aplicar.

## Tech

- Utiliza Spring Boot 3.3.1, Swagger y Java 17.
- Utiliza Mapstruct para mapeo de datos entre capas.
- Arquitectura hexagonal para el desacoplamiento entre capas.
- Utiliza H2 como base de datos en memoria
- Se han implementado 5 tests de integración para comprobar la funcionalidad.

## Accesos
- Ejemplo de llamada: http://localhost:8080/api/prices/toapply/2020-06-14T10:00:00/35455/1
- Se puede acceder a SwaggerUI en http://localhost:8080/swagger-ui/index.html
- Se puede acceder a H2UI en http://localhost:8080/h2-ui

