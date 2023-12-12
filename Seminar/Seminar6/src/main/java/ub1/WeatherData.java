package ub1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private List<Observer> observers;
    public int temperature;
    public int luftfeuchtigkeit;
    public float luftDruck;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers)
            obs.update(temperature, luftfeuchtigkeit, luftDruck);
    }

    public void setMeasurements(int temperatur, int luftfeuchtigkeit, float luftDruck) {
        this.temperature = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftDruck = luftDruck;
        notifyObservers();
    }
}
