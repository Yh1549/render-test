FROM maven:3.8.3-openjdk:20-jdk-slim AS build
WORKDIR /app
COPY . /app/
RUN mvn clean package

FROM openjdk:20-jdk-slim
WORKDIR /app
COPY /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]