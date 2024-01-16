import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnimalUtils {
    public static ArrayList<Animal> readFromCSV(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<Animal> animals = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Animal animal = new Animal(values[0], values[1], Integer.parseInt(values[2]), values[3], values[4]);
            animals.add(animal);
        }

        return animals;
    }

    public static ArrayList<Animal> readFromCSVStreams(String path) throws IOException {
        List<Animal> animals = Files.lines(Path.of(path))
                .map(Animal::fromString)
                .toList();

        return new ArrayList<>(animals);
    }

    public static void SpeciesCount(ArrayList<Animal> animals) {
        Map<String, Long> groupedBySpecies = animals
                .stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

        groupedBySpecies.forEach((species, count) -> {
            System.out.println(species + ":" + count);
        });
    }

    public static void saveSickAnimals(String path, ArrayList<Animal> animals) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        animals.stream()
                .filter(animal -> Objects.equals(animal.getHealthStatus(), "sick"))
                .map(Animal::getName)
                .forEach(animal -> {
                    try {
                        bw.write(animal + ",");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bw.close();
    }
}
