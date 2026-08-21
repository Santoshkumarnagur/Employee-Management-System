# 👨‍💼 Employee Management System

> A console-based Employee Management System built using **Java, Hibernate ORM, JPA, Maven, and MySQL**, demonstrating CRUD operations, transaction management, input validation, exception handling, and database integration.

---

## 📌 Overview

The **Employee Management System** is a Java-based console application developed to manage employee records using **Hibernate ORM** and **MySQL**.

The application provides complete **CRUD functionality**:

- ➕ Create Employee
- 🔍 Read Employee
- ✏️ Update Employee
- 🗑️ Delete Employee

It also demonstrates:

- Input validation
- Exception handling
- Hibernate transaction management
- JPA entity mapping
- Maven dependency management
- MySQL database connectivity
- Secure database configuration
- Console-based user interaction

This project was developed as a practical implementation of **Java + Hibernate database integration**.

---

# 🎯 Objectives

The main objectives of this project are:

1. Understand Hibernate ORM.
2. Connect a Java application with MySQL.
3. Map Java objects to relational database tables.
4. Perform CRUD operations using Hibernate.
5. Understand Hibernate `Session` and `SessionFactory`.
6. Implement database transaction management.
7. Implement input validation.
8. Handle application and database exceptions.
9. Manage dependencies using Maven.
10. Use Git and GitHub for version control.

---

# ✨ Features

## 👤 Employee Management

### ➕ Add Employee

Users can add a new employee by providing:

- Name
- Salary
- Designation
- Department

### 🔍 View Employee

Users can retrieve employee details using Employee ID.

### ✏️ Update Employee

Users can update:

- Name
- Salary
- Designation
- Department

### 🗑️ Delete Employee

Users can delete an employee using Employee ID.

### 🚪 Exit

The application safely closes the Hibernate `SessionFactory` and Scanner before terminating.

---

# 🏗️ Application Architecture

The application follows a simple layered organization.

```text
                    ┌─────────────────────────┐
                    │       User / Console    │
                    └────────────┬────────────┘
                                 │
                                 ▼
              ┌──────────────────────────────────┐
              │ EmployeeManagementSystemApp      │
              │                                  │
              │ • Menu Management                │
              │ • Input Validation               │
              │ • CRUD Operations                │
              │ • Exception Handling             │
              │ • Transaction Management         │
              └───────────────┬──────────────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │ Hibernate ORM      │
                    │                   │
                    │ Configuration     │
                    │ SessionFactory     │
                    │ Session            │
                    │ Transaction        │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │ JPA Entity         │
                    │ Employee.java      │
                    └─────────┬─────────┘
                              │
                              ▼
                    ┌───────────────────┐
                    │ MySQL Database     │
                    │                   │
                    │ CompanyDB          │
                    │ employee table    │
                    └───────────────────┘
