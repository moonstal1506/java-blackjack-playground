package blackjack.model;

public class Gamer extends Player{

    private final String name;

    public Gamer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
