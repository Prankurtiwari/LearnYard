package L_1_3_Jan_2024;

/*
    You have a watermelon weight W where 1<W<1000 divide the
    melon into two such that both weight are even.
    https://codeforces.com/problemset/problem/4/A
*/
public class WaterMelon {

    public static void main(String[] args) {
        System.out.println(divideWater(100));
        System.out.println(divideWater(2));
        System.out.println(divideWater(1));
        System.out.println(divideWater(6));
        System.out.println(divideWater(7));
        System.out.println(divideWater(9));
    }

    private static boolean divideWater(int i) {
        return i>2 && i%2 == 0;
    }
}
