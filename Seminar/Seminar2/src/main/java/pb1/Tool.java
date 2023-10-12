package pb1;

public class Tool {
    private String name;
    private int weight;

    public Tool(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public boolean canCut() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "pb1.Tool{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
