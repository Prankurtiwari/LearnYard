package L_28_19_Feb_2024;

public class PrintNto1 {

    public static void main(String[] args) {
        printNumber(5);
    }

    private static void printNumber(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        printNumber(i-1);
    }

}
