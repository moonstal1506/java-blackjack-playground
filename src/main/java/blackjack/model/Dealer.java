package blackjack.model;

public class Dealer extends Player {

    private static final int NEED_MORE_CARD_NUMBER = 16;
    private final String NAME = "딜러";

    public boolean needMoreCard(){
        return getScore() <= NEED_MORE_CARD_NUMBER;
    }
}
