FROM openjdk:21-jdk
LABEL authors="protim"
WORKDIR /app
COPY build/libs/@@APP_NAME@@-@@VERSION@@.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=docker", "-jar","./app.jar"]