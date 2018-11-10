package com.cossinisoftware.restfullDemo;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.io.IOException;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@Slf4j
public class ApiTests {

    private static final String BASE_URL = "http://localhost:8080/";

    @Test

    public void employeeDoesNotExists_whenEmployeeIsRetrieved_then404IsReceived()
            throws IOException, ClientProtocolException {
        Long employeeId = 4L;
        String requestUrl = BASE_URL + "employee/" + employeeId;
        log.info("Requesting: " + requestUrl);
        HttpUriRequest request = new HttpGet(requestUrl);

        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        assert(response.getStatusLine().getStatusCode() == HttpStatus.NOT_FOUND.value());
    }

}
