package L_4_5_Jan_2024;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(5));
        System.out.println(powerOfTwo(512));
        System.out.println(powerOfTwo(8));
        System.out.println(powerOfTwo(15));
        System.out.println(powerOfTwo(20));
        System.out.println(powerOfTwo(1));
    }

    private static boolean powerOfTwo(int num) {
        while (num % 2 == 0 && num > 1) {
            num /= 2;
        }
        return num == 1;
    }
}
