#bin/bash

docker build -t example.com/control-gateway:latest .

docker build -t example.com/control-gateway:latest ./control-gateway/

docker run --name control-gateway -p 80:80 example.com/control-gateway:latest