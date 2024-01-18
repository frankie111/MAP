package thread;

import entities.Animal;

public class ThreadTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Gion", "Urs", 21, "Barlog", "Sick");
        DoctorThread doctorThread = new DoctorThread(animal);
        DiseaseThread diseaseThread = new DiseaseThread(animal);

        doctorThread.start();
        diseaseThread.start();
    }
}
