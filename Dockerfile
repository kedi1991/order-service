FROM openjdk:17-ea-10-slim
WORKDIR /app 
COPY target/orders-service-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]