package L_8_15_Jan_2024;
/*
* problem statement : https://codeforces.com/problemset/problem/1656/A
* Solution : https://www.youtube.com/watch?v=Y5x6Xh9X6ao
*
* */
public class GoodPair {
    public static void main(String[] args) {
        int[] arr = {5,2,7};
        int[] arr1 = {1,4,2,2,3};
        int[] arr2 = {2};
        pairs(arr);
        System.out.println("----------------------------------");
        pairs(arr1);
        System.out.println("----------------------------------");
        pairs(arr2);
        System.out.println("----------------------------------");
    }

    private static void pairs(int[] arr2) {
        int min_index = 0;
        int max_index = 0;
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;

        for(int i =0; i< arr2.length; i++) {
            if(arr2[i]>max_value) {
                max_value= arr2[i];
                max_index = i +1;
            }
            if (arr2[i]<min_value) {
                min_value = arr2[i];
                min_index = i +1;
            }
        }
        System.out.println("Max = " + max_index + "Min = "+ min_index);

    }

}
