package com.example.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

@Path("/motto")
public class Motto {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() throws IOException {

        Motto obj = new Motto();
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        StringBuilder out = new StringBuilder();
        InputStream inputStream = obj.getClass()
                .getClassLoader()
                .getResourceAsStream("motta.txt");

        String value = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            //każdego dnia pojawi się inne motto, ale będzie się pojawiać co 12 dni
        for (int i=0; i<dayOfMonth%12;i++)
        {
            byte ptext[] = reader.readLine().getBytes();
            value = new String(ptext, "UTF-8");

        }
        }


        return value;
    }
}