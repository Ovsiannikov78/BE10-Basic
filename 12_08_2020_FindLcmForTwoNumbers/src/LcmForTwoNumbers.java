

public class LcmForTwoNumbers {
    /*
    НОК — двух чисел — это наименьшее число, которое делится на оба из них.
    НОК(6, 9) = 18
     */
    public static void main(String[] args) {



    }
    public int LCM (int a, int b) {
     /**
     * Calculate Lowest Common Multiplier
     */
        return (a * b) / GCF(a, b);
    }

    /**
     * Calculate Greatest Common Factor
     */
    private int GCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (GCF(b, a % b));
        }
    }

}
