package com.example.soap.Service;

import com.example.soap.Model.Request;
import com.example.soap.Model.Response;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class MySoapService {
    private static final String NAMESPACE_URI = "http://example.com/mysoapservice";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "request")
    @ResponsePayload
    public Response handleMyRequest(@RequestPayload Request request) {
        float result = request.getNum1() + request.getNum2();
        Response response = new Response();
        response.setResult(result);
        return response;
    }
}
