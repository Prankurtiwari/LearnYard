package L_4_5_Jan_2024;

public class DivisibleBySeven {


    public static void main(String[] args) {
        divisibleBySeven(100);
    }

    private static void divisibleBySeven(int num) {
        for(int i =0; i<= num; i++) {
            if(i%7 == 0) {
                System.out.println(i);
            }
        }
    }
}
