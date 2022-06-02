package blackjack.model;

public class Judgement {

    private static final int LIMIT_NUMBER = 21;
    private static final String DRAW = "무승부";
    private static final String DEALER_WIN = "딜러 승";
    private static final String GAMER_WIN = "게이머 승";

    public static String judge(Cards gamerCards, Cards dealerCards){
        if(isDraw(gamerCards.sumScore(), dealerCards.sumScore())){
            return DRAW;
        }

        if(isDealerWin(gamerCards.sumScore(), dealerCards.sumScore())){
            return DEALER_WIN;
        }

        return GAMER_WIN;
    }

    private static boolean isDraw(int gamerScore, int dealerScore) {
        return gamerScore == dealerScore || (gamerScore > LIMIT_NUMBER && dealerScore > LIMIT_NUMBER);
    }

    private static boolean isDealerWin(int gamerScore, int dealerScore) {
        return gamerScore > LIMIT_NUMBER || gamerScore < dealerScore;
    }

}
