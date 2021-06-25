package org.acme.rest.json;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruits")
public class FruitResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    @Path("/hello")
    public String hello() {
        return "Hello RESTEasy";
    }
}