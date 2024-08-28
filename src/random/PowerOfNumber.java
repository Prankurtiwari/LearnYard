package random;

public class PowerOfNumber {
    public static void main(String[] args)
    {
        int x=3;
        int y=5;

        System.out.println("Power is: "+power(x,y));

    }
    public static int power(int x, int y)
    {
        if (y == 0)
        {
            return 1;
        }

        int temp = power(x, y / 2);
        if (y % 2 == 0)
        {
            return temp * temp;
        }
        else
        {
            return x * temp * temp;
        }
    }
}
