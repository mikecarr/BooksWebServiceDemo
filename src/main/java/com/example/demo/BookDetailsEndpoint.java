package com.example.demo;

import net.mikecarr.books.BookDetails;
import net.mikecarr.books.GetBookDetailsRequest;
import net.mikecarr.books.GetBookDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookDetailsEndpoint {

    @PayloadRoot(namespace = "http://mikecarr.net/books", localPart = "GetBookDetailsRequest")
    @ResponsePayload
    public GetBookDetailsResponse processBookDetailsRequest(@RequestPayload GetBookDetailsRequest request) {
        GetBookDetailsResponse response = new GetBookDetailsResponse();

        BookDetails studentDetails = new BookDetails();
        studentDetails.setId(request.getId());
        studentDetails.setName("Adam");
        studentDetails.setIsbn("E1234567");

        response.setStudentDetails(studentDetails);

        return response;
    }

}
