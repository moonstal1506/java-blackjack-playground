package blackjack.model;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DeckTest {

    @Test
    void generateDeck(){
        Deck deck = new Deck();
        assertThat(deck.getDeck().size()).isEqualTo(52);
    }

    @DisplayName("카드를 뽑으면 덱의 카드 수 감소")
    @Test
    void popCard() {
        Deck deck = new Deck();
        deck.popCard();
        assertThat(deck.getDeck().size()).isEqualTo(51);
    }
}