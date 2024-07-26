FROM openjdk:17
LABEL authors="Oscar"
ADD target/spring-cicd-image.jar spring-cicd-image.jar
ENTRYPOINT ["java", "-jar", "/spring-cicd-image.jar"]