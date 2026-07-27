class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track seen numbers (1-9) for each row, column, and 3x3 box
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // Skip empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                int val = board[r][c] - '1'; // Map '1'-'9' to index 0-8
                int boxIndex = (r / 3) * 3 + (c / 3); // Map (r, c) to box index 0-8

                // Check for duplicates in row, column, or 3x3 box
                if (rows[r][val] || cols[c][val] || boxes[boxIndex][val]) {
                    return false;
                }

                // Mark the number as seen
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }

        return true;
    }
}
