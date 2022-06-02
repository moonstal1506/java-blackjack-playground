package blackjack.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CardsTest {

    @DisplayName("카드 점수 합계")
    @Test
    void sumScore(){
        Cards cards = new Cards();
        cards.addCard(new Card(Denomination.TWO,Suit.CLUBS));
        cards.addCard(new Card(Denomination.THREE,Suit.CLUBS));
        Assertions.assertThat(cards.sumScore()).isEqualTo(5);
    }
}