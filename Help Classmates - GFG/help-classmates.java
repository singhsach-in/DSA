//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    
	    Stack<Integer> st = new Stack<>();
	    int[] ans = new int[arr.length];
	    int p1=0, p2=1;
	    for(int i=0; i<arr.length-1; i++) {
	        p1=i;
	        p2=i+1;
	        while(p2 < arr.length) {
	            
	            if(arr[p2] < arr[p1]) {
	                ans[p1] = arr[p2];
	                break;
	            }
	            p2++;
	        }
	        if(p2 >= arr.length) {
	            ans[p1] = -1;
	        }
	    }
	    ans[ans.length-1]=-1;
	        
	    return ans;
	} 
}
