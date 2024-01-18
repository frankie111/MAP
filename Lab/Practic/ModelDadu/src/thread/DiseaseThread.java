package thread;

import entities.Animal;

public class DiseaseThread extends Thread {
    final Animal animal;

    public DiseaseThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (animal) {
                if (animal.getHealthStatus().equals("Healthy")) {
                    System.out.println("Waiting 2 seconds");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Making animal sick");
                    animal.setHealthStatus("Sick");
                }
            }
        }
    }
}
