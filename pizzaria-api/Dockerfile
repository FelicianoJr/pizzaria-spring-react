FROM openjdk:8
ADD /target/pizzaria-docker.jar pizzaria-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar", "pizzaria-docker.jar"]