# Java-Spring-Boot-Microservices


Microservices with Spring Boot – Building Microservices Application Using Spring Boot. Implement a spring boot application with patient’s appointment details [you don’t have to implement a web application for this, you just a database table with all patient appointment details like id, name, email, appointment date and time et
You also need to create required java beans,repo, services, and controllers. You need to test all end points of patient api, a sample json is like below. Also need to create one end point where the patient can send a json doc with http post method[since we are not making any UI here, we are just using postman tool sending POST methods json data to mysql database ]


What I Learned:

Microservices with Spring Boot,

Spring cloud,

API gateway,

Client API,

MySQL,

Eureka server,

Configuration server, and Core service


In Eclipse, run PatientMicroservices, PatientDiscoveryServer, and PatientConfigServer as a Spring Boot App and in your browser; go to http://localhost:8081/. Now we will go to the eurekaserver directory from the terminal and will run mvn spring-boot:run. As we configured the eureka server to port 8081, it will listen to 8081 port.Then we will go to the config server and run mvn spring-boot:run command. As we configured the config server at port 8082, it will listen to port 8082.

Now we will run our core service PatientMicroservices. It will listen to port 8083. Now all servers are running. So, we can test now. At first, we will check the eureka server at http://localhost:8081/. Now we will check PatientMicroservices through Postman App.First, we will create a profile through Postman and make a POST request.

