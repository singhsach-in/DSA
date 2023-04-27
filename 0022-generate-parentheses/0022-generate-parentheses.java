class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<>();
        String s="";
        int open=n, close=n;
        fun(open, close, al, s);
        return al;
    }
    public static void fun(int open, int close, ArrayList<String> al, String s)
    {
      if(open == 0 && close == 0){
          al.add(s);
          return;
      }
      if(open != 0) {
          String s1 = s + "(";
          fun(open-1, close, al, s1);
      }
      if(open < close) {
          String s2 = s + ")";
          fun(open, close-1, al, s2);
      }
    }
}