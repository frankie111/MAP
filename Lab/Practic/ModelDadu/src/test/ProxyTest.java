package test;

import entities.Animal;
import proxy.AnimalCareTaker;
import proxy.AnimalCareTakerProxy;

public class ProxyTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Gion", "Urs", 21, "Barlog", "Healthy");
        AnimalCareTakerProxy proxy = new AnimalCareTakerProxy(new AnimalCareTaker());
        assert proxy.takeCare(animal).equals("Stealing animal Gion");
    }
}
