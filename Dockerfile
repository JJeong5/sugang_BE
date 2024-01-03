FROM openjdk:11-jdk

# JAVA_HOME 환경 변수를 설정합니다.
ENV JAVA_HOME /usr/local/openjdk-11

# 작업 디렉터리를 설정합니다.
WORKDIR /sugang_BE

# 소스 코드를 Docker 이미지로 복사합니다.
COPY . .

# Spring Boot 애플리케이션을 JAR 파일로 빌드합니다.
RUN chmod +x ./gradlew && ./gradlew build

RUN ls -l ./build/libs

# 생성된 JAR 파일을 복사합니다.
COPY ./build/libs/modoosugang_be-0.0.1-SNAPSHOT.jar app.jar

# 포트 8081을 개방합니다.
EXPOSE 8081

# Spring Boot 애플리케이션을 실행합니다.
ENTRYPOINT ["java", "-jar", "/app.jar"]