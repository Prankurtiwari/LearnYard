package L_7_12_Jan_2024;

/*
*
* https://www.codechef.com/problems/WATERCONS
*
* */

public class WaterConsumption {
    public static void main(String[] args) {
        isOK(2000);
        isOK(2999);
        isOK(1450);
    }

    private static void isOK(int x) {
        if(x < 2000) {
            System.out.println("NO");
        } else {
            System.out.println("Yes");
        }
    }
}
