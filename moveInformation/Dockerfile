# 1. Construcción del proyecto (Compila tu código de Spring Boot)
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Ejecución de la API (Crea el mini-servidor final optimizado)
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]