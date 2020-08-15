package Solution_2;

public class MinimumQuantityOfCoins {
    /*
       Есть сумма денег.
       Есть монеты: 10, 5, 1 $.
       Найти минимальное количество монет, чтобы собрать эту сумму.
       7= 5+1+1 -> 3
       27=10+10+5+1+1 -> 5
    */
    public static void main(String[] args) {

    }

    public int exchange (int amount){
        int res = amount / 10;
        amount = amount % 10;
        res += amount / 5;
        amount %= 5;
        res += amount;
        return res;
    }
}
