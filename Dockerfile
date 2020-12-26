FROM adoptopenjdk:8-jre-hotspot
RUN mkdir /app
WORKDIR /app
ADD target/pdfService-1.0.0-SNAPSHOT.jar /app
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "pdfService-1.0.0-SNAPSHOT.jar"]
