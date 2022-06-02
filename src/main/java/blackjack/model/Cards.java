package blackjack.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Cards {

    private final List<Card> cards;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int sumScore(){
        int total=0;
        for(Card card : cards){
            total+=card.getScore();
        }
        return total;
    }

    public String retain() {
        return cards.stream().map(card -> card.retain()).collect(joining(", "));
    }
}
