package ub1;

public class SpielKarte {
    private Color color;
    private int wert;

    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color = color;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public SpielKarte(Color color, int wert) {
        this.color = color;
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "SpielKarte{" +
                "color='" + color + '\'' +
                ", wert=" + wert +
                '}';
    }
}
