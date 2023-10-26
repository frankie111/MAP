package ub3;

import java.util.Iterator;

public class SmartRemote extends Remote {

    public SmartRemote(Tv tv) {
        super(tv);
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        System.out.printf("Changing channels...");
        return tv.channelUp();
    }
}
