#
# Build stage
#
FROM maven:3.8.5-eclipse-temurin-11-alpine AS build

COPY src /home/ucal/src/
COPY pom.xml /home/ucal/

WORKDIR /home/ucal

RUN mvn clean install
RUN mvn package

#
# Ucal launch
#
FROM eclipse-temurin:11-alpine AS app
COPY --from=build /home/ucal/target/*.jar /opt/app/app.jar
CMD ["java","-jar","/opt/app/app.jar"]