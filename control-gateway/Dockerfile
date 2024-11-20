FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu
LABEL maintainer="Brayan Martinez<brayanmartinez827@gmail.com>"

ENV WORKDIR_BASE=/home/application

EXPOSE 80:80

WORKDIR $WORKDIR_BASE

COPY ./build/libs/control-gateway-0.0.1-SNAPSHOT.jar control-gateway.jar

ENTRYPOINT java -jar control-gateway.jar

