package org.bolshakov.jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {

            // create obj mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and convert it to Java file
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            //print details
            System.out.println(theStudent.getFirstName());
            System.out.println(theStudent.getLastName());




    }
}
