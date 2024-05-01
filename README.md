# Read Me First


# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

This project proves that we can use both mongo and jpa repositories in one spring boot application by a configuratble property
it could be mongodb or jpa depending on which database you want to connect
```java
// 
api.core.svc.db.type=mongodb
#api.core.svc.db.type=jpa

```

you also need to update connections parameters in application-jpa.yml or application-mongodb.yml to connect to your database

```java
  datasource:
    driverClassName: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/test?currentSchema=public
    username: postgres
    password: password
```


