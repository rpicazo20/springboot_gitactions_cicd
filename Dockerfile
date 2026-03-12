FROM eclipse-eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/springboot_gitactions_cicd.jar springboot_gitactions_cicd.jar
ENTRYPOINT [ "java", "-jar", "springboot_gitactions_cicd.jar"]