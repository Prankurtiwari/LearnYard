package L_37_6_Mar_2024;


/*
*In a binary search if we are choosing the random element then
* which element are still searchable ?
* Ans: All those element whose left element are smaller than the current number
* and right element are greater than current number all those element are searchable
* Ex: {1,6,4,7,10,9}
* here 1 and 7 are searchable in Binary search always and other element may be may not be.
* */
public class RandamiseBS {
    public static void main(String[] args) {
        int[] arr = {1,6,4,7,10,9};
        System.out.println("Count = " + count(arr));
    }

    private static int count(int[] arr) {
        int n = arr.length;
        int[] preMax = new int[n];
        int[] postMin = new int[n];
        int count = 0;

        for(int i =0; i<n; i++) {
            preMax[i] = i == 0 ? arr[i] : Math.max(preMax[i-1], arr[i]);
        }

        for(int i =n-1; i>=0; i--) {
            postMin[i] = i == n-1 ? arr[i] : Math.min(preMax[i+1], arr[i]);
        }

        for(int i =0; i<n; i++) {
            int leftMax = i == 0 ? Integer.MIN_VALUE : preMax[i-1];
            int rightMin = i == n-1 ? Integer.MAX_VALUE : postMin[i+1];

            if(arr[i] > leftMax && arr[i] < rightMin) {
                count++;
                System.out.println(arr[i]);
            }
        }
        return count;
    }
}
