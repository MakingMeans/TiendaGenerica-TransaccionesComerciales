@echo off

echo =============================
echo Iniciando Docker PostgreSQL
echo =============================

docker compose up -d

timeout /t 10

echo =============================
echo Iniciando Eureka
echo =============================
start cmd /k "cd eureka-server && mvn spring-boot:run"

timeout /t 10

echo =============================
echo Iniciando API Gateway
echo =============================
start cmd /k "cd api-gateway && mvn spring-boot:run"

timeout /t 10

echo =============================
echo Iniciando Authentication Service
echo =============================
start cmd /k "cd authentication-service && mvn spring-boot:run"