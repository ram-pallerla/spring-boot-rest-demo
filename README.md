# Spring Boot Rest Demo
### Example that shows how to use RestController

## Setup and Installation
Please install Java 17 and Maven.

To run the application locally on <b>intelliJ</b>, just run the SpringBootRestDemo.java main class

To run the application from <b>command line:</b>
```
mvn clean package
java -jar target/springbootrestdemo.jar
```

## REST API
```
GET: http://localhost:8080/restdemo/hello

GET: http://localhost:8080/restdemo/bye
```
## Health Check


For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

