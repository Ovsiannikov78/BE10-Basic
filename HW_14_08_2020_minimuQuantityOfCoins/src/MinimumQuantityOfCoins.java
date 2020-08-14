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

    public int findTheMinimumQuantityOfCoinsForAGivenAmount(int amount, int a, int b, int c) {
        int quantityOfCoins = 0;
        while (amount != 0) {
            if (amount >= a) {
                amount = amount - a;
                quantityOfCoins++;
            } else if (amount >= b) {
                amount = amount - b;
                quantityOfCoins++;
            } else {
                amount = amount - c;
                quantityOfCoins++;
            }
        }
        return quantityOfCoins;
    }
}