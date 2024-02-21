package L_28_19_Feb_2024;

public class Fibonnacci {
    public static void main(String[] args) {
        for(int i=0;i<15;i++) {
            System.out.println(fibbo(i));
        }
    }

    private static int fibbo(int i) {
        if (i ==0 || i == 1) return i;
        return fibbo(i-1) + fibbo(i-2);
    }
}
