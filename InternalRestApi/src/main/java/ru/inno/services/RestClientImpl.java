package ru.inno.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class RestClientImpl implements RestClient {

//    private static final

    public String getRandomNumber() {
        Client client = ClientBuilder.newClient();
//        Response response = client.target()
        return "Hello world";
    }
}
