class Solution {
    public static void solveSudoku(char[][] board) {
        int n = board[0].length;
        solve(board);
        
    }

    static boolean solve(char[][] board) {
        
     for(int i=0; i<board.length; i++){
        for(int j=0; j<board[0].length; j++){
             if(board[i][j] == '.'){
                for(char c='1'; c<='9'; c++){
                    if(isValid(i, j, c, board)){
                         board[i][j] = c;
                        if(solve(board)){
                        return true;
                        }
                        else{
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
                 
        
       
    

    static boolean isValid(int row, int col, char k, char[][] board) {
        // col check
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == k)
                return false;
        }
        // row check
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == k)
                return false;
        }

        // sub-board check
        for (int i = (row / 3) * 3; i < ((row / 3) * 3) + 3; i++) {

            for (int j = (col / 3) * 3; j < ((col / 3) * 3) + 3; j++) {
                if (board[i][j] == k)
                    return false;
            }
        }

        return true;
    }
}

