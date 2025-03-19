# Используем официальный образ с JDK 23
FROM openjdk:23-jdk-slim

# Указываем рабочую директорию внутри контейнера
WORKDIR /app

ENV DB_HOST=localhost
ENV DB_PORT=5432
ENV DB_USER=postgres
ENV DB_PASSWORD=1205200Ft
ENV DB_NAME=courses_db

# Копируем JAR файл в контейнер
COPY target/TeacherMicroservice-0.0.1-SNAPSHOT.jar /app/TeacherMicroservice.jar

# Открываем порт для приложения (если используется Spring Boot, по умолчанию 8080)
EXPOSE 8082

# Запускаем JAR файл при старте контейнера
ENTRYPOINT ["java", "-jar", "TeacherMicroservice.jar"]


