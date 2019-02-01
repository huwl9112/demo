#通过idea命令生成镜像，需配置dockerfile启动
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demo-0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]