
FROM openjdk:8-jdk-alpine
EXPOSE 8301

# The application's jar file
ARG JAR_FILE=target/consumer-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} consumer-service.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/consumer-service.jar"]
