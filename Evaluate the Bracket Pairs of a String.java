import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // Step 1: Populate a HashMap with key-value pairs from knowledge
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder result = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean inBracket = false;

        // Step 2: Iterate through the string s
        for (char c : s.toCharArray()) {
            if (c == '(') {
                inBracket = true;
            } else if (c == ')') {
                inBracket = false;
                // Look up key in map, replace with value or '?' if missing
                String val = map.getOrDefault(key.toString(), "?");
                result.append(val);
                key.setLength(0); // Reset key buffer for the next pair
            } else if (inBracket) {
                key.append(c);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
