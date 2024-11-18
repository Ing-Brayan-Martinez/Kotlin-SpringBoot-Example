#bin/bash

# https://blog.codmind.com/establecer-quotas-o-maximos-de-uso-de-cpu-ram-y-disco-de-un-contenedor-docker/
# https://dockertips.com/Recursos_usados

docker build -t example.com/control-discovery:latest .

docker run --name control-discovery -p 8000:8000 example.com/control-discovery:latest

docker run --name control-discovery -p 8000:8000 --env-file ./conf/back.env example.com/control-discovery:latest

docker run -d --cpus 2 --memory 4GB --name control-discovery -p 8101:8101 --image example.com/control-discovery:latest
