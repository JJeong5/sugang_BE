FROM openjdk:11-jdk

# 소스 코드 및 Gradle 설정 파일 복사
WORKDIR /app
COPY . .

# 빌드 수행
RUN ./gradlew build

# 생성된 JAR 파일을 복사
ARG JAR_FILE=build/libs/modoosugang_be-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 포트 8081 개방
EXPOSE 8081

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
