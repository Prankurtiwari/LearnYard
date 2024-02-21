package L_28_19_Feb_2024;

public class Print1toN {
    public static void main(String[] args) {
        printNumber(1,5);
    }

    private static void printNumber(int i, int n) {
        if (i == n+1) {
            return;
        }
        System.out.println(i);
        printNumber(i+1, n);
    }
}
