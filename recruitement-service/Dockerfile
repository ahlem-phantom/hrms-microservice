FROM openjdk:8-jdk-alpine
ADD target/recruitement-service.jar recruitement-service.jar
EXPOSE 4444
ENTRYPOINT ["java", "-jar", "/recruitement-service.jar"]
