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

ARG JAR_FILE=gateway-0.0.1-SNAPSHOT.jar
ARG JAR_NAME=gateway.jar

COPY --from=build target/${JAR_FILE} ${JAR_NAME}

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "gateway.jar"]



FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/gateway-0.0.1-SNAPSHOT.jar gateway-server.jar
ENTRYPOINT ["java", "-jar", "/gateway-server.jar"]