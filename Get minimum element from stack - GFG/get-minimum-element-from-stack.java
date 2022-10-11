//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends

// import java.util.*;
class GfG
{
    
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if(st1.empty()) return -1;
        return st2.peek();    
        
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	   if(st1.empty()) return -1;
        st2.pop();
        return st1.pop();
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	    st1.push(x);
        if(st2.empty())
        {
            st2.push(x);
        }
        else if(x < st2.peek())
        {
            st2.push(x);
        }
        else
        {
            st2.push(st2.peek());
        }   
    }	
}

