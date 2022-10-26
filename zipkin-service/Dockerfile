FROM openjdk:8-jdk-alpine
ADD target/zipkin-service.jar zipkin-service.jar
EXPOSE 9411
ENTRYPOINT ["java", "-jar", "/zipkin-service.jar"]
