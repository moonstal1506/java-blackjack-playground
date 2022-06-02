package blackjack.model;

public class Player {

    private final Cards cards;

    public Player() {
        this.cards = new Cards();
    }

    public void receiveCard(Card card){
        cards.addCard(card);
    }

    public Cards getCards() {
        return cards;
    }

    public int getScore(){
        return cards.sumScore();
    }
}
