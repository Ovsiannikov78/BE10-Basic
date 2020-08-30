package Solution_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        GuessNumberGame game = context.getBean("guessNumberGame", GuessNumberGame.class);

        game.play();
    }
}