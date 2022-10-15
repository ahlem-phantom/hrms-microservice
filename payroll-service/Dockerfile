FROM openjdk:8-jdk-alpine
ADD target/payroll-service.jar payroll-service.jar
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "/payroll-service.jar"]
