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

    public int findTheMinimumQuantityOfCoinsForAGivenAmount(int amount) {
        int quantityOfCoins = 0;
        while (amount != 0) {
            if (amount >= 10) {
                amount = amount - 10;
                quantityOfCoins++;
            } else if (amount >= 5) {
                amount = amount - 5;
                quantityOfCoins++;
            } else {
                amount = amount - 1;
                quantityOfCoins++;
            }
        }
        return quantityOfCoins;
    }

}