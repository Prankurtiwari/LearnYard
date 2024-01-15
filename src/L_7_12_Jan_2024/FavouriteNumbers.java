package L_7_12_Jan_2024;

/*
https://www.codechef.com/problems/FAVOURITENUM

* */

public class FavouriteNumbers {
    public static void main(String[] args) {
        favNumber(7);
        favNumber(14);
        favNumber(21);
        favNumber(18);
        favNumber(27);
        favNumber(63);
        favNumber(126);
        favNumber(8);
    }


    private static void favNumber(int i) {
        if (i % 2 == 0 && i % 7 == 0) {
            System.out.println("Alice");
        } else if (i % 2 != 0 && i % 9 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Charlie");
        }
    }
}
