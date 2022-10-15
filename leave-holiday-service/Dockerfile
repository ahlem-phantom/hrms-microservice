FROM openjdk:8-jdk-alpine
ADD target/leave-holiday-service.jar leave-holiday-service.jar
EXPOSE 5555
ENTRYPOINT ["java", "-jar", "/leave-holiday-service.jar"]
