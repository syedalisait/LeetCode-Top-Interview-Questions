import java.util.HashMap;
import java.util.Scanner;

/*
Given a string, find the length of the longest substring without repeating characters.

        Example 1:

        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
        */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String test = s.next();
        FindLongestSubstringWithoutRepeatingCharacters(test);
    }
    public static int FindLongestSubstringWithoutRepeatingCharacters(String s) {
        int tempCount = 0;
        int count = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // Check if it is not present in Hash
            // If it is present check whether it is not part of the Current Substring(current length)
            if(!hash.containsKey(s.charAt(i)) || i - tempCount > hash.get(s.charAt(i))) {
                tempCount++;
                System.out.println("TempCount: " + tempCount);
            }
            else {
                if (count < tempCount) {
                    count = tempCount;
                    System.out.println("Count: " + count);
                }
                tempCount = i - hash.get(s.charAt(i));
                System.out.println("TempCount: " + tempCount);
            }
            hash.put(s.charAt(i), i);
        }
        if (tempCount > count) {
            count = tempCount;
        }
        System.out.println("Final Count: " + count);
        return count;
    }
}
