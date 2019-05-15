FROM maven:3.5.2-jdk-8-alpine AS stageofjar
WORKDIR /FirstHomeWork/
COPY . .
RUN mvn clean package


FROM openjdk:12-alpine
COPY --from=stageofjar /FirstHomeWork/target/executableMaven-1.0-SNAPSHOT.jar .

CMD ["java" , "-jar", "/executableMaven-1.0-SNAPSHOT.jar"]
