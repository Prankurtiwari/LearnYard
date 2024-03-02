package L_33_28_Feb_2024;


import java.util.Arrays;
import java.util.Collections;

/*
* https://www.codechef.com/problems/QUALPREL
* */
public class Qualifying {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 2, 4, 5};
        int k =1;
        Integer[] arr1 = {6, 5, 4, 3, 2, 1};
        int k1 =4;
        System.out.println(qualify(arr, k));
        System.out.println("----------------------------");
        System.out.println(qualify(arr1, k1));
    }

    private static int qualify(Integer[] arr, int k) {
        int count = 0;
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i =0; i<arr.length; i++) {
            if (arr[i] >= arr[k-1]){
                count++;
            }
        }
        return count;
    }
}
