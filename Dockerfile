FROM openjdk:11-jdk
VOLUME /tmp
WORKDIR /app
COPY target/achat-1.0.jar /app/achat-1.0.jar
EXPOSE 8020
CMD ["java", "-jar", "/app/achat-1.0.jar"]
