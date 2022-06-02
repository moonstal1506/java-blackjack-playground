package blackjack.view;

import blackjack.model.Cards;
import blackjack.model.Gamer;
import blackjack.model.Player;

public class OutputView {

    public static void giveCard(Gamer gamer){
        System.out.println("딜러와 "+gamer.getName()+"에게 2장의 카드를 나누었습니다.");
    }

    public static void retain(Player player){
        System.out.println(player.getName()+"카드: "+ player.getCards().retain());
    }

    public static void isUnder16(){
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
    }
}
