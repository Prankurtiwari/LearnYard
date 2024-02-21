package L_23_10_Feb_2024;

import java.util.Arrays;

public class PrefixMaxArray {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,5,7,6};
        System.out.println(Arrays.toString(prefix(arr)));
    }

    private static int[] prefix(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for(int i= 0; i<n; i++) {
            res[i] = i > 0 ? Math.max(res[i-1], arr[i]) : arr[i];
        }
        return res;
    }
}
