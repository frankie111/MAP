package ub2;

import java.util.List;

public class City {
    private String name;
    private String country;
    List<Temperature> temperaturesList;

    public City(String name, String country, List<Temperature> temperaturesList) {
        this.name = name;
        this.country = country;
        this.temperaturesList = temperaturesList;
    }

    public void addTemperature(String cityName, Temperature temp) {
        for (City c : cities) {
            if (c.getName().equals(cityName)) {
                for(Temperature temperature: temp)
            }
        }

        temperaturesList.add(temp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Temperature> getTemperaturesList() {
        return temperaturesList;
    }

    public void setTemperaturesList(List<Temperature> temperaturesList) {
        this.temperaturesList = temperaturesList;
    }
}
