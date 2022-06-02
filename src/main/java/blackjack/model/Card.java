package blackjack.model;

import java.util.Objects;

public class Card {

    private final Denomination denomination;
    private final Suit suit;

    public Card(Denomination denomination, Suit suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getScore(){
        return denomination.getScore();
    }

    public String retain() {
        return denomination.getScore()+suit.getName();
    }

}
