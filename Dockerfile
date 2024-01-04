FROM openjdk:11-jdk AS builder

# 작업 디렉터리를 설정합니다.
WORKDIR /sugang_BE

# 소스 코드를 Docker 이미지로 복사합니다.
COPY . .

# Spring Boot 애플리케이션을 JAR 파일로 빌드합니다.
RUN chmod +x ./gradlew && ./gradlew build

#---------------스테이지 나뉨-----------------------------

# 별도의 builder 스테이지에서 빌드를 완료한 후,
# 실제 이미지를 사용하여 최종 이미지를 구성합니다.
FROM openjdk:11-jdk

# 앱 디렉터리에 빌드 디렉터리 생성
RUN mkdir /app
WORKDIR /app

# builder 스테이지에서 빌드된 JAR 파일을 앱 디렉터리로 복사
COPY --from=builder /sugang_BE/build/libs/modoosugang_be-0.0.1-SNAPSHOT.jar /app/app.jar

# 포트 8081을 개방합니다.
EXPOSE 8081

RUN ls -al

# Spring Boot 애플리케이션을 실행합니다.
ENTRYPOINT ["java", "-jar", "/app/app.jar"]