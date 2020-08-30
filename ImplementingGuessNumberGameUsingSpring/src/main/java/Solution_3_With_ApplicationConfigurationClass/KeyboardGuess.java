package Solution_3_With_ApplicationConfigurationClass;

import java.util.Scanner;

public class KeyboardGuess implements GuessSource {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int guess() {
        return scanner.nextInt();
    }
}
