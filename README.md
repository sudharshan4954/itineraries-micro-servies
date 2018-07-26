# itineraries-micro-servies

# The main ajenda of this project is 
  # 1.
    Implement an API in order to expose the data related with a city defined with : city, 
    destiny city,arival time, departure time sored in database
   # 2
    Implementing rest servies that consumes above API in order to calculate the shortest way 
    to travel from one city to another,independent of the departure time
In this Challenge, designed microservices:s
- `itinerary-service` - For interactive with MySQL DB
- `consumer-service` - For consuming the itinerary-service api
- `eureka-service` - Service Registry for registering all microservices

# how to build these micro-servies
- use maven for building all these 3 projects

# how to run these micro-services
- Once after done with build run 3 servies as a simples java project form you IDE
- All three projects are developed using Spring boot so we no need to deploy in externalised tomcat
- We can use embedded tomcat
- make sure all the services are up and running 

# how to use these micro-services
- Once all the servies are up and running 
- you can use opstman or rest client to test these servies by using below urls

- http://localhost:8301/rest/itinary/lessintime/{cityname}

- http://localhost:8301/rest/itinary/lessinconnections/{cityname}
