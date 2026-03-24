# Spring Security REST API Project

## Overview
This project is a Spring Security REST API built with Spring Boot 3.5.7, providing secure endpoints for client applications. It uses PostgreSQL as the database and Spring Data JPA for ORM functionality.

## Technologies Used
- **Java Version:** 17
- **Framework:** Spring Boot 3.5.7
- **Database:** PostgreSQL
- **JPA Implementation:** Spring Data JPA
- **Web Framework:** Spring Web

## Features
- User registration and authentication
- Secure REST endpoints
- Role-based access control
- JWT for stateless authentication

## Getting Started
1. **Clone the repository**:
   ```bash
   git clone https://github.com/raza-zeeshan/Spring-Security-RestApi.git
   ```

2. **Setup PostgreSQL Database**:
   - Create a PostgreSQL database and configure the connection properties in `application.properties`.

3. **Build the Application**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints
- **POST** `/api/auth/register` - Create new user
- **POST** `/api/auth/login` - Authenticate user and return JWT

## License
This project is licensed under the MIT License.