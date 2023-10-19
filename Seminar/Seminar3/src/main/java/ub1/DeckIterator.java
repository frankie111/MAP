package ub1;

import java.util.Iterator;

public class DeckIterator implements Iterator<SpielKarte> {

    public DeckIterator(Deck deck) {
        this.deck = deck;
    }

    private int index = 0;
    private Deck deck;

    @Override
    public boolean hasNext() {
        return index < deck.getKarten().size();
    }

    @Override
    public SpielKarte next() {
        if (hasNext())
            return deck.getKarten().get(index++);

        return null;
    }


}
