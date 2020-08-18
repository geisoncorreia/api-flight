# api-flight
Spring Boot API with Spring template, Lombock and Swagger

# API
This API are consuming a public API https://api.skypicker.com/ using Spring Rest Template. This service will process the price of a flight that should be passed as parameter: From, To and Curr.

Ex: From: POP, To: FRO, Curr:BR

## Getting started

mvn spring-boot:run

## Using Swagger UI it's possible see thent endpont: 
http://localhost:8080/swagger-ui.html

http://localhost:8080/api/v1/flyFrom/OPO/to/FOR/curr/BR/flighter/

http://localhost:8080/api/v1/flyFrom/POP/to/FOR/curr/BR/price

# Frontend

This project was generated with Angular CLI version 10.0.0-next.1.

## Development server
Run ng serve for a dev server. Navigate to http://localhost:4200/price
