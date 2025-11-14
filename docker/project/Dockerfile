FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY gradlew .
COPY gradle ./gradle
COPY build.gradle .
COPY settings.gradle .
COPY src ./src

RUN ./gradlew bootJar --no-daemon -x test

CMD ["java", "-jar", "build/libs/project-0.0.1-SNAPSHOT.jar"]
