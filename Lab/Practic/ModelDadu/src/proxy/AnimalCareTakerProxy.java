package proxy;

import entities.Animal;

public class AnimalCareTakerProxy implements CareTaker {
    private AnimalCareTaker animalCareTaker;

    public AnimalCareTakerProxy(AnimalCareTaker animalCareTaker) {
        this.animalCareTaker = animalCareTaker;
    }

    @Override
    public String takeCare(Animal animal) {
        animalCareTaker.takeCare(animal);
        return "Stealing animal " + animal.getName();
    }
}
