package blackjack.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @DisplayName("플레이어는 카드를 받는다")
    @Test
    void receiveCard(){
        Player player = new Dealer();
        player.receiveCard(new Card(Denomination.THREE,Suit.CLUBS));
        player.receiveCard(new Card(Denomination.TWO,Suit.CLUBS));
        Assertions.assertThat(player.getCards().retain()).isEqualTo("3클로버, 2클로버");
    }

}