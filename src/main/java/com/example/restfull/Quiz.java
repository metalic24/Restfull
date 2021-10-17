package com.example.restfull;

import org.json.JSONObject;
import org.json.JSONTokener;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Path("/quiz")
public class Quiz {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {


        return "hellow world";
    }
}
