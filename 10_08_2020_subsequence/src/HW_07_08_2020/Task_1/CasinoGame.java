package HW_07_08_2020.Task_1;

public class CasinoGame {
    /*
    Вася пришел в казино поиграть в игру, в которой за один раунд можно либо увеличить свою ставку на 1 доллар,
    либо удвоить ставку, либо проиграть. Ставки можно делать целыми долларами, без центов.
    Найти минимальное количество игр, в которое надо сыграть Васе, чтобы с одного доллара дойти до N долларов,
    при условии, что в игре может быть не больше M раз удвоений.
     */
    public static void main(String[] args) {
        System.out.println(findTheMinimumQuantityOfGames(12, 1));

    }

    public static int findTheMinimumQuantityOfGames(int N, int M) {
        int qnt = 0;
        while (N != 0) {
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
}
