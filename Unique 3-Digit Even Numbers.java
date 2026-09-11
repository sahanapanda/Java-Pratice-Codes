class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Iterate through all 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;

            // Temporarily decrement digit frequencies
            freq[hundreds]--;
            freq[tens]--;
            freq[ones]--;

            // Check if all required digits are available
            if (freq[hundreds] >= 0 && freq[tens] >= 0 && freq[ones] >= 0) {
                count++;
            }

            // Restore frequency counts
            freq[hundreds]++;
            freq[tens]++;
            freq[ones]++;
        }

        return count;
    }
}
