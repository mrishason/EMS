# EMS
Employee Expense Management System
Overview
The Employee Expense Management System is a microservices-based application designed to streamline the management and approval of employee expenses. The system is built using Spring Boot for the backend, with React.js powering the frontend. This project is open-source, and anyone can contribute to its development.

**Architecture**
The system is designed with two services:

Service 1: Employee Service
=> This service is responsible for handling employee-related tasks such as submitting expense reports, viewing past expenses, and updating expense records.
Service 2: Manager Service
=> This service allows managers to view, approve or reject employee expense requests, and track the status of all pending and approved expenses.
Eureka Registry
=> The services are registered with Eureka, which is used for service discovery and to enable communication between the Employee Service and Manager Service.

**Tech Stack**
Backend: Spring Boot (Microservices Architecture)
Frontend: React.js
Service Discovery: Eureka
Database: MySQL (or any preferred database)
API Communication: RESTful APIs

**Features**
Employee Service:

Submit expense reports
View past expense records
Update submitted expenses

Manager Service:
Approve or reject employee expense requests
View pending and approved expense reports
Track the status of submitted expenses


 
 
