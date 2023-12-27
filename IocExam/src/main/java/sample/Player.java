package sample;

public class Player {
    private String name;
    private Dice dice; // 주사위 게임을 위해 주사위가 필요함

    //DI (의존성 주입..) -- 1. 필드기반 주입 2. 생성자기반 주입 3. 설정자기반 주입


    public Player() {
    }

    public Player(String name, Dice dice) { // 2. 생성자 기반 주입
        this.name = name;
        this.dice = dice;
    }

    public Player(Dice dice) { // 2. 생성자 기반 주입
        this.dice = dice;
    }

    public void setDice(Dice dice) { // 3. 설정자 기반 주입
        this.dice = dice;
    }

    public void setName(String name) { // 3. 설정자 기반 주입
        this.name = name;
    }

    public void play(){
        System.out.println(name+ "은 주사위를 던져서 " + dice.getNumber() + "가 나왔습니다.");
    }

}
