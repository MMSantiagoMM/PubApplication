FROM openjdk:17
ADD target/pub3-0.0.1-SNAPSHOP app.jar
ENTRYPOINT ["java","-jar","app.jar.jar"]