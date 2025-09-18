package com.mycompany.msaclient.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8085/MSAApp/rest/example")
public interface ExampleClient {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String get();
}
