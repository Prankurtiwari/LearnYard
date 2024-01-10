package L_6_10_Jan_2024;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(3,6));
    }

    private static int gcd(int a, int b) {
        int result = 1;
        int min = Math.min(a,b);
        for(int i = min; i>=1 ; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
