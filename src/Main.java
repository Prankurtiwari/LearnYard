import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaAaaaa"));
    }

    public static int longestPalindrome(String s) {
        int result = 0;
        int[] freq = new int[52];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                freq[c-'A']++;
            } else {
                freq[c-'a']++;
            }
        }
        boolean isOddThere = false;
        for(int i=0; i<52; i++) {
            if (freq[i] %2 == 0) {
                result = result + freq[i];
            } else {
                isOddThere = true;
                result = result + (freq[i] -1);
            }
        }

        return isOddThere ? (result+1) : result;
    }
}