import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to track character pairs in both directions
        HashMap<Character, Character> mapStoT = new HashMap<>();
        HashMap<Character, Character> mapTtoS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check mapping from s to t
            if (mapStoT.containsKey(charS)) {
                if (mapStoT.get(charS) != charT) {
                    return false;
                }
            } else {
                mapStoT.put(charS, charT);
            }

            // Check mapping from t to s
            if (mapTtoS.containsKey(charT)) {
                if (mapTtoS.get(charT) != charS) {
                    return false;
                }
            } else {
                mapTtoS.put(charT, charS);
            }
        }

        return true;
    }
}
