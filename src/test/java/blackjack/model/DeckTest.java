package blackjack.model;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeckTest {

    @Test
    void generateDeck(){
        Deck deck = new Deck();
        assertThat(deck.getDeck().size()).isEqualTo(52);
    }

}