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
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> sumAl = new ArrayList<>();
        int sum=0;
        int index=0;
        int n = arr.size();
        fun(index, n, sum, al, arr, sumAl);
        return sumAl;
    }
    static void fun(int index, int n, int sum, ArrayList<Integer> al, ArrayList<Integer> arr,  ArrayList<Integer> sumAl) {
        
        if(index == n){
            // System.out.println(sum);
            sumAl.add(sum); 
            return;
        }
        
        al.add(arr.get(index));
        sum += arr.get(index);
        fun(index+1, n, sum, al, arr, sumAl);
        al.remove(al.size() - 1);
        sum -= arr.get(index);
        fun(index+1, n, sum, al, arr, sumAl);
    }
}