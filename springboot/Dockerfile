FROM azul/zulu-openjdk-alpine:21.0.1
EXPOSE 8080
ADD target/springboot-latest.jar springboot.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]