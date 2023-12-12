package ub1;

public class CurrentConditionsDisplay implements Display, Observer{
    private WeatherData weatherData;
    public int temperature;
    public int luftfeuchtigkeit;
    public float luftDruck;

    public CurrentConditionsDisplay(Observable weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println(weatherData);
    }

    @Override
    public void update(int temperature, int luftfeuchtigkeit, float luftDruck) {
        this.temperature = temperature;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftDruck = luftDruck;
        display();
    }
}
