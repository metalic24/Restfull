package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Path("/motto")
public class Motto {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {


        String filePath = "target/Restfull-1.0-SNAPSHOT/WEB-INF/classes/pliki/motta.txt";
        String linia = "Witaj";
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            linia = fileReader.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        return linia;
    }
}