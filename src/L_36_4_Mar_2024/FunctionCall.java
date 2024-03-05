package L_36_4_Mar_2024;
/*
* f(x) = x+ x/10 + x/100 +....
* for given f(x) find x which satisfy f(x)
*for example
* f(x) = 1370;
* now for which value of x f(x) = 1370;
* x = 1234
*
*
* */
// Last problem
public class FunctionCall {

    public static void main(String[] args) {
        int N = 1370;
        System.out.println(func(N));
    }

    private static int func(int n) {
        int start = 0;
        int end = n;
        while(start <= end) {
            int mid = (start +end)/2;
            if (n == givenFunction(mid)) {
                return mid;
            } else if (givenFunction(mid) > n) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    private static int givenFunction(int n) {
        int ans =0;
        while(n >= 1) {
            ans += n;
            n /= 10;
        }
        return ans;
    }
}
