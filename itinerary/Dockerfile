
FROM openjdk:8-jdk-alpine
EXPOSE 8300
ARG JAR_FILE=target/itinerary-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} itinerary.jar
ENTRYPOINT ["java","-jar","/itinerary.jar"]
