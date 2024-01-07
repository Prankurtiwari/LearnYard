package Lecture1;

public class LeapYear {

//    A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
//    A leap year (except a century year) can be identified if it is exactly divisible by 4.
//    A century year should be divisible by 4 and 100 both.
//     A non-century year should be divisible only by 4.

    public static boolean isLeapSelf(int year){
       // century
        if(year % 100 == 0) {
           return year % 400 == 0;
       }
        // non -century
       else {
           return year % 4 == 0;
       }
    }


    public static boolean isLeap(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


    public static boolean isLeapLong(int year){
        boolean is_leap_year = false;
        if (year % 4 == 0) {
            is_leap_year = true;

            // To identify whether it is a
            // century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        return is_leap_year;
    }

    public static void main(String[] args) {
        System.out.println(isLeap(2024));
        System.out.println(isLeap(2000));
        System.out.println(isLeap(2012));
        System.out.println(isLeap(2002));
        System.out.println("-------------------------------");
        System.out.println(isLeapLong(2024));
        System.out.println(isLeapLong(2000));
        System.out.println(isLeapLong(2012));
        System.out.println(isLeapLong(2002));
        System.out.println("-------------------------------");
        System.out.println(isLeapSelf(2024));
        System.out.println(isLeapSelf(2000));
        System.out.println(isLeapSelf(2012));
        System.out.println(isLeapSelf(2002));
        System.out.println(isLeapSelf(1));
        System.out.println(isLeapSelf(2));
        System.out.println(isLeapSelf(4));
    }
}
