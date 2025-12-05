#############################
# 1. Build Angular frontend
#############################
FROM node:20 AS frontend-build
WORKDIR /app/frontend

COPY frontend/package*.json ./

RUN npm ci
COPY frontend/ ./
RUN npx ng build --configuration production

#############################
# 2. Build Spring Boot backend
#############################
FROM maven:3.9.6-eclipse-temurin-21 AS backend-build
WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY --from=frontend-build /app/frontend/dist/frontend/. ./src/main/resources/static/

RUN mvn -B -DskipTests package

#############################
# 3. Runtime image
#############################
FROM eclipse-temurin:21-jdk
WORKDIR /app

COPY --from=backend-build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]