package blackjack.view;

import blackjack.model.Cards;
import blackjack.model.Gamer;
import blackjack.model.Player;

public class OutputView {

    public static void giveCard(Gamer gamer){
        System.out.println("딜러와 "+gamer.getName()+"에게 2장의 카드를 나누었습니다.");
    }

    public static void retain(Cards cards){
        System.out.println(cards.retain());
    }
}
