package Solution_3_With_ApplicationConfigurationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {

    @Bean
    ConsoleOutput consoleOutput() {
        return new ConsoleOutput();
    }

    @Bean
    KeyboardGuess keyboardGuess() {
        return new KeyboardGuess();
    }

    @Bean
    GuessNumberGame guessNumberGame(GuessSource guessSource, ResultOutput output) {
        return new GuessNumberGame(15, 3, guessSource, output);
    }
}
