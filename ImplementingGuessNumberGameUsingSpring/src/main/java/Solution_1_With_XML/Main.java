package Solution_1_With_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        GuessNumberGame game = context.getBean("guessNumberGame", GuessNumberGame.class);

        game.play();
    }
}