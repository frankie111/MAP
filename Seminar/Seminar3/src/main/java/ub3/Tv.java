package ub3;

import java.util.Iterator;
import java.util.List;

public class Tv implements Iterable<String> {
    private String brand;
    private List<String> channels;
    private int index;
    private Remote remote;

    public Tv(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
        this.index = 0;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public String channelUp() {
        if (index < channels.size() - 1)
            index++;
        else {
            index = 0;
            System.out.println("Channel: " + channels.get(index));
        }

        return channels.get(index);

    }

    public String channelDown() {
        if (index > 0)
            index--;
        else {
            index = channels.size() - 1;
            System.out.println("Channel: " + channels.get(index));
        }

        return channels.get(index);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", current channels=" + channels.get(index) +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @Override
    public Iterator<String> iterator() {
        return remote;
    }
}
