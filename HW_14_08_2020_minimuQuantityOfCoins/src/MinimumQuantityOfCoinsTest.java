import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumQuantityOfCoinsTest {
    /*
       Есть сумма денег.
       Есть монеты: 10, 5, 1 $.
       Найти минимальное количество монет, чтобы собрать эту сумму.
       7= 5+1+1 -> 3
       27=10+10+5+1+1 -> 5
    */
    MinimumQuantityOfCoins minimumQuantityOfCoins = new MinimumQuantityOfCoins();

    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_7() {
        int exp = 3;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(7, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_27() {
        int exp = 5;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(27, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_1() {
        int exp = 1;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(1, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_5() {
        int exp = 1;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(5, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_6() {
        int exp = 2;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(6, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_2() {
        int exp = 2;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(2, 10, 5, 1);
        assertEquals(exp,akt);
    }
    @Test
    public void findTheMinimumQuantityOfCoins_10_5_1_Amount_0() {
        int exp = 0;
        int akt = minimumQuantityOfCoins.findTheMinimumQuantityOfCoinsForAGivenAmount(0, 10, 5, 1);
        assertEquals(exp,akt);
    }
}