FROM amazoncorretto:11

MAINTAINER lucaslatessa

COPY target/lucas-0.0.1-SNAPSHOT.jar lucas-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/lucas-0.0.1-SNAPSHOT.jar"]

 