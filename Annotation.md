## Core Spring FrameWork Annotations
        @Required : it applies to  the bean "setter" method
         BeanInitilizationException -> it trows exeption if the @Required annotaion does not met the required property

        @Autowired : It is used to autowire spring bean on setter methods, instance variable, and constructor.

        @Configuration : It is a class-level annotation. @Configuration used by Spring Containers as a source of bean definitions.

        @ComponentScan : It is used when we want to scan a package for beans.

        @Bean : It is a method-level annotation. It is an alternative of XML <bean> tag. It tells the method to produce a bean to be managed by Spring Container.

## Spring Framework Stereotype Annotations

        @Component : It is a class-level annotation. It is used to mark a Java class as a bean.
                     The Spring Framework pick it up and configure it in the application context as a Spring Bean.
        
        @Controller : The @Controller is a class-level annotation. It is a specialization of @Component. It marks a class as a web request handler.
                      It is mostly used with @RequestMapping annotation.

        @Service : It is also used at class level. It tells the Spring that class contains the business logic.

        @Repository : It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly.
                     The repository does all the operations related to the database.


## Spring Boot Annotations
    
    @EnableAutoConfiguration : It auto-configures the bean that is present in the classpath and configures it to run the methods. 
                              The use of this annotation is reduced in Spring Boot 1.2.0 release because developers provided an alternative of the annotation, i.e. @SpringBootApplication.
    
    @SpringBootApplication : It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.

## Spring MVC and REST Annotations

    @RequestMapping: It is used to map the web requests. It has many optional elements like consumes, header, method, name, params, path, produces, and value. 
                     We use it with the class as well as the method.



## References
    https://www.javatpoint.com/spring-boot-annotations

