package blackjack.view;

import blackjack.model.Gamer;
import blackjack.model.Player;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Gamer inputPlayerName(){
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.");
        return new Gamer(scanner.next());
    }

    public static boolean needMoreCard(Gamer gamer){
        System.out.println(gamer.getName()+"는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
        return scanner.next().equals("y");
    }
}
