package L_33_28_Feb_2024;

import java.util.Arrays;

/*
* https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
* */
public class MinimumAbs {
    public static void main(String[] args) {
        int[] arr = {3, -7, 0};
        int[] arr1 = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        int[] arr2 = {1, -3, 71, 68, 17};
        System.out.println(Abs(arr));
        System.out.println("--------------");
        System.out.println(Abs(arr1));
        System.out.println("--------------");
        System.out.println(Abs(arr2));
    }

    private static int Abs(int[] arr) {
        int res =  Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i =0 ; i+1 < arr.length; i++) {
            res = Math.min(res, Math.abs(arr[i+1] - arr[i]));
        }
        return res;
    }
}
