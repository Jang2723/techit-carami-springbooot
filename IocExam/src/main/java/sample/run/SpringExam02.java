package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.Dice;
import sample.Game;
import sample.config.DiceGameConfig;

public class SpringExam02 {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성 전");
        ApplicationContext context = new AnnotationConfigApplicationContext(DiceGameConfig.class);
        System.out.println("ApplicationContext 생성 후");

//        Dice dice = context.getBean(Dice.class);

//        System.out.println(dice.getNumber());

        Game game = context.getBean(Game.class);
        game.play();
    }
}
