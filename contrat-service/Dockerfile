FROM openjdk:8-jdk-alpine
ADD target/contrat-service.jar contrat-service.jar
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "/contrat-service.jar"]
