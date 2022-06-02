package blackjack.controller;

import blackjack.model.Dealer;
import blackjack.model.Deck;
import blackjack.model.Gamer;
import blackjack.model.Player;
import blackjack.view.InputView;
import blackjack.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class BlackjackController {

    private final Gamer gamer = InputView.inputPlayerName();
    private final Dealer dealer = new Dealer();
    private final Deck deck = new Deck();
    private final List<Player> players = Arrays.asList(gamer,dealer);

    public void run() {
        initCards();
        needMoreCard();
    }

    private void initCards(){
        OutputView.giveCard(gamer);
        for(Player player : players){
            player.receiveCard(deck.popCard());
            player.receiveCard(deck.popCard());
            OutputView.retain(player);
        }
    }

    private void needMoreCard(){
        while(true){
            if(InputView.needMoreCard(gamer)){
                gamer.receiveCard(deck.popCard());
                OutputView.retain(gamer);
            }else {
                break;
            }
        }
    }
}
