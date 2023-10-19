package ub1;

import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<SpielKarte>{
    private List<SpielKarte> karten;

    public Deck(List<SpielKarte> karten) {
        this.karten = karten;
    }

    public void addKarte(SpielKarte s) {
        karten.add(s);
    }


    public List<SpielKarte> getKarten() {
        return karten;
    }

    public void setKarten(List<SpielKarte> karten) {
        this.karten = karten;
    }

    @Override
    public Iterator<SpielKarte> iterator() {
        return new DeckIterator(this);
    }
}
