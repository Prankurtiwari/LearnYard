package L_13_20_Jan_2024;

import java.util.Arrays;

public class MatrixMulti {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2},
                {5, 6},
                {9, 10}
        };
        int[][] m2 = {
                {1, 2, 3},
                {5, 6, 7}
        };

        int[][] m3 = new int[3][3];

        for(int i =0 ;i< 3; i++) {
            for(int j = 0; j< 3; j++) {
                int sum = 0;
                for(int k = 0; k< 2; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;

            }
        }

        System.out.println(Arrays.deepToString(m3));

    }
}
