package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;

@Path("/quiz")
public class Quiz {

    //TODO sciezka wzgledna
    File file = new File("C:\\apps\\Restfull\\src\\main\\resources\\pliki\\quiz.json");


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public File hello() throws IOException {


        return file;
    }
}
