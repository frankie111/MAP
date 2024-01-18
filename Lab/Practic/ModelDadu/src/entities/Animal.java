package entities;

public class Animal {
    private String name;
    private String species;
    private Integer age;
    private String enclosureType;
    private String healthStatus;

    public Animal(String name, String species, Integer age, String enclosureType, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.enclosureType = enclosureType;
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%s,%s", name, species, age, enclosureType, healthStatus);
    }

    public static Animal fromString(String str) {
        String[] values = str.split(",");
        return new Animal(values[0], values[1], Integer.parseInt(values[2]), values[3], values[4]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
