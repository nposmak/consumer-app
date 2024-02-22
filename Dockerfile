FROM openjdk:17
ADD target/consumer-app.jar consumer-app.jar
ENTRYPOINT ["java", "-jar", "/consumer-app.jar"]