FROM openjdk:11-jdk
EXPOSE 8081
RUN ./gradlew build
ARG JAR_FILE=build/libs/modoosugang_be-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]