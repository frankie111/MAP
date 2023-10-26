package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<org.example.Student> read_students(String fileName) throws IOException {
        List<org.example.Student> students = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(bufferedReader);

        for (JsonNode studentNode : root.path("students")) {
            Student student = new Student();
            Address address = new Address();

            student.setId(studentNode.path("id").asInt());
            student.setName(studentNode.path("name").asText());
            student.setUni(studentNode.path("uni").asText());

            JsonNode addressNode = studentNode.get("address");
            address.setCity(addressNode.path("city").asText());
            address.setStreet(addressNode.path("street").asText());

            student.setAddress(address);
            students.add(student);
        }

        return students;
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(read_students("data.json"));
//        }
//        catch (IOException ex) {
//            System.out.println("File not found...");
//        }
        RemoteFactory rf = new RemoteFactory();

        Tv tv = new Tv("cheap", List.of("Digi", "Antena3", "KanalD"));

        Remote basic = rf.createRemote("basic", tv);
        tv.setRemote(basic);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        //Remote remote = (Remote) tv.iterator();

        basic.next();
        basic.next();

        System.out.println(tv);

        Remote smart = rf.createRemote("smart", tv);
        tv.setRemote(smart);

        smart.next();
        smart.next();

        System.out.println(tv);
    }
}