FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu
LABEL maintainer="Brayan Martinez<brayanmartinez827@gmail.com>"

ENV WORKDIR_BASE=/home/application

EXPOSE 80:80

WORKDIR $WORKDIR_BASE

COPY ./target/control-gateway.jar control-gateway.jar

ENTRYPOINT java -jar control-gateway.jar

