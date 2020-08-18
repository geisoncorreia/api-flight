# api-flight
Spring Boot API with Spring template, Lombock and Swagger

# API
This API are consuming a public API https://api.skypicker.com/ using Spring Rest Template. This service will process the price of a flight that shoulb be passed as parameter: From, To and Curr.

## Getting started

mvn spring-boot:run

## Using Swagger UI it's possible see thent endpont: 
http://localhost:8080/swagger-ui.html

http://localhost:8080/api/v1/flyFrom/OPO/to/FOR/curr/BR/flighter/

http://localhost:8080/api/v1/flyFrom/POP/to/FOR/curr/BR/price

