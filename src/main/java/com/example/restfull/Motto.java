package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.net.URL;

@Path("/motto")
public class Motto {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {

        //TODO odczyt z pliku sciezka wzgledna
       // InputStream path = this.getClass().getResourceAsStream("/motta.txt");

        String filePath = "C:\\apps\\Restfull\\src\\main\\resources\\pliki\\motta.txt";
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