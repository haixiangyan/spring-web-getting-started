# spring-web-getting-started
第一个 Spring Web 项目

## Docker

Redis

```bash
docker run -p 6379:6379 -d redis
```

MySQL

```bash
docker run -d -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 mysql
```

Nginx
```bash
docker run --restart=always -v `pwd`/nginx.conf:/etc/nginx/nginx.conf:ro -p 80:80 -d nginx
```

## 启动方式

### exec

```bash
mvn compile exec:exec
```

### jar 包

```bash
mvn package # 得到 target/xxx.jar 包

java -Dserver.port=8081 -jar target/xxx.jar
```

### Dockerfile

```bash
docker build .

docker run -p 8082:8080 -v `pwd`/application.properties:/app/config/application.properties xxx
```
