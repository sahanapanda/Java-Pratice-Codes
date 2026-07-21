import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int numWords = words.length;
        int totalLen = wordLen * numWords;
        int sLen = s.length();

        if (sLen < totalLen) {
            return result;
        }

        // Count frequency of each word in words array
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Iterate over all possible starting offsets within [0, wordLen - 1]
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> currentCounts = new HashMap<>();
            int count = 0; // Tracks valid words in the current window

            while (right + wordLen <= sLen) {
                // Get word from right side of window
                String sub = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordCounts.containsKey(sub)) {
                    currentCounts.put(sub, currentCounts.getOrDefault(sub, 0) + 1);
                    count++;

                    // If a word frequency exceeds the expected count, shrink window from left
                    while (currentCounts.get(sub) > wordCounts.get(sub)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentCounts.put(leftWord, currentCounts.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // If window size matches target length, record starting index
                    if (count == numWords) {
                        result.add(left);
                    }
                } else {
                    // Reset window if an invalid word is found
                    currentCounts.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}
