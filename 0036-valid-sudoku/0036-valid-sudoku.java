class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> st = new HashSet<>();
        

        for(int row=0; row<9; row++) {
            for(int col=0; col<9; col++) {
                char num = board[row][col];
                if(num != '.'){
                    if(!st.add(num + "in row" + row) ||
                       !st.add(num + "in col" + col) ||
                       !st.add(num + "in cube" + (row/3)+ ","+ (col/3))) {
                        return false;
                    }
            }
                }
                
        }
        return true;
    }
}