package proxy;


import entities.Animal;

public class AnimalCareTaker implements CareTaker{
    @Override
    public String takeCare(Animal animal) {
        return "Taking care of animal " + animal.getName();
    }
}
