package L_4_5_Jan_2024;

public class SumOfDigit {

    public static int sumOfDigit(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num/= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
        System.out.println(sumOfDigit(12));
    }
}
