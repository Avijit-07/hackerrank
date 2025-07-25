package co.uk.hackerrank.java;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        char[] chars = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
            if(chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
