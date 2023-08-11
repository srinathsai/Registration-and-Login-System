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
Spring Security is a framework that allows a programmer to use JEE components to set security limitations on Spring-framework-based Web applications. In a nutshell, it’s a library that can be utilized and customized to suit the demands of the programmer. Because it is a part of the same Spring family as Spring Web MVC, it works well together. Its major function is to manage authentication and authorization at both the Web request and method invocation levels. Perhaps. The most significant benefit of this framework is that it is both strong and very adaptable. Although it adheres to Spring’s set up conventions, programmers may select between default provisions and modify it to their specific requirements. Spring security works on the following four core concepts <br />

  - Authentication (Spring security provides a default username and password which we will change according to our case).
  - Authorization (Spring security provides role based security like for specific roles we can restrict acess).
  - Password Storage (Spring security can store password in encrpted form and is usually done by Bcrypt algorithm).
  - Servlet Filters

## Tools required :-
  - MYSQL Database
  - Intellj Idea.

## Steps of Execution :-
  - First, download the code and open it in IntelliJIdea or any Java IDE.(Note you no need to add any configurations for Spring or you no need to adjust any dependency version because here by using Spring initializer necessary dependencies with recent versions have been added and it is reflected in Pom.xml file.)< br />
  - In application.properties file change Spring.datasource url to your MySQL url which at the time of installing MySQL you would get this url.
  - Change username and password in application.properties file of yours that you have set while installing MySQL .
  - Change hibernate dialect to MySQL dialect.(Note just change urls that are present on right hand side of equal to sign in Applications.properties file).
  - Now for playing with this system you need to type url localhost:8080/login in web browser . Then you can have your registration and login system by simply clicking on respective buttons.
    
