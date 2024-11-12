# 1. OpenJDK 17 이미지를 사용하여 기본 이미지로 설정합니다.
FROM openjdk:17-oracle

# 2. 애플리케이션 JAR 파일을 컨테이너의 루트 디렉터리로 복사합니다.
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar app.jar

# 3. 컨테이너 시작 시 JAR 파일을 실행하는 명령어를 설정합니다.
ENTRYPOINT ["java", "-jar", "app.jar"]
