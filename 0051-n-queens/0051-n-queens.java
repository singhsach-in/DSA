class Solution {
    public List<List<String>> solveNQueens(int n) {
        // to store the result
        List<List<String>> ans = new ArrayList<>();
        // to store the possible order
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
         solve(0, board, ans, n);
         return ans;
    }
    
    static boolean isValid(int row, int col, int n, char[][] board) {
        // checking column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q')
                return false;
        }
        //checking left upper diagonal
        for(int i = row, j = col; i >= 0 && j < n; i--, j++){
             if(board[i][j] == 'Q')
                return false;
        }
        //checking right upper diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
             if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    
    static void solve(int row, char[][] board, List<List<String>> ans, int n) {
        if(row == n) {
            List<String> solution = new ArrayList<>();
            for(int i = 0; i < n; i++){
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }
        for(int col = 0; col < n; col++) {
            if(isValid(row, col, n, board)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans, n);
                board[row][col] = '.';
            }
        }    
    }
}
