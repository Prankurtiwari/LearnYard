package L_36_4_Mar_2024;

/*
* Given the value of N and P, we need to find the square root of N
* with precision P.
* */

public class SquareRootPres {
    public static void main(String[] args) {
        double N= 3, P = 1;
        System.out.println(root(N,P));
    }

    private static double root(double n, double p) {
        double start = 0;
        double end  = n/2;
        double pre = Math.pow(10, -p);
        double ans = 0.0d;
        while((end - start) >= pre) {
            double mid  = (end+start)/2.0;
            if ((mid * mid) <= n ) {
                ans = mid;
                start = mid + pre;
            } else {
                end = mid + pre;
            }
        }
        return ans;
    }
}
