/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */


/*
NOT SOLVED - Not sure how to handle signed Integer
 */

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverse(n);
    }

    private static int reverse(int x) {
        long sum = 0;
        int temp = Math.abs(x);
        while (temp > 0 ) {
            int mod = temp % 10;
            sum = sum * 10;
            sum = sum + mod;
            temp = temp/10;
            System.out.println("Mod: " +mod + " sum: " + sum + " temp: " + temp);
        }
        if (x < 0) {
            sum = sum * -1;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return 0;
        }
        System.out.println(sum);
        return ((int)sum);
    }
}
