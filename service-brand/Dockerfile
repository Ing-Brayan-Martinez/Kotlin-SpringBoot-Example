FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu
LABEL maintainer="Brayan Martinez<brayanmartinez827@gmail.com>"

ENV WORKDIR_BASE=/home/application

EXPOSE 10001:10001

WORKDIR $WORKDIR_BASE

COPY ./target/data-balance-service.jar data-balance-service.jar

ENTRYPOINT java -jar data-balance-service.jar

