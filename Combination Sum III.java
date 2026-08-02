import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int totalLeft, int start) {
        if (totalLeft == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Prune: array is sorted, so subsequent elements are also too large
            if (candidates[i] > totalLeft) {
                break;
            }

            // Skip duplicate elements at the current depth
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, totalLeft - candidates[i], i + 1);
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
}
