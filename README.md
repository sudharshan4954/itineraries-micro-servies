# itineraries-micro-servies

# The main ajenda of this project is 
  # 1.
    implement an API in order to expose the data related with a city defined with : city, destiny city,arival time, 
    departure time sored iin database
In this Challenge, designed microservices:s
- `itinerary-service` - For interactive with MySQL DB
- `consumer-service` - For consuming the itinerary-service api
- `eureka-service` - Service Registry for registering all microservices

# how to build these micro-servies
- use maven for building all these 3 projects

# how to run these micro-services
- once after done with build run 3 servies as a simples java project form you IDE
- All three projects are developed using Spring boot so we no need to deploy in externalised tomcat
- one can you embedded tomcat
- make sure all the services are up and running 

# how to use these micro-services
- All the servies are up and running 
- you can use opstman or rest client to test these servies by using below urls

- http://localhost:8301/rest/itinary/lessintime/{hyderabad}
- http://localhost:8301/rest/itinary/lessinconnections/{hyderabad}
