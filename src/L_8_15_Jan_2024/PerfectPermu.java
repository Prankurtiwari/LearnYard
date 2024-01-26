package L_8_15_Jan_2024;

/*
https://codeforces.com/problemset/problem/1711/A
Explanation : https://youtu.be/Hnb0Pp4gxdw?si=qEz6xmzZXZFQiIG6
 */
public class PerfectPermu {
    public static void main(String[] args) {
        permu(5);
        System.out.println("-----------");
        permu(8);
        System.out.println("-----------");
        permu(1);
        System.out.println("-----------");
        permu(4);
        System.out.println("-----------");
    }

    private static void permu(int n) {
        for (int i = 2;i<=n; i++) {
            System.out.print(i + ",");
        }
        System.out.print(1);
    }
}
