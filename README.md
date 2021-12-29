# fluffy-doodle
A template of rest service, the purpose is generate a sample of rest service with created and organized packcages.

**suggested structure**
```
resttemplate/
├─ controller/
├─ service/
│  ├─ impl/
│  ├─ intrface/
├─ model/
│  ├─ repository/
│  ├─ entity/
├─ dto/
│  ├─ request/
│  ├─ response/
```

## Dependencies
-  Actuator - for metrics [http://localhost:8080/actuator](http://localhost:8080/actuator "http://localhost:8080/actuator")
-  SwaggerUI + OpenAPI [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/ "http://localhost:8080/swagger-ui/index.html#/")
-  H2 [http://localhost:8080/h2](http://localhost:8080/h2 "http://localhost:8080/h2")
- lombok [https://projectlombok.org/](https://projectlombok.org/ "https://projectlombok.org/") ***check the install section***

## Run it!
In commandline
```shell
gradle bootRun
```
or
```shell
./gradlew bootRun
```
