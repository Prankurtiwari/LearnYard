package Lecture1;

public class PerfectSquare {
    public static boolean perfectSq(double num) {
       return Math.ceil(Math.sqrt(num)) == Math.floor(Math.sqrt(num));
    }

    public static boolean perfectSqUsingBinarySearch(double num) {
        if(num <= 1)
            return true;
        int left = 1;
        int right = (int) num;
        while(left <= right) {
            int mid = left + (right -left) / 2 ; // to avoid overflow the limit of long
            int sq = mid * mid;
            if(sq == num){
                return true;
            }
            else if (sq < num)
                    left = mid +1;
            else
                right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(perfectSq(1));
        System.out.println(perfectSq(4));
        System.out.println(perfectSq(9));
        System.out.println(perfectSq(5));
        System.out.println(perfectSq(7));
        System.out.println("--------------------------");
        System.out.println(perfectSqUsingBinarySearch(1));
        System.out.println(perfectSqUsingBinarySearch(4));
        System.out.println(perfectSqUsingBinarySearch(9));
        System.out.println(perfectSqUsingBinarySearch(5));
        System.out.println(perfectSqUsingBinarySearch(7));
    }
}
