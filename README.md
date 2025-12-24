 Gym Membership System (Spring Boot)

The Gym Membership System is a Spring Boot–based RESTful application developed to manage gym members, trainers, classes, memberships, and enrollments. The project demonstrates the use of Spring Boot, Spring Data JPA, and REST APIs while following a clean layered architecture. It supports full CRUD operations, entity relationships, custom queries, environment-based configuration using Spring Profiles, and application monitoring using Spring Boot Actuator.

 Tech Stack-Java

Spring Boot

Spring Data JPA (Hibernate)

H2 Database (Development)

MySQL Database (Production)

Maven

Spring Boot Actuator

 Project Architecture
**PROJECT ARCHITECTURE**B  


The project follows a layered architecture where responsibilities are clearly separated.
Controllers handle HTTP requests, services contain business logic, repositories interact with the database, and entities represent database tables.

Controller → Service → Repository → Database

**Entities & Relationships**

The system consists of the following entities:
Member
MembershipCard
Trainer
GymClass
Enrollment



RELATIONSHIPS IMPLEMENTED IN THE PROJECT:
One-to-One relationship between Member and MembershipCard
One-to-Many relationship between Trainer and GymClass
Many-to-Many relationship between Member and GymClass, implemented using a join entity (Enrollment) with additional fields such as enrollmentDate and attendanceCou


***CRUD OPERATION***
The application supports full CRUD (Create, Read, Update, Delete) operations for all entities using REST APIs.

Mapping between CRUD and HTTP methods:

Create → POST
Read → GET
Update → PUT
Delete → DELETE

Example endpoint:

POST /api/members
GET /api/members
DELETE /api/members/{id}


***CUSTOM QUERIES***


The project includes 10 custom JPA queries, implemented using derived query methods and JPQL.
Examples include:

Finding all classes taught by a trainer

Finding members enrolled in a specific class

Finding expired memberships

Counting enrollments per class

Finding trainers with no assigned classes

**** Spring Profiles Configuration****

Spring Profiles are used to separate configuration for different environments.

dev profile
Uses H2 in-memory database, configured in application-dev.yml.

prod profile
Uses MySQL database, configured in application-prod.yml.

The active profile can be changed using JVM options:

-Dspring.profiles.active=prod

Spring Boot Actuator

Spring Boot Actuator is enabled to monitor application health and metrics.

Example endpoint:

GET /actuator/health

 How to Run the Project

***To build and run the application:***

mvn clean install
mvn spring-boot:run


To run using the production profile:
mvn spring-boot:run -Dspring-boot.run.profiles=prod


 Author

Kenneth (Kejoh)
Computer Science & Engineering




in the root directory of your project (same level as pom.xml).
