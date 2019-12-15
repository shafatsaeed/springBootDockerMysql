From openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-mysql.jar spring-boot-mysql.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-mysql.jar"]