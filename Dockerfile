# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
