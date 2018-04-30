#!/bin/sh
mvn clean package && docker build -t com.pedantic/javaee-playground .
docker rm -f javaee-playground || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee-playground com.pedantic/javaee-playground 
