package Solution_3_With_ApplicationConfigurationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GuessNumberGame game = context.getBean("guessNumberGame", GuessNumberGame.class);

        game.play();
    }
}