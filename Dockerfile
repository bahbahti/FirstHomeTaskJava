FROM openjdk:12-alpine

COPY target/executableMaven-1.0-SNAPSHOT.jar /executableMaven-1.0-SNAPSHOT.jar

CMD ["java" , "-jar", "/executableMaven-1.0-SNAPSHOT.jar"]
