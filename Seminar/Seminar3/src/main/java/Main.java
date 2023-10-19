import ub1.Color;
import ub1.Deck;
import ub1.DeckIterator;
import ub1.SpielKarte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SpielKarte> cards = new ArrayList<>();
        cards.add(new SpielKarte(Color.Karo, 10));
        cards.add(new SpielKarte(Color.Herz, 9));
        cards.add(new SpielKarte(Color.Pik, 7));

        Deck deck = new Deck(cards);

        for (int i = 0; i < deck.getKarten().size(); i++) {
            System.out.println(deck.getKarten().get(i));
        }

        DeckIterator deckIterator = new DeckIterator(deck);
        System.out.println();

        for (SpielKarte s : deck) {
            System.out.println(s);
        }
    }
}
