package L_8_15_Jan_2024;

/*
* https://www.codechef.com/problems/MAXCOUNT
* */

public class MaxOccurance {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 2, 5,};
        int[] arr_2 = {1,2, 2, 1, 1,2};
        int[] arr_3 = {1,2, 2, 1, 1,10000, 10000, 10000, 10000, 10000, 10000};
        int[] arr_4 = {1,2, 2, 1, 1,0, 0, 0, 0, 0, 10000};
        maxOcccur(arr_1);
        System.out.println("---------------------------");
        maxOcccur(arr_2);
        System.out.println("---------------------------");
        maxOcccur(arr_3);
        System.out.println("---------------------------");
        maxOcccur(arr_4);
    }

    private static void maxOcccur(int[] nums) {

        int[] arr = new int[10001];
        for(int i : nums) {
            arr[i]++;
        }
        // Solution One
/*
        int max_freq = 0;
        for(int i : arr) {
           max_freq = Math.max(i, max_freq);
        }
        for(int i = 0 ; i < arr.length; i++ ) {
            if (arr[i] == max_freq) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(max_freq);

 */

        // Solution two
        int maxfreq = Integer.MIN_VALUE;
        int max_index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxfreq) {
                maxfreq = arr[i];
                max_index = i;
            }
        }
        System.out.println(maxfreq);
        System.out.println(max_index);
    }
}
