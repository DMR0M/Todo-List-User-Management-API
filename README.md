# 📝 Todo List API — User Management with Authentication and Roles

A RESTful **Todo List API** built with **Spring Boot**, **MySQL**, and **Docker**, featuring **JWT-based authentication** and **role-based authorization**.

This API allows users to register, log in, and manage their personal todo items securely, while administrators have special privileges to manage users and their data.

---

## 🚀 Features

### 🔐 Authentication & Authorization
- User registration and login using **JWT (JSON Web Tokens)**.
- Role-based access control (**USER**, **ADMIN**).
- Secure password hashing using **Spring Security**.

### 🧑‍💻 User Management
- Register a new account.
- Login and receive a JWT token.
- Admins can view, update, or delete users.

### 🗂️ Todo Management
- Create, update, delete, and view todo items.
- Todos are linked to their respective users.
- Pagination and sorting support.

### ⚙️ Technologies Used
- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **JWT**
- **Docker & Docker Compose**
- **Swagger / OpenAPI Documentation**

---

## 🧩 Project Structure

```
todos/
├── src/
│ ├── main/java/com/example/todos/
│ │ ├── config/        # JWT, filters, security config
│ │ ├── controller/    # REST Controllers
│ │ ├── entity/        # Entities (Authority, Todo, User)
│ │ ├── exception/     # Custom and global exceptions
│ │ ├── repository/    # JPA Repositories
│ │ ├── request/       # DTOs for client to API with data validation
│ │ ├── response/      # DTOs for API to client
│ │ ├── service/       # Service layer logic
│ │ ├── util/          # Custom utility classes and methods
│ │ └── TodosApplication.java
│ └── main/resources/
│ └──├── static/
│ └──├── templates/
│ └──├── application.properties
├── Dockerfile
├── docker-compose.yml
├── .env
├── .gitignore
├── pom.xml
└── README.md
```


---

## ⚙️ Environment Setup

### 1️⃣ Prerequisites
Ensure you have installed:
- [Java 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/)
- [Docker Desktop](https://www.docker.com/)
- [Git](https://git-scm.com/)

---

### 2️⃣ Environment Variables
Create a `.env` file

All environment variables are stored in a `.env` file:

```env
# --- MySQL Config ---
MYSQL_ROOT_PASSWORD=secret
MYSQL_DATABASE=tododb
MYSQL_USER=root
MYSQL_PASSWORD=secret

# --- Spring Boot Config ---
SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/tododb?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=secret
SPRING_JWT_SECRET=55773ec63465f82b8c770a18c1006294b832dcd1b20f64e95a0078625ae4f6ea
SPRING_JWT_EXPIRATION=900000
