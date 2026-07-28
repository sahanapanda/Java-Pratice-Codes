class Solution {
    public String countAndSay(int n) {
        String current = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            
            for (int j = 0; j < current.length(); j++) {
                // If the next character is the same, increment count
                if (j + 1 < current.length() && current.charAt(j) == current.charAt(j + 1)) {
                    count++;
                } else {
                    // Append frequency followed by the character
                    next.append(count).append(current.charAt(j));
                    count = 1; // Reset count for the next sequence
                }
            }
            
            current = next.toString();
        }
        
        return current;
    }
}
