FROM java:8-jdk-alpine

COPY ./target/spring-webflux-sample-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-webflux-sample-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-webflux-sample-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080