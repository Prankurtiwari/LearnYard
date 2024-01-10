package L_4_5_Jan_2024;

public class TableOfN {
    public static void main(String[] args) {
        table(24);
    }

    private static void table(int num) {
        for(int i =1 ; i<=10 ; i++) {
            System.out.println(num + " times "+ i +  " = " + num *i);
        }
    }
}
