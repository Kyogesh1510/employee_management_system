# Employee_Registration_System
This project is an Employee Registration System built using Java Servlets, JSP, and MySQL. It provides a web interface to register employees and store their details in a database.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Register employees with ID, Name, Email, Department, and Salary.
- Store employee details in a MySQL database.
- Simple and user-friendly web interface.

## Project Structure

```plaintext
.
├── src
│   ├── com
│   │   └── tap2
│   │       ├── Register.java
│   │       ├── Employee.java
│   │       └── EmployeeBo.java
├── web
│   ├── WEB-INF
│   │   ├── web.xml
│   ├── Register.html
└── README.md
Technologies Used
a.Java Servlets
b.JSP
c.MySQL
d.HTML/CSS

Setup Instructions
Prerequisites
a.JDK 8 or higher
b.Apache Tomcat 8 or higher
c.MySQL 5.7 or higher

Steps
1.Clone the repository
sh
git clone https://github.com/yourusername/employeeregistrationsystem.git
cd employeeregistrationsystem

2.Set up MySQL Database
sql
CREATE DATABASE jdbc2;
USE jdbc2;
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    dept VARCHAR(50),
    sal INT
);

3.Configure the Project
Open EmployeeBo.java and update the MySQL URL, username, and password if necessary.
java
static final String url = "jdbc:mysql://localhost:3306/jdbc2";
static final String username = "root";
static final String password = "root";

4.Deploy the Project
Copy the project folder to your Tomcat webapps directory.
Start Tomcat server.

5.Access the Web Application
Open your browser and navigate to http://localhost:8080/yourprojectname/Register.html.
Usage
Fill in the employee registration form and submit it to register an employee.
The employee data will be stored in the MySQL database.
Contributing
Contributions are welcome! Please fork this repository and submit pull requests with your changes.

License
This project is licensed under the MIT License. 
