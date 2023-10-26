package ub3;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    protected Tv tv;

    public Remote(Tv tv) {
        this.index = 0;
        this.tv = tv;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        return tv.channelUp();
    }

}
