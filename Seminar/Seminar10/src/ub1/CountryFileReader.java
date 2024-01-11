package ub1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class CountryFileReader {
    public List<Country> filterFromFile(String filename) throws IOException {
        return Files.lines(Path.of(filename))
                .map(Country::fromString)
                .filter(country -> country.getName().startsWith("M") && country.getArea() > 10_000)
                .collect(Collectors.toList());
    }

    public void writeToFileCSV(List<Country> countries, String filename) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        countries.stream()
                .map(Country::toString)
                .forEach(country -> {
                    try {
                        bw.write(country);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        bw.close();
    }
}
