FROM openjdk:8-jdk-alpine
EXPOSE 8302
ARG JAR_FILE=target/service-registry-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} service-registry.jar
ENTRYPOINT ["java","-jar","/service-registry.jar"]
