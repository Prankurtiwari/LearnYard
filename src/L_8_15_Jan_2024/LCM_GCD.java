package L_8_15_Jan_2024;
/*
https://codeforces.com/problemset/problem/1665/A
Discussed in doubt session on 7th Jan 2024
    gcd(a,b) = lcm(c,d) is only possible when lcm(c,d) is 1.
    lcm(c,d) has to be 1 which means c and d has to be 1
    gcd (a,b)  = 1 so either a = 1 or b = 1 and other element has to be N -3;
 */

public class LCM_GCD {
//    5
//            4
//            7
//            8
//            9
//            10

    public static void main(String[] args) {
        printSol(4);
        System.out.println("--------------");
        printSol(7);
        System.out.println("--------------");
        printSol(8);
        System.out.println("--------------");
        printSol(9);
        System.out.println("--------------");
        printSol(10);
    }

    private static void printSol(int i) {
        System.out.println("Solution for :" + i);
        System.out.print(1 + "," + 1 + "," + 1 + "," + (i-3));
    }


}
