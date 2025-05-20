FROM amazoncorretto:21-alpine-jdk

MAINTAINER lucaslatessa

COPY target/lucas-0.0.1-SNAPSHOT.jar lucas.jar

ENTRYPOINT ["java","-jar","/lucas.jar"]
