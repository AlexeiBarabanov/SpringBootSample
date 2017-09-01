package ru.inno.services;

import org.glassfish.jersey.uri.internal.JerseyUriBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClientImpl implements RestClient {

    public Integer getRandomNumber() {
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://127.0.0.1:8081")
                .path("api")
                .path("getRandom")
                .request(MediaType.APPLICATION_JSON).get();

        String randomNumber = response.readEntity(String.class);
        return Integer.valueOf(randomNumber);
    }
}
