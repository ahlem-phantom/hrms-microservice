FROM openjdk:8-jdk-alpine
ADD target/config-service.jar config-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/config-service.jar"]
