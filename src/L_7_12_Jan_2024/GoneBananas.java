package L_7_12_Jan_2024;

/*
* https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/monks-problem-ffeebf8a/
* one point is missing that :
*  "it seems that 1 condition is missing, which is that the number of bananas given to each of the people should be equal."
*
* Basically: find weather number is prime or not.
* how:  x * y = N
*      N can only be divided equally if x and y are real factor of N . If x = 1 or N y = 1 or N
*      then N can't be divided, and it is not possible to divide. Basic logic.
* */
public class GoneBananas {
    public static void main(String[] args) {
        System.out.println(isDistributed(2));
        System.out.println(isDistributed(4));
    }

    private static String isDistributed(int n) {
        if (n == 1) {
            return "No";
        }
        for(int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}
