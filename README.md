# Quiz-SBootMS
A Basic Quiz App using Spring Boot and Microservices architecture, featuring QuizService, QuestionService, ResultsService, and MarksService. It utilizes Eureka for service discovery and Lombok for cleaner code, with a MySQL database. Future enhancements include authentication, real-time features, and fault tolerance.

### Repository: **Basic Quiz App Using Spring Boot and Microservices**

This repository contains a **Basic Quiz Application** built using **Spring Boot** with a **Microservices Architecture**. It utilizes multiple services for modular functionality, including **QuizService**, **QuestionService**, **ResultsService**, and **MarksService**, along with **Spring Cloud Netflix** for service discovery and **Lombok** to simplify boilerplate code.

#### Key Features:
- **QuizService**: Manages quiz creation, listing, and participation.
- **QuestionService**: Handles storage, retrieval, and management of quiz questions.
- **ResultsService**: Processes and displays the quiz results for participants.
- **MarksService**: Calculates and stores the quiz scores.
- **Eureka Server**: Centralized service registry for discovering and managing microservices.
- **Lombok**: Simplifies the code by eliminating the need for getters, setters, and constructors.
- **MySQL Database**: Stores quiz-related data such as questions, users, and results.

#### Learning Goals:
- Understand microservices architecture with multiple services like **QuizService**, **QuestionService**, **ResultsService**, and **MarksService**.
- Implement **Eureka Server** for dynamic service registration and discovery.
- Work with **Spring Data JPA** and **MySQL** for database interactions.
- Practice using **Lombok** to reduce repetitive code.

#### Future Improvements:
- Add **Authentication and Authorization** for user login and role-based access.
- Introduce **Spring Cloud Gateway** for API routing and load balancing.
- Implement **Circuit Breakers** using **Hystrix** for fault tolerance.
- Enhance the user experience with real-time quiz participation using **WebSockets**.
- Integrate **Docker** for containerized microservices deployment.

This project provides a practical learning experience for developers working with **Spring Boot** and **Microservices**, showcasing how to build a scalable and modular application.
