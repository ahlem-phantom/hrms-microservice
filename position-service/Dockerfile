FROM openjdk:8-jdk-alpine
ADD target/discovery-service.jar discovery-service.jar
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "/discovery-service.jar"]
