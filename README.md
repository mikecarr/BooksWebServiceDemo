# Demo spring-boot-starter-web-services

Demo application using spring-boot-starter-web-services


### WSDL

http://localhost:8080/ws/books.wsdl

### Testing
```
curl --request POST --url http://localhost:9000/ws/ --data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"xmlns:book="http://mikecarr.net/books"><soapenv:Header/><soapenv:Body><book:GetBookDetailsRequest><book:id>45</book:id></book:GetBookDetailsRequest></soapenv:Body></soapenv:Envelope>'
```

* Chrome Extension: [Wizdler](https://chrome.google.com/webstore/detail/wizdler/oebpmncolmhiapingjaagmapififiakb)

### Docker

* Build
    ```console
    $ mvn install dockerfile:build
    ```

* Push to Dockerhub
    ```console
    $ mvn dockerfile:push
    ```
    
* Run
    ```console
    $ docker run -p 8080:9000 -t mcarr/books-webservice-demo
 
    ```

## References
* [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/)    
    