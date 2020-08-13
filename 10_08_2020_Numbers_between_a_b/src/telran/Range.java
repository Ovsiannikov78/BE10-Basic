package telran;

public class Range {
    /**
     * The method counts qty of all numbers which can be composed
     * as a multiplication of two numbers going one after another.
     * Thw numbers lie between a and b
     *
     * @param a lower bound
     * @param b upper bound. Must be greater than a
     */
    public static void main(String[] args) {
        System.out.println(quantityOfNumbersFromSegment(25, 100));

    }

    public static int quantityOfNumbersFromSegment(int a, int b) {
        int x = 1;

        // the code below finds the first such x that x*(x+1) >= a
        while (x * (x + 1) < a)
            x++;
        int res = 0;
        while (x * (x + 1) <= b) {
            x++;
            res++;
        }
        return res;
    }
}
