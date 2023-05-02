class Solution {
    public List<List<String>> solveNQueens(int n) {
        // to store the result
        List<List<String>> ans = new ArrayList<>();
        // to store the possible order
        List<String> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s="";
            for(int j=0; j<n; j++){
                s+=".";
            }
            al.add(s);
        }
        // System.out.println(al);
         solve(0, al, ans, n);
         return ans;
    }
    static boolean isValid(int i, int j, int n, List<String> al) {
        // checking column
        for(int k=0; k<n; k++){
            if(al.get(k).charAt(j) == 'Q')
                return false;
        }
        //checking left upper digonal
        for(int k=i, l=j; k>=0 && l<n; k--,l++){
             if(al.get(k).charAt(l) == 'Q')
                return false;
        }
        //checking right upper digonal
        for(int k=i, l=j; k>=0 && l>=0; k--,l--){
             if(al.get(k).charAt(l) == 'Q')
                return false;
        }
        
        return true;
    }
    static void solve(int i, List<String> al, List<List<String>> ans, int n) {
        if(i == n) {
            ans.add(new ArrayList(al));
            return;
        }
        for(int j=0; j<n; j++) {
            if(isValid(i, j, n, al)) {
                String row = al.get(i);
                row = row.substring(0, j) + "Q" + row.substring(j+1);
                al.set(i, row);
                solve(i+1, new ArrayList<>(al), ans, n);
                row = al.get(i);
                row = row.substring(0, j) + "." + row.substring(j+1);
                al.set(i, row);
            }
        }
         // al.remove(al.size() -1);
       
    }
}