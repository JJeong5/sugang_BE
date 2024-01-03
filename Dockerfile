FROM openjdk:11-jdk

# 작업 디렉터리를 설정합니다.
WORKDIR /sugang_BE

# 소스 코드 및 Gradle 설정 파일을 Docker 이미지로 복사합니다.
COPY . .

# 빌드를 수행합니다.
RUN ./gradlew build

# 생성된 JAR 파일을 복사합니다.
ARG JAR_FILE=/build/libs/modoosugang_be-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 포트 8081을 개방합니다.
EXPOSE 8081

# 애플리케이션을 실행합니다.
ENTRYPOINT ["java", "-jar", "/app.jar"]
