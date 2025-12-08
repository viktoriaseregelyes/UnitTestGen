#############################
# 1. Build Angular frontend
#############################
FROM node:20 AS frontend-build
WORKDIR /app

COPY ../frontend ./frontend

WORKDIR /app/frontend
RUN npm install
RUN npm run build

#############################
# 2. Build Spring Boot backend
#############################
FROM maven:3.9.6-eclipse-temurin-21 AS backend-build
WORKDIR /app

COPY . .
COPY --from=frontend-build /app/frontend/dist/frontend/browser/ ./src/main/resources/static/

RUN mvn -f pom.xml clean package -DskipTests

#############################
# 3. Runtime image
#############################
FROM eclipse-temurin:21-jdk
WORKDIR /app

COPY --from=backend-build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]