package L_34_1_Mar_2024;


import java.util.Arrays;

/*
* https://cses.fi/problemset/task/1090
* */
public class FerrisWheel {

    public static void main(String[] args) {
        int[] arr = {7,2,3,9};
        int k = 10;
        int[] arr1 = {2,3,6,7};
        int k1 = 10;
        System.out.println(minWheel(arr, k));
        System.out.println("---------------");
        System.out.println(minWheel(arr1, k1));
    }

    private static int minWheel(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int res = 0;
        int start = 0, end = n-1;
        while(start<= end) {
            if (arr[start] + arr[end] > k) {
                end--;
            }
            else {
                start++;
                end--;
            }
            res++;
        }

        return res;

    }
}
