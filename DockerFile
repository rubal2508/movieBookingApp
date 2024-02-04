 FROM eclipse-temurin:17-jdk-alpine
 WORKDIR /app
 COPY target/movieBookingApp-0.0.1-SNAPSHOT.jar movieBookingApp-0.0.1-SNAPSHOT.jar
 EXPOSE 8080
 CMD ["java","-jar","movieBookingApp-0.0.1-SNAPSHOT.jar"]
