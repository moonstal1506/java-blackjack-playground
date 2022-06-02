package blackjack.controller;

import blackjack.model.*;
import blackjack.view.InputView;
import blackjack.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class BlackjackController {

    private final Gamer gamer = InputView.inputPlayerName();
    private final Dealer dealer = new Dealer();
    private final Deck deck = new Deck();
    private final List<Player> players = Arrays.asList(gamer, dealer);

    public void run() {
        initCards();
        playerNeedMoreCard(gamer);
        dealerNeedMoreCard(dealer);
        judge();
    }

    private void initCards() {
        OutputView.giveCard(gamer);
        for (Player player : players) {
            player.receiveCard(deck.popCard());
            needMoreCard(player);
        }
    }

    private void needMoreCard(Player player) {
        player.receiveCard(deck.popCard());
        OutputView.retain(player);

    }

    private void playerNeedMoreCard(Player player) {
        while (true) {
            if (InputView.needMoreCard(player)) {
                needMoreCard(player);
            } else {
                break;
            }
        }
    }

    private void dealerNeedMoreCard(Player player) {
        if (dealer.needMoreCard()) {
            OutputView.isUnder16();
            needMoreCard(player);
        }
    }

    private void judge(){
        String result = Judgement.judge(gamer.getCards(), dealer.getCards());
        OutputView.reportResult(result, gamer, dealer);
    }

}
