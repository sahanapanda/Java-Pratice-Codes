class Solution {
    public String generateTheString(int n) {
        if (n % 2 == 1) {
            // If n is odd, repeat 'a' n times
            return "a".repeat(n);
        } else {
            // If n is even, repeat 'a' (n - 1) times and append 'b' once
            return "a".repeat(n - 1) + "b";
        }
    }
}
