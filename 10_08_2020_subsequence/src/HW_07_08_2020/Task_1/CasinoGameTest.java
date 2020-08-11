package HW_07_08_2020.Task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Вася пришел в казино поиграть в игру, в которой за один раунд можно либо увеличить свою ставку на 1 доллар,
    либо удвоить ставку, либо проиграть. Ставки можно делать целыми долларами, без центов.
    Найти минимальное количество игр, в которое надо сыграть Васе, чтобы с одного доллара дойти до N долларов,
    при условии, что в игре может быть не больше M раз удвоений.
*/

class CasinoGameTest {
    CasinoGame game = new CasinoGame();

    @Test
    public void testCasinoGame_1() {
        int exp = 5;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(12, 2);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_2() {
        int exp = 7;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(12, 1);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_3() {
        int exp = 6;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(32, 4);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_4() {
        int exp = 6;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(32, 5);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_5() {
        int exp = 6;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(6, 0);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_6() {
        int exp = 4;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(8, 8);
        assertEquals(exp, akt);
    }

    @Test
    public void testCasinoGame_7() {
        int exp = 0;
        int akt = CasinoGame.findTheMinimumQuantityOfGames(0, 2);
        assertEquals(exp, akt);
    }
}