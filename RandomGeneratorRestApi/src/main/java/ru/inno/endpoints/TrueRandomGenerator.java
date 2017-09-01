package ru.inno.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/api")
public class TrueRandomGenerator {

    @GET
    @Path("/getRandom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response plusRandom() {
        return Response
                .status(200)
                .entity(new Random().nextInt(100))
                .build();
    }
}
