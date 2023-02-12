package leetcode.substring;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        int rtPtr = 0;
        int lftPtr = 0;
        int min = 0;
        Set<Character> duplicateCheck = new HashSet<>();
        while (rtPtr < s.length()) {
            if(duplicateCheck.contains(s.charAt(rtPtr))) {
                duplicateCheck.remove(s.charAt(lftPtr));
                lftPtr++;
            } else {
                duplicateCheck.add(s.charAt(rtPtr));
                rtPtr++;
            }
            min = Math.max(min, duplicateCheck.size());
        }
        return min;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring3 solution = new LengthOfLongestSubstring3();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
