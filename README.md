# 👨‍💼 Employee Management System

A console-based **Employee Management System** built using **Java, Hibernate ORM, MySQL, Maven, and JPA**.

This project demonstrates how a Java application can perform database operations using Hibernate ORM, implement CRUD functionality, manage transactions, validate user input, and handle exceptions in a structured console-based application.

---

## 🚀 Project Highlights

- ✅ Create employee records
- 🔍 Read employee details by ID
- ✏️ Update employee information
- 🗑️ Delete employee records
- 🛡️ Input validation
- 🔄 Hibernate transaction management
- 🗄️ MySQL database integration
- 🧩 JPA entity mapping
- 📦 Maven dependency management
- ⚠️ Exception handling
- 🔐 Database credential protection using `.gitignore`
- 💻 Menu-driven console interface

---

## 📌 Project Overview

The **Employee Management System** is a Java-based CRUD application designed to manage employee information stored in a MySQL database.

Hibernate ORM is used as the persistence framework, allowing Java objects to be mapped to relational database tables.

Instead of manually writing SQL queries for every CRUD operation, Hibernate manages the object-relational mapping between the Java `Employee` entity and the MySQL `employee` table.

---

## 🛠️ Technology Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Core application development |
| Hibernate ORM 6.4.0.Final | Object-Relational Mapping |
| JPA | Entity mapping |
| MySQL | Database |
| Maven | Dependency management |
| Eclipse IDE | Development environment |
| Git | Version control |
| GitHub | Source code repository |

---

## 🏗️ Project Structure

```text
EmployeeManagementSystem/
│
├── .mvn/
│   ├── jvm.config
│   └── maven.config
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── company/
│       │           ├── entity/
│       │           │   └── Employee.java
│       │           │
│       │           └── main/
│       │               └── EmployeeManagementSystemApp.java
│       │
│       └── resources/
│           └── hibernate.cfg.xml
│
├── .gitignore
├── pom.xml
└── README.md
