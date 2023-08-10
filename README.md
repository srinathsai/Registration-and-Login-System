# Registration and Login System with Spring-Thymeleaf, Spring-Security and, Spring-Validation

## Motivation :-
For my previous Student Maanagement system, I had implemented backend db crud operations using Springboot and frontend part using Spring thymeleaf. So an improvement from my previous projects is to add Spring security . This improvement resulted a new project in which a simple user friendly Registration and login System was built using Spring thymeleaf for the front end where users signup and login . And these fields in forms are validated using Spring Validation, password is encrypted before storing into db and db has authentication based on user role using Spring security.


## Introduction of Spring concepts used :-
### Thymeleaf:-
Thymeleaf is a Java template engine on the client side for processing and creating HTML, XML, JavaScript, CSS, and text. The Thymeleaf engine will search for templates in the resources folder, based on the written Thymeleaf keywords in the HTML it relates the objects and their working and gives results in HTML. In other words, it's working can be described by the following steps:-
  - Thymeleaf follows a De-Coupled Architecture .<br />
  - In the same way, it is unaware of Spring’s abstraction of the model and thus cannot handle the data that the controller places in the Model.<br />
  - When Spring-Boot’s autoconfiguration detects Thymeleaf in the classpath, it creates beans supporting Thymeleaf view for Spring MVC.<br />
  - It can work with request attributes of Servlet.<br />
  - Therefore, Spring copies the model data into request attributes that the Thymeleaf template can work with. <br />

### Spring validation:-
After including Spring validation starter dependecy in pom.xml file . Now, it must be used to validate the information when user is entering the details at frontend. For that, I have used DTO objects to reduce remote calls. In DTO objects for each field I have used @NotNull and @Email annotations and @Valid annotation in handler method. So these annotations with the help of spring validation dependency ensures the user logged information are not null and valid email. It also ensures that every logged people have unique emails.

### Spring Security :-
