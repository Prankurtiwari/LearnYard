package L_34_1_Mar_2024;


import java.util.Arrays;

/*
* https://codeforces.com/problemset/gymProblem/102961/I
* Ref problem :https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/?envType=list&envId=5a8jur9c
* */
public class StickLength {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,2};
        System.out.println(minCost(arr));
    }

    private static int minCost(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;

        int[] presum = new int[len];
        int[] postsum = new int[len];

        for(int i=0;i<len;i++) {
            presum[i] = i ==0 ? arr[i] : presum[i-1] + arr[i];
        }

        for(int i=len-1;i>=0;i--) {
            postsum[i] = i ==len-1 ? arr[i] : postsum[i+1] + arr[i];
        }

        int min = Integer.MAX_VALUE;

        for(int i =0; i<len;i++) {
            int preSum = i ==0 ? 0 : presum[i-1];
            int postSum = i == len-1 ? 0 : postsum[i+1];
            int leftSum = i * arr[i] - preSum;
            int rightSum = postSum - arr[i]* (len-1-i);
            min = Math.min(min, leftSum + rightSum);
        }

        return min;

    }
}
