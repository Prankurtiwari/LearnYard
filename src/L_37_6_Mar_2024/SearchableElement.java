package L_37_6_Mar_2024;

/*
* In an unsorted array tell me which number are searchable using
* Binary search
* */
public class SearchableElement {
    public static void main(String[] args) {
        int[] arr = {1,6,4,10,3,5,7};
        System.out.println(count(arr));
    }


    public static int count(int[] arr) {
        int ans = 0;
        for(int num: arr) {
            if (binarySearch(arr, num)) {
                ans++;
            }
        }
        return ans;
    }

    private static boolean binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid]< num) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return false;
    }
}
