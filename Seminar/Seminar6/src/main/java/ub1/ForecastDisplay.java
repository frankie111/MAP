package ub1;

public class ForecastDisplay implements Display, Observer{
    public ForecastDisplay(Observable observable) {
        observable.add(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int temperature, int luftfeuchtigkeit, float luftDruck) {

    }
}
