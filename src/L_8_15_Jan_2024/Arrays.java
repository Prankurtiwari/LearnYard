package L_8_15_Jan_2024;

import java.util.ArrayList;

/*
* problem : https://codeforces.com/problemset/problem/300/A
* solution : https://www.youtube.com/watch?v=8M6tXeY3quk
*
* */
public class Arrays {
    public static void main(String[] args) {
        int[] arr= {-1,2,0};
        int[] arr2 = {-1,-2,-3,0};
        answer(arr);
        System.out.println("\n----------------------------------\n");
        answer(arr2);
    }

    private static void answer(int[] arr) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for (int j : arr) {
            if (j > 0) {
                pos.add(j);
            } else if (j < 0) {
                neg.add(j);
            } else {
                zero.add(j);
            }
        }

        if (pos.isEmpty()) {
            pos.add(neg.get(neg.size() - 1));
            neg.remove(neg.size() - 1);
            pos.add(neg.get(neg.size() - 1));
            neg.remove(neg.size() - 1);
        }

        System.out.println(1 + " " + neg.get(0));

        System.out.print(pos.size() + " ");
        for (Integer po : pos) {
            System.out.print(po + " ");
        }
        System.out.println();

        System.out.print((neg.size() - 1) + zero.size() + " ");
        for (int i = 1; i < neg.size(); i++) {
            System.out.print(neg.get(i) + " ");
        }

        for (Integer integer : zero) {
            System.out.print(integer + " ");
        }
    }
}
