class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (Rules(board, i, j, digit)) {
                            board[i][j] = digit;
                            if (solve(board))
                                return true;
                            else {
                                board[i][j] = '.';
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean Rules(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }
        int SR = ((row / 3) * 3);
        int SC = ((col / 3) * 3);
        for (int i = SR; i < SR + 3; i++) {
            for (int j = SC; j < SC + 3; j++) {
                if (board[i][j] == digit)
                    return false;
            }
            
        }
    return true;
    }
}