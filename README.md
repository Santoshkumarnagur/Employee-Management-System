\# 👨‍💼 Employee Management System



A \*\*console-based Employee Management System\*\* developed using \*\*Java, Hibernate ORM, Maven, and MySQL\*\*.



The application provides complete \*\*CRUD (Create, Read, Update, Delete)\*\* functionality for managing employee records in a MySQL database. Hibernate ORM is used to map Java objects to database tables and simplify database operations.



\---



\## 📌 Project Overview



Managing employee information is a common requirement in organizations. This project demonstrates how a Java application can interact with a relational database using \*\*Hibernate ORM\*\* instead of writing SQL queries for every operation.



The application allows users to:



\- ➕ Add new employees

\- 🔍 View employee details using Employee ID

\- ✏️ Update employee information

\- 🗑️ Delete employee records

\- 🛡️ Validate user input

\- 🔄 Manage database transactions

\- ❌ Handle invalid input and employee-not-found scenarios



\---



\## 🚀 Features



\### 1. Add Employee



Users can add a new employee by providing:



\- Employee Name

\- Salary

\- Designation

\- Department



Hibernate persists the employee object into the MySQL database.



\### 2. View Employee



Users can enter an Employee ID to retrieve the employee's details.



The application displays:



```text

ID

Name

Salary

Designation

Department

