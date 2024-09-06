# Spring Boot CRUD Application

## Overview
This is a simple Spring Boot application demonstrating basic CRUD (Create, Read, Update, Delete) operations with RESTful APIs. It uses **Spring Data JPA** for interacting with the database and provides a set of endpoints for managing entities.

## Features
- **Create**: Add new records to the database.
- **Read**: Fetch single or multiple records from the database.
- **Update**: Modify existing records in the database.
- **Delete**: Remove records from the database.

## Technologies Used
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (or any preferred database)
- **Maven**

## Setup and Run

**Clone the repository**:
```bash
git clone https://github.com/chandrakanthrck/springboot-crud-example
cd springboot-crud-example
```
### Run the application:

```bash
mvn spring-boot:run
```
### Access the APIs
The application runs on `http://localhost:8080` by default, and you can test the CRUD endpoints using tools like **Postman** or **cURL**.

### Endpoints
- **POST** `/api/entity` - Create a new entity
- **GET** `/api/entity/{id}` - Get an entity by ID
- **GET** `/api/entities` - Get all entities
- **PUT** `/api/entity/{id}` - Update an entity
- **DELETE** `/api/entity/{id}` - Delete an entity

### License
This project is licensed under the MIT License.

