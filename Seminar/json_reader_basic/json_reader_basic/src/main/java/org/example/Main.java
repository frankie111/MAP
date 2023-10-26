package org.example;

import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {
//        try {
//            System.out.println(read_students("data.json"));
//        }
//        catch (IOException ex) {
//            System.out.println("File not found...");
//        }
//        RemoteFactory rf = new RemoteFactory();
//
//        Tv tv = new Tv("cheap", List.of("Digi", "Antena3", "KanalD"));
//
//        Remote basic = rf.createRemote("basic", tv);
//        tv.setRemote(basic);
//
//        tv.channelUp();
//        tv.channelUp();
//        tv.channelUp();
//        tv.channelUp();
//
//        System.out.println(tv);
//
//        //Remote remote = (Remote) tv.iterator();
//
//        basic.next();
//        basic.next();
//
//        System.out.println(tv);
//
//        Remote smart = rf.createRemote("smart", tv);
//        tv.setRemote(smart);
//
//        smart.next();
//        smart.next();
//
//        System.out.println(tv);

        try {
            JsonStudentParser parser = JsonStudentParser.getInstance();
            List<Student> students = parser.parse("data.json");

//            System.out.println(students);

            System.out.println(Statistics.studentByUni(students, "UBB"));
        } catch (IOException exception) {
            System.out.println("File not found");
        }

    }
}

