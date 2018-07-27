FROM openjdk:8-jdk-alpine
EXPOSE 8302
ARG JAR_FILE=target/itineraries-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} itineraries.jar
ENTRYPOINT ["java","-jar","/itineraries.jar"]
