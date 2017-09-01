package ru.inno;

//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ru.inno.services.RestClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.net.HttpURLConnection;
import java.net.URI;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class RestCalculatorTest {


    @LocalServerPort
    private int port;
    private URI uri;

    @Before
    public void setUp() throws Exception {
        this.uri = new URI("http://localhost:" + port);
    }

    @TestConfiguration
    static class RestClientTestContextConfiguration {
        @Bean
        public RestClient restClient() {
            return () -> 77;
        }
    }

    @MockBean
    private RestClient restClient;

    @Autowired
    private MockMvc mvc;

    @Test
    public void plusRandomTest() throws Exception {

//        this.mvc.perform(get(uri.toString() + "/api/plusRandom/10")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString()));

//        Integer operand = 100;
//        Client client = ClientBuilder.newClient();
//        Response response = client.target(uri)
//                .path("api")
//                .path("plusRandom")
//                .path(String.valueOf(operand))
//                .request(MediaType.APPLICATION_JSON).get();
//
//        assertEquals(response.getStatus(), HttpURLConnection.HTTP_OK);
    }
}
