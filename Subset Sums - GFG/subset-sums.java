//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sumAl = new ArrayList<>();
        int sum=0;
        int index=0;
        int n = arr.size();
        fun(index, n, sum, arr, sumAl);
        return sumAl;
    }
    static void fun(int index, int n, int sum, ArrayList<Integer> arr,  ArrayList<Integer> sumAl) {
        
        if(index == n){
            sumAl.add(sum); 
            return;
        }
        
        fun(index+1, n, sum+arr.get(index),  arr, sumAl);
       
        fun(index+1, n, sum, arr, sumAl);
    }
}