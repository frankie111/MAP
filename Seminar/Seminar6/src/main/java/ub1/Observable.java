package ub1;

public interface Observable {
    public void add(Observer obs);
    public void remove(Observer obs);
    public void notifyObservers();
}
