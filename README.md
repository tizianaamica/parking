# nelumbo-parking Challenge

This is a microservice application to expose nelumbo-parking challenge.

## Application technical stack
- Java 17
- Spring Boot
- Spring Web
- Spring Data and Hibernate
- Lombok
- Postgre SQL

### Running the application locally

*Software Requirements*
- Java 17 SDK installed
- Maven (>= 3.1.1)
- PG Admin
- Postman

*Setup dev-support*

We recommend the usage of ssh to clone any repository.

Clone the dev-support project

```
$ cd ~/workspace/challenge
$ git clone git@github.com:tizianaamica/parqueadero.git
```

*Setup the database*

```
CREATE DATABASE nelumbo-challenge;
```

*Setup the application.properties*

```
# Server Port
server.port=8090
spring.application.name=challenge

# PostgreSQL Database
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_bd
spring.datasource.username=user
spring.datasource.password=password

# Hibernate JPA
spring.jpa.database=postgresql
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Flyway
spring.flyway.enabled=true
spring.flyway.baseline-on-migrate=true
spring.flyway.baseline-version=0
spring.flyway.user=user
spring.flyway.password=password
spring.flyway.locations=classpath:db/migration

```

*Author*

```
Tiziana Amicarella Girardi

# Github: @tizianaamica
```

