import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Animal> animals = AnimalUtils.readFromCSVStreams("D:\\Dev\\MAP\\Lab\\Practic\\ModelDadu\\src\\animal_inventory.csv");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        System.out.println("\n");
        AnimalUtils.SpeciesCount(animals);
        AnimalUtils.saveSickAnimals("D:\\Dev\\MAP\\Lab\\Practic\\ModelDadu\\src\\sick_animals.txt", animals);
    }
}
