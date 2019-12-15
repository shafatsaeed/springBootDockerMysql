# springBootDockerMysql
Spring boot + MySql deploy to docker container


#build the current spring-boot project first go to the root directory where Dockerfile is places
docker build . -t spring-boot-mysql

# To pull mysql image from docker hub
docker pull mysql

# To run MYSQL on a separate container
docker run --name docker-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=emp -e MYSQL_USER=user -e MYSQL_PASS
WORD=password -d mysql:latest --default-authentication-plugin=mysql_native_password

# To check docker images
docker ps

#To check docker machine ip
docker-machine ip

#To check docker container ip
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' spring-boot-mysql

#Link your app image with mysql image and run
docker run -p 9000:8090 --name spring-boot-mysql --link docker-mysql:mysql spring-boot-mysql
