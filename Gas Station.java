class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentTank = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentTank += gas[i] - cost[i];

            // If we run out of gas at this point
            if (currentTank < 0) {
                // Reset our starting point to the next station
                startIndex = i + 1;
                // Reset current fuel tank
                currentTank = 0;
            }
        }

        // If overall gas is less than overall cost, it's impossible
        return (totalGas >= totalCost) ? startIndex : -1;
    }
}
