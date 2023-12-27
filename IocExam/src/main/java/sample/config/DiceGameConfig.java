package sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import sample.Dice;
import sample.Game;
import sample.Player;

import java.util.List;

@PropertySource({"classpath:game.properties"})
public class DiceGameConfig {
    @Bean
    public Dice dice(@Value("${face}") int face) {
//        return new Dice(6); // 생성자를 통한 주입
        // 설정자를 통한 주입
        Dice dice = new Dice();
        dice.setFace(face);
        return dice;
    }


    @Bean
    public Player kang(Dice dice){
//        return new Player("강경미",dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("강경미");
        return player;
    }

    @Bean
    public Player kim(Dice dice){
//        return new Player("김가나",dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("김가나");
        return player;
    }

    @Bean
    public Player hong(Dice dice){
//        return new Player("홍다라",dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("홍다라");
        return player;
    }

    @Bean
    public Player lee(Dice dice){
//        return new Player("이마바",dice);
        Player player = new Player();
        player.setDice(dice);
        player.setName("이마바");
        return player;
    }

    @Bean
    public Game game(List<Player> players){
//        return new Game(players);
        Game game = new Game(); // 설정자 기반 주입
        game.setPlayers(players);
        return game;
    }


}
