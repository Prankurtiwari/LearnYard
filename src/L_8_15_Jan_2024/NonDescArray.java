package L_8_15_Jan_2024;

import java.util.Arrays;

/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/make-it-non-decreasing-7d3391fd/
 */
public class NonDescArray {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        int[] arr1 = {5,1};
        int[] arr2 = {5};
        int[] arr3 = {7,4,6};
        System.out.println(Arrays.toString(nonDesc(arr)));
        System.out.println("---------------");
        System.out.println(Arrays.toString(nonDesc(arr1)));
        System.out.println("---------------");
        System.out.println(Arrays.toString(nonDesc(arr2)));
        System.out.println("---------------");
        System.out.println(Arrays.toString(nonDesc(arr3)));
        System.out.println("---------------");
    }


    // Self O(n2)

    private static int[] nonDesc(int[] arr2) {
        int[] result = new int[arr2.length];
        result[0] = arr2[0];

        for(int i= 1; i< arr2.length; i++) {
            int j = 1;
            while (j*arr2[i] < arr2[i-1] || j*arr2[i] < result[i-1]) {
              j++;
            }
            result[i] = j*arr2[i];
        }
        return result;
    }



    /* b[i] > 0;
          b array is sorted i.e b[i] >= b[i-1]
         b[i] = f * a[i];
         f* a[i] >= b[i-1]
         f>=b[i-1]/a[i] which means f = ceil(b[i-1]/a[i])
         b[i] = ceil(b[i-1]/a[i]) * a[i]
         Explain video: https://www.youtube.com/watch?v=JjWL95M_7OA
     */

//    private static int[] nonDesc(int[] arr2) {
//        int length = arr2.length;
//        int[] result = new int[length];
//        result[0] = arr2[0];
//        for(int i =1; i<length;i++) {
//            int div = result[i - 1] / arr2[i];
//            result[i] = (int) (arr2[i] * Math.ceil(div));
//        }
//        return result;
//    }







}
