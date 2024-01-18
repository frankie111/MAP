package thread;

import entities.Animal;

public class DoctorThread extends Thread {
    final Animal animal;

    public DoctorThread(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (animal) {
                if (animal.getHealthStatus().equals("Sick")) {
                    System.out.println("Healing animal");
                    animal.setHealthStatus("Healthy");
                }
            }

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

    }
}
