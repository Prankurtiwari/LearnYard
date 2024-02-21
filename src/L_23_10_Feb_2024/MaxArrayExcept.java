package L_23_10_Feb_2024;

import java.util.Arrays;

/*
Lecture last problem
Given an array and M queries each query will have an index i
we need to find the max of all element except a[i]
* */
public class MaxArrayExcept {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,5,7,6};
        int[] m = {4,7,6,3};
        System.out.println(Arrays.toString(prefixMax(arr, m)));
    }

    private static int[] prefixMax(int[] arr, int[] m) {
        int n = arr.length;
        int p = m.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int[] result = new int[p];
        for(int i =0 ;i<n; i++) {
            prefix[i] = i>0 ? Math.max(prefix[i-1], arr[i]) : arr[i];
        }
        for(int i= n-1; i>=0; i--) {
            suffix[i] = i != n-1 ? Math.max(suffix[i+1], arr[i]) : arr[i];
        }

        for(int i =0; i<p; i++) {
            if (m[i] == 0) {
                result[i] = suffix[m[i]+1];
            } else if (m[i] == n-1) {
                result[i] = prefix[m[i]-1];
            } else {
                result[i] = Math.max(prefix[m[i]-1], suffix[m[i]+1]);
            }
        }
        return result;
    }
}
