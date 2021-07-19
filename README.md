# Spring-Security Using Basic Authentication

## DESCRIPTION
Simple project `Spring-Boot` and `spring-security` using `Basic Authentication`.

## Instalation
Step for installation:
```sh
# Clone this project from github
git clone https://github.com/saptarga/spring-boot-basic-authentication.git

# Clears the target directory and builds the project
mvn clean install
```

## Configuration
Step for configuration:
- Create new database in postgresql
- Set database name, user, and password in `application-properties`
- Create table `sec_user`
```sh 
    create table sec_user(
        id bigserial primary key,
        username varchar,
        email varchar,
        full_name varchar,
        password varchar,
        app_user_role varchar
    );
```

## Run Project
You can start this project using
```sh
mvn clean spring-boot:run
```

## Make Requests
Register User
```sh
POST /user/register HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 164

{
    "username": "saptarga",
    "email": "saptarga@gmail.com",
    "fullName": "Sapta Arga",
    "password": "1234567890",
    "appUserRole": "ROLE_ADMIN"
}
```

Get List User
```sh
GET /user HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Basic c2FwdGFyZ2E6MTIzNDU2Nzg5MA==
```

## Author
Created and maintained by saptarga ([@saptarga](https://www.linkedin.com/in/saptarga)).

Feel free if you have question for this project.