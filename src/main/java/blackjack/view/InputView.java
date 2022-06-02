package blackjack.view;

import blackjack.model.Gamer;
import blackjack.model.Player;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Player inputPlayerName(){
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.");
        return new Gamer(scanner.next());
    }
}
