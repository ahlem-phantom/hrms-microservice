FROM openjdk:8-jdk-alpine
ADD target/conge-service.jar conge-service.jar
EXPOSE 5555
ENTRYPOINT ["java", "-jar", "/conge-service.jar"]
