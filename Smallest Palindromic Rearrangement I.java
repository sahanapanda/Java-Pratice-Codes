import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;
        
        // Extract and sort the left half
        char[] leftHalf = s.substring(0, halfLen).toCharArray();
        Arrays.sort(leftHalf);
        
        char[] result = new char[n];
        
        // Place sorted characters at both ends moving inwards
        for (int i = 0; i < halfLen; i++) {
            result[i] = leftHalf[i];
            result[n - 1 - i] = leftHalf[i];
        }
        
        // If length is odd, preserve the middle character
        if (n % 2 != 0) {
            result[halfLen] = s.charAt(halfLen);
        }
        
        return new String(result);
    }
}
