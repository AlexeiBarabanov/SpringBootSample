package ru.inno.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import ru.inno.model.PlusRandomResult;
import ru.inno.services.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class RestCalculator {

    @Autowired
    RestClient restClient;

    @GET
    @Path("/plusRandom/{operand}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response plusRandom(@PathParam("operand") Integer operand) {
        return Response
                .status(200)
                .entity(new PlusRandomResult(2, 15, 15))
                .build();
    }
}
