package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        if(arr.length == 0)
            return 0;
        if(arr.length == 1)
            return 1;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        int left = 0;
        for (int right = 0; right < arr.length; right++) {

            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[right]);
            maxLength = Math.max(maxLength, right - left + 1);
        }


        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("zabcabcbb"));
    }
}
