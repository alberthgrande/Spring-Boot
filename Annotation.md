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

    @GetMapping : It maps the HTTP GET requests on the specific handler method. 
                  It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)
 
    @PostMapping : It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates 
                   It is used instead of using: @RequestMapping(method = RequestMethod.POST)

    @PutMapping : It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using: 
                 @RequestMapping(method = RequestMethod.PUT)

    @DeleteMapping : It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: 
                    @RequestMapping(method = RequestMethod.DELETE)

    @PatchMapping : It maps the HTTP PATCH requests on the specific handler method. 
                    It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)

    @RequestBody : It is used to bind HTTP request with an object in a method parameter. 
                   Internally it uses HTTP MessageConverters to convert the body of the request. 
                   When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

    @ResponseBody : It binds the method return value to the response body. 
                    It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

    @PathVariable : It is used to extract the values from the URI. 
                    It is most suitable for the RESTful web service, where the URL contains a path variable. 
                    We can define multiple @PathVariable in a method.

    @RequestHeader : It is used to get the details about the HTTP request headers. 
                     We use this annotation as a method parameter. 
                     The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. 
                     We can use it multiple time in a method

    @RestController : It can be considered as a combination of @Controller and @ResponseBody annotations. 
                      The @RestController annotation is itself annotated with the @ResponseBody annotation. 
                      It eliminates the need for annotating each method with @ResponseBody.

    @RequestAttribute : It binds a method parameter to request attribute. 
                        It provides convenient access to the request attributes from a controller method. 
                        With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.
## References
    https://www.javatpoint.com/spring-boot-annotations

