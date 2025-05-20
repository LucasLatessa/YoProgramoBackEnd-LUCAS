FROM eclipse-temurin:21-jdk-alpine

MAINTAINER lucaslatessa

COPY target/lucas-0.0.1-SNAPSHOT.jar lucas.jar

ENTRYPOINT ["java","-jar","/lucas.jar"]
