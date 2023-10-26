package ub3;

import java.util.Iterator;
import java.util.Objects;

public class RemoteFactory {
    public Iterator<String> createRemote(String type, Tv tv) {
        if (Objects.equals(type, "basic"))
            return new Remote(tv);

        if (Objects.equals(type, "smart"))
            return new SmartRemote(tv);

        return null;
    }
}
