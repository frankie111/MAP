package ub1;

public class StatisticsDisplay implements Display, Observer{
    private WeatherData weatherData;
    public int temperature;
    public int luftfeuchtigkeit;
    public float luftDruck;
    public StatisticsDisplay(Observable observable) {
        observable.add(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int temperature, int luftfeuchtigkeit, float luftDruck) {

    }
}
