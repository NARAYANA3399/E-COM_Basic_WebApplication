## E-COMMERS WEB APPLICATION

This is a Full-Stack E-Commerce platform built using Java, Spring Boot, Thymeleaf, and MySQL. The application provides functionality for managing products, secure logins, role-based authentication, and basic e-commerce features.

## Key Features
* Secure Login with Spring Security (Role-Based Authentication)
* Role-Based Login: Different users can access different features based on roles (Admin, User, etc.)
* Add Product: Admin can add products to the catalog.
* Edit Product: Admin can edit product details.
* Delete Product: Admin can delete products from the catalog.

## Technologies Used
* Forntend: CSS, HTML, BootsStrap
* Backend: java 17+, Spring Boot, RestFul API's, Thymeleaf
* Security: Spring Security (Role Based Authentication)
* DataBase: MySQL (for storing user data)
* JPA: Hibernate for database interaction

## How to Run It

## 1. Repository
  
* Clone the Repository:- 'https://github.com/NARAYANA3399/E-COM_Basic_WebApplication'
* Navigate to the Project folder.
* Run the application using 'mvn Spring-boot:run'.

## 2. Set Up the Application
  
 * If using MySQL, update the database properties in 'src/main/resources/application.properties'.

      * spring.datasource.url=jdbc:mysql://localhost:3306/mvc
      * spring.datasource.username=root
      *  spring.datasource.password=password
      *  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
      *  spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
      *  spring.jpa.hibernate.ddl-auto=update 
      * spring.jpa.show-sql=true
  
## 3. Run the Application
  
* Open the project in your IDE (e.g., IntelliJ or VS Code).
* Run the E-CommerceApplication.java class (which contains the @SpringBootApplication annotation).
* The application should now be running at 'http://localhost:8080'.

## 4. Test the API Endpoints:

## Use Browser or any API client to test the following endpoints:

  * GET /pro - Home Page

  * POST /logins - Login (Role Based)

  * POST /added - Create a new Product

  * POST /update - Update bug status or priority

  * GET /edit - Edit Product Details or status

  * GET / - Get all Product (with pagination)

  * DELETE /delete - Delete a Product

  * GET /logout - LogOut home Page

## SCREEN SHORT

  * HOME PAGE

![Screenshot 2025-04-10 144614](https://github.com/user-attachments/assets/80659206-0d96-4280-a127-6064d1a658da)

  * LOGIN PAGE(ROLE BASDE)

![Screenshot 2025-04-10 144628](https://github.com/user-attachments/assets/1f563705-7a87-41d6-9f11-31f3c87c24b5)

  * PRODUCT STORE

![Screenshot 2025-04-10 144600](https://github.com/user-attachments/assets/6730da6d-9c5d-4e37-9847-31128c3d0081)

*  ADD PRODUCT

![Screenshot 2025-04-10 145112](https://github.com/user-attachments/assets/7526d05a-dd61-4649-9912-af00756dd051)

* UPDATE/EDIT PRODUCT

![Screenshot 2025-04-10 144819](https://github.com/user-attachments/assets/05bb2e3a-1b4b-4e6a-867c-ae67e95277b8)

* DELETE PRODUCT

![Screenshot 2025-04-10 144846](https://github.com/user-attachments/assets/57c1b6cb-293a-4da9-8771-268c940c0c56)













