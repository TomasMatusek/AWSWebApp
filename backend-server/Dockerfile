FROM openjdk:11-jdk

WORKDIR /app

COPY target/*.jar backend-server.jar

ENV JWT_SECRET=secret

ENTRYPOINT ["java","-jar","backend-server.jar"]