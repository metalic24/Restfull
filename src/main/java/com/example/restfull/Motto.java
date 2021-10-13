package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/motto")
public class Motto {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {



        return "Hello word";
    }
}