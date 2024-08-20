package L_38_8_Mar_2024;


import java.util.Scanner;

/*
* Problem Link: https://www.codechef.com/problems/HMAPPY
* */
public class HappyCandy {
    public static void main(String[] args) {

        int numberOfDays = 5;
        int numberOfBalloon = 3;
        int[] balloonRequiredEachDay = {1,2,3,4,5};
        int[] candiesRequired = {1,2,3,4,5};

        int ans = getAns(balloonRequiredEachDay, candiesRequired, numberOfBalloon);
        System.out.println(ans);

    }

    private static int getAns(int[] balloonRequiredEachDay, int[] candiesRequired, int numberOfBalloon) {
        int min = 0;
        int max = getMax(balloonRequiredEachDay, candiesRequired);

        // this is linear search
//        for (int i = min; i<max; i++) {
//            if (getRequiredBalloon(i, balloonRequiredEachDay, candiesRequired) <= numberOfBalloon) {
//                System.out.println(i);
//                break;
//            }
//        }


        // try binary search : Complexity is O(log(max(balloonRequiredEachDay[i] * candiesRequired[i])
        int ans = 0;
        while(min<= max) {
            int mid = min+ (max-min)/2;
            int balloonsRequired = getRequiredBalloon(mid, balloonRequiredEachDay, candiesRequired);
            if  (balloonsRequired <= numberOfBalloon) {
                ans = mid;
                max = mid -1;
            } else {
                min = mid+1;
            }
        }
        return ans; // Final Complexity is O(n* log(max(a[i]*b[i]))
    }

    private static int getMax(int[] balloonRequiredEachDay, int[] candiesRequired) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i<balloonRequiredEachDay.length; i++) {
            res = Math.max(res, balloonRequiredEachDay[i] * candiesRequired[i]);
        }
        return res;
    }

    // Complexity is O(n)
    private static int getRequiredBalloon(int maxCandies, int[] balloonRequiredEachDay, int[] candiesRequired) {
        int size = balloonRequiredEachDay.length;
        int requiredBalloons = 0;
        for(int i = 0; i < size; i++) {
            if (candiesRequired[i] == 0) {
                continue;
            }
            requiredBalloons += Math.max(0, (balloonRequiredEachDay[i] - (maxCandies/candiesRequired[i])));
        }
        return requiredBalloons;
    }
}
