package HW_07_08_2020.Task_1;

public class CasinoGame {
    /**
     * the method finds the list number of steps needed to reach
     * N dollars from 1 dollar, if by one step Vasya can add 1 dollar
     * or double his current balance
     *
     * @param N > 0, the balance to reach
     * @param M >= 0, max number ofd doubling the balance
     * @return min possible number of steps
     */
    /*
    Вася пришел в казино поиграть в игру, в которой за один раунд можно либо увеличить свою ставку на 1 доллар,
    либо удвоить ставку, либо проиграть. Ставки можно делать целыми долларами, без центов.
    Найти минимальное количество игр, в которое надо сыграть Васе, чтобы с одного доллара дойти до N долларов,
    при условии, что в игре может быть не больше M раз удвоений.
     */
    public static void main(String[] args) {
        System.out.println(findTheMinimumQuantityOfGames(8, 6));

    }
/*
    public static int findTheMinimumQuantityOfGames(int N, int M) {
        int qnt = 0;
        while (N != 1) {
            if (N % 2 == 0 && M != 0) {
                N = N / 2;
                qnt++;
                M--;
            }
            if (N % 2 != 0 || M == 0) {
                N = N - 1;
                qnt++;
            }
        }
        return qnt;
    }

 */

    public static int findTheMinimumQuantityOfGames(int N, int M) {
        if (N == 1)
            return 0;

        if (N % 2 == 0 && M > 0)
            return 1 + findTheMinimumQuantityOfGames(N / 2, M - 1);    // решение через рекурсию
        return 1 + findTheMinimumQuantityOfGames(N - 1, M);
    }
}