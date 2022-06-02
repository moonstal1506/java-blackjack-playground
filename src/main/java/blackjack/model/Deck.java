package blackjack.model;

import java.util.*;

public class Deck {

    private final Stack<Card> deck;

    public Deck() {
        deck = new Stack();
        generateDeck();
        Collections.shuffle(deck);
    }

    private void generateDeck() {
        for (Suit suit : Suit.values()) {
            for (Denomination denomination : Denomination.values()) {
                deck.add(new Card(denomination, suit));
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public Card popCard(){
        return deck.pop();
    }

}
