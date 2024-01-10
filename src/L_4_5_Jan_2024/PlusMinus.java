package L_4_5_Jan_2024;
/*
Problem statement : https://codeforces.com/problemset/problem/1807/A
 */
public class PlusMinus {


    public static void main(String[] args) {
        plusMinus(1,2,3);
        plusMinus(3,2,1);
        plusMinus(2,9,-7);
        plusMinus(3,4,7);
        plusMinus(1,1,2);
        plusMinus(1,1,0);
        plusMinus(3,3,6);
        plusMinus(9,9,18);
        plusMinus(9,9,0);
        plusMinus(1,9,-8);
        plusMinus(1,9,10);
    }

    private static void plusMinus(int a, int b, int c) {
        if ((a + b) == c) {
            System.out.println("+");
        } else if ((a - b) == c) {
            System.out.println("-");
        }
    }
}
