package blackjack.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GamerTest {

    @Test
    void 이름생성() {
        Gamer gamer = new Gamer("car");
        assertThat(gamer.getName()).isEqualTo("car");
    }

    @Test
    void 이름공백예외() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gamer("");
        });
    }
    @Test
    void 이름null예외() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gamer(null);
        });
    }

}