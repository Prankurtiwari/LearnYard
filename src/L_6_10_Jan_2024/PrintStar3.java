package L_6_10_Jan_2024;

public class PrintStar3 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                if(i%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}