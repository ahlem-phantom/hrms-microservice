FROM openjdk:8-jdk-alpine
ADD target/employee-service.jar employee-service.jar
EXPOSE 1111
ENTRYPOINT ["java", "-jar", "/employee-service.jar"]
