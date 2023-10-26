package ub3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv("cheap", List.of("Digi", "Antena3", "KanalD"));
        RemoteFactory rf = new RemoteFactory();
        Remote basic = (Remote) rf.createRemote("basic", tv);
        tv.setRemote(basic);
        basic.next();
        basic.next();
        basic.next();

        System.out.println(tv);
        Remote smart = (SmartRemote) rf.createRemote("smart", tv);
        smart.next();
        smart.next();

        System.out.printf('\n' + String.valueOf(tv));

    }
}
