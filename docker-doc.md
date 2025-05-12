## postgresql 실행
```text
docker run -p 5432:5432 --name e-commerce-db -e POSTGRES_PASSWORD=postgres -e TZ=Asia/Seoul -d postgres:latest
```