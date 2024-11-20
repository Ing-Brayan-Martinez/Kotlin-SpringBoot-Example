#bin/bash

# https://blog.codmind.com/establecer-quotas-o-maximos-de-uso-de-cpu-ram-y-disco-de-un-contenedor-docker/
# https://dockertips.com/Recursos_usados

docker build -t example.com/control-discovery:latest .

docker build -t example.com/control-discovery:latest ./control-discovery/

docker run --name control-discovery -p 8761:8761 example.com/control-discovery:latest

docker run --name control-discovery -p 8761:8761 --env-file ./conf/back.env example.com/control-discovery:latest

docker run -d --cpus 2 --memory 4GB --name control-discovery -p 8761:8761 --image example.com/control-discovery:latest
