package L_11_20_Jan_2024;

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] crr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }; // assuming a rectangular array.

        System.out.println("Row-wise Traversal");

        for(int i = 0; i < crr.length; ++i) {

            // We need to print jth column
            for(int j = 0; j < crr[i].length; ++j)
                System.out.print(crr[i][j] + " ");
            System.out.println();
        }


        System.out.println("Column-wise traversal");


        for(int j = 0; j < crr[0].length; ++j) {

            // We need to print jth column
            for(int i = 0; i < crr.length; ++i)
                System.out.print(crr[i][j] + " ");
            System.out.println();
        }
    }
}
