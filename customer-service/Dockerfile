FROM openjdk:8-jdk-alpine
ADD target/customer-service.jar customer-service.jar
EXPOSE 8542
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]
