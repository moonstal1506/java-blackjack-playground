package blackjack.model;

public class Gamer extends Player{

    private final String name;

    public Gamer(String name) {
        super();
        checkName(name);
        this.name = name;
    }

    private void checkName(String name) {
        if(name=="" || name==null){
            throw new IllegalArgumentException("이름은 공백일 수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
