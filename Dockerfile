FROM openjdk:21-jdk
LABEL authors="protim"
WORKDIR /app
COPY build/libs/helloapi-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=docker", "-jar","./app.jar"]