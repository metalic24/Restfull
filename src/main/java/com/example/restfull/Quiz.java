package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Path("/quiz")
public class Quiz {




    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public InputStream hello() throws IOException {



        Quiz obj = new Quiz();

        StringBuilder out = new StringBuilder();
        InputStream inputStream = obj.getClass()
                .getClassLoader()
                .getResourceAsStream("quiz.json");
        //zwróbenie pliku json
        return inputStream;

    }
}
