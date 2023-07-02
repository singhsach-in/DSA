class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking row
        for(int i=0; i<board.length; i++) {
            if(!chkRow(board[i])) return false;
        }
        // checking Column
        if(!chkCol(board)) return false;
        
        // checking sub cube
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!chkSubCube(i, j, board)) return false;
            }
        }
        
        return true;
        
    }
    
    public static boolean chkRow(char[] arr) {
        int[] frq = new int[10];
        for(char x : arr){
            if(x != '.' && x != '\u0000') {
                int k = x - '0';
                System.out.println(x +" "+k);
                frq[k]++;
                if(frq[k] >= 2) return false;
            }
            
        }
        return true;
    }
    public static boolean chkCol(char[][] arr) {
        // int[][] frq = new int[10][10];
        char[] arr2 = new char[9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++) {
                // if(arr[j][i] != '.')
                arr2[j] = arr[j][i];
            }
            if(!chkRow(arr2)) return false;
        }
        
        return true;
    }
    public static boolean chkSubCube(int a, int b, char[][] arr){
        int[] frq = new int[10];
        for(int i=a; i<a+3; i++) {
            for(int j=b; j<b+3; j++){
                if(arr[i][j] != '.' && arr[i][j] != '\u0000') {
                    int k = arr[i][j] - '0';
                    frq[k]++;
                    if(frq[k] >= 2) return false;
                }
                
            }
        }
            return true;
    }
}