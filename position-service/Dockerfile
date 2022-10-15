FROM openjdk:8-jdk-alpine
ADD target/position-service.jar position-service.jar
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "/position-service.jar"]
