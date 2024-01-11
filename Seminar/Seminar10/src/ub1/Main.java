package ub1;

import ub1.Country;
import ub1.CountryFileReader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryFileReader reader = new CountryFileReader();
        List<Country> filtered = reader.filterFromFile("D:\\Dev\\MAP\\Seminar\\Seminar10\\src\\laender.txt");
        reader.writeToFileCSV(filtered, "D:\\Dev\\MAP\\Seminar\\Seminar10\\src\\filtered.txt");
        System.out.println(filtered);
    }
}
