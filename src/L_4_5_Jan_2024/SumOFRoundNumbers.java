package L_4_5_Jan_2024;

/*Q5 - Sum of Round Numbers
Problem Link: https://codeforces.com/contest/1352/problem/A

 */
public class SumOFRoundNumbers {


    public static void main(String[] args) {
        sumOfRound(5897);
        System.out.println("------------");
        sumOfRound(5009);
        System.out.println("------------");
        sumOfRound(7);
        System.out.println("------------");
        sumOfRound(9876);
        System.out.println("------------");
        sumOfRound(10000);
        System.out.println("------------");
        sumOfRound(10);
        System.out.println("------------");
    }

    private static void sumOfRound(int num) {
        int mul = 1;
        while(num > 0) {
            int rem = num % 10;
            if (rem > 0) {
                System.out.println(rem * mul); //increase count if needed.
            }
            num/= 10;
            mul *= 10;
        }

    }
}
