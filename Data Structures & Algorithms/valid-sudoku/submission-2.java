class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char spot = board[r][c];
                if (spot == '.') {
                    continue;
                }
                String row = "row" + r + spot;
                String column = "column" + c + spot;
                String box = "box" + r/3 + c/3 + spot;
                if (!set.add(row) || !set.add(column) || !set.add(box)) {
                    return false;
                }
            }
        }
        return true;
    }
}
