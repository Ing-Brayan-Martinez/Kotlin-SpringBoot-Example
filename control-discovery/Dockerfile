FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu
LABEL maintainer="Brayan Martinez<brayanmartinez827@gmail.com>"

ENV WORKDIR_BASE=/home/application

EXPOSE 8761:8761

WORKDIR $WORKDIR_BASE

COPY ./build/libs/control-discovery-0.0.1-SNAPSHOT.jar control-discovery.jar

ENTRYPOINT java -jar control-discovery.jar

