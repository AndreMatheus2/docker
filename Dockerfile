FROM openjdk

WORKDIR /app

COPY target/springapp-0.0.1-SNAPSHOT.jar /app/springapp.jar

ENTRYPOINT ["java", "-jar", "springapp.jar"]