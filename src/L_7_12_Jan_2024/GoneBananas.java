package L_7_12_Jan_2024;

/*
* https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/monks-problem-ffeebf8a/
* one point is missing that :
*  "it seems that 1 condition is missing, which is that the number of bananas given to each of the people should be equal."
*
* Basically: find weather number is prime or not.
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
