//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        int n = S.length();
        int ind = 0;
        ArrayList<String> al = new ArrayList<>();
        String s2="";
        fun(ind, n, al, S, s2);
        Collections.reverse(al);
        return al;
    }
    static void fun(int ind, int n, ArrayList<String> al, String s, String s2 ) {
        if(ind == n) {
            al.add(new String(s2));
            return;
        }
        
        s2 += s.charAt(ind);
        // al.add(al.get(ind)+(s.charAt(ind)));
        fun(ind+1, n, al, s, s2);
        
        s2 = s2.substring(0, s2.length()-1);
        // al.remove(al.size() - 1);
        if(s2.length() > 0 && s2.charAt(s2.length()-1) != ' ') {
            
            s2 += " ";
            fun(ind, n, al, s, s2);
        }
    }
    
}