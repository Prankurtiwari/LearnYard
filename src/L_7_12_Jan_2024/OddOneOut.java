package L_7_12_Jan_2024;
/*
https://codeforces.com/contest/1915/problem/A
 */
public class OddOneOut {
    public static void main(String[] args) {
        oddOut(1,2,2);
        oddOut(4,3,4);
        oddOut(5,5,6);
        oddOut(7,8,8);
        oddOut(9,0,9);
        oddOut(3,6,3);
        oddOut(2,8,2);
        oddOut(5,7,7);
        oddOut(7,7,5);
        oddOut(5,7,5);

    }

    public static void oddOut(int a, int b,  int c) {
        if(a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else if (a == c) {
            System.out.println(b);
        }
    }
}
