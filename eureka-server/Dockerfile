FROM adoptopenjdk/openjdk11:alpine-slim as build

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
# clean up the file
RUN sed -i 's/\r$//' mvnw
# run with the SH path
RUN /bin/sh mvnw dependency:resolve

COPY src src
RUN ./mvnw package -DskipTests

FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=eureka-server-0.0.1-SNAPSHOT.jar
ARG JAR_NAME=eureka-server.jar

COPY --from=build target/${JAR_FILE} ${JAR_NAME}

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]