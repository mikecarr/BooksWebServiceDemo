# Demo spring-boot-starter-web-services

Demo application using spring-boot-starter-web-services


### WSDL

http://localhost:8080/ws/books.wsdl

### Testing
```
curl --request POST --url http://localhost:9000/ws/ --data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"xmlns:book="http://mikecarr.net/books"><soapenv:Header/><soapenv:Body><book:GetBookDetailsRequest><book:id>45</book:id></book:GetBookDetailsRequest></soapenv:Body></soapenv:Envelope>'
```

* Chrome Extension: [Wizdler](https://chrome.google.com/webstore/detail/wizdler/oebpmncolmhiapingjaagmapififiakb)
