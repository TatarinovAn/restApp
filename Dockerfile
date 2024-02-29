FROM openjdk:17

EXPOSE 8080

ADD target/restApp-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]