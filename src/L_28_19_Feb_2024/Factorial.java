package L_28_19_Feb_2024;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factor(5));
    }

    private static int factor(int i) {
        if (i == 1) return 1;
        return i * factor(i-1);
    }

}
