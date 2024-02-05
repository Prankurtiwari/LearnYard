package L_13_20_Jan_2024;


import java.util.Arrays;

/*
* primary is i = j means all arr[i][i]
* secondary is i+j = N-1 means j = N-1-i means arr[i][N-1-i]
* */
public class SwapPrimaryToSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int N = 3;
        for (int i =0 ; i<N; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][N-1-i];
            arr[i][N-1-i] = temp;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
