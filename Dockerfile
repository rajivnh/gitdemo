FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/gitdemo-0.0.1-SNAPSHOT.jar gitdemo.jar
ENTRYPOINT ["java","-jar","/gitdemo.jar"]