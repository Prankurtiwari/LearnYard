package L_28_19_Feb_2024;


/*
https://www.codechef.com/problems/SINS
* */
public class Sins {
    public static void main(String[] args) {
        System.out.println(sins(5,3));
        System.out.println(sins(10,10));
        System.out.println(sins(4,8));
    }

    private static int sins(int a, int b) {
        if (a==0 || b==0 || a == b) {
            return a + b;
        }
        if (a>b) {
            return sins(a-b,b);
        } else {
            return sins(a,b-a);
        }

    }


}
