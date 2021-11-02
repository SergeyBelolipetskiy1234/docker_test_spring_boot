FROM openjdk:11.0.7-jdk-slim
COPY target/dockerForRepository-0.0.1-SNAPSHOT.jar /demo.jar
EXPOSE 8080
CMD ["java", "-jar", "/demo.jar"]

