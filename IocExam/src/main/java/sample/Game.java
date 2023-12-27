package sample;

import java.util.List;

public class Game {
    private List<Player> players;

    // DI

    // 생성자 기반 주입
    public Game() {
    }

    public Game(List<Player> players) {
        this.players = players;
    }


    public void play(){
        for(Player player : players){
            player.play();
        }
    }

    // 설정자 기반 주입
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
