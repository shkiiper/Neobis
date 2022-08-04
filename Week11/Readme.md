Dockerfile

1.download the image for postgres: docker pull postgres

2.run the postgres server docker run --name postgres-demo -e POSTGRES_DB=carwash -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres

3.create JAR file mvn clean package

4.build application container docker build -t demo .

5.run container docker run -d -p 8060:8060 --name demo --link postgres-carwash

docker-compose
1. run docker-compose ```docker-compose -f docker-compose up ```