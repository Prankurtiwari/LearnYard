package L_25_14_Feb_2024;


import java.util.Arrays;
import java.util.Scanner;

/*
* Given an array of all zeroes then Q queries are given:
* 1. Each query has l,r,1: meaning 1 should be added to arr[l], arr[l+1]....arr[r]
* 2. print the final state of the array after all the queries are processed.
* ex: [0,0,0,0,0,0,0,0]
* query1: 2,6,1 [0,0,1,1,1,1,1,0]
* query2: 1,3,1 [0,1,2,2,1,1,1,0]
* query3: 2,5,1 [0,1,3,3,2,2,1,0]
* ans : [0,1,3,3,2,2,1,0]
* same question : https://leetcode.com/problems/range-addition/
* */


public class QQueries {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        int l=0,r=0,n=1;
        int query =4;
        for(int i=0;i<query;i++) {
            l=sc.nextInt();
            r= sc.nextInt();
            if (l >= 0) {
                arr[l] += n;
            }
            int length = arr.length;
            if (r + 1 < length) {
                arr[r + 1] -= n;
            }
        }
        prefixArray(arr, l, r, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void prefixArray(int[] arr, int l, int r, int n) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
}
