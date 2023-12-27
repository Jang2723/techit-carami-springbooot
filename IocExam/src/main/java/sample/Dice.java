package sample;

public class Dice {
    private int face; // 주사위 면

    public Dice(){
        System.out.println("Dice() 생성자 호출");
    }
    public Dice(int face) { // 2. 생성자를 통한 주입
        System.out.println("Dice(int face) 생성자 호출");
        this.face = face;
    }

    public void setFace(int face) { // 3. 설정자를 통한 주입
        this.face = face;
    }

    public int getNumber(){
        return (int)(Math.random() * face) + 1; // 0~5까지 나오니 1 더해줘야 함
    }
}
