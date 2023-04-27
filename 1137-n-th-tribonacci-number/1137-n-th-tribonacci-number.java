class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int t0=0, t1=1, t2=1, sum=0;
        for(int i=3; i<=n; i++) {
            int t = t0 + t1 + t2;
            sum = t;
            t0 = t1;
            t1 = t2;
            t2 = t;
        }
        return sum;
            
    }
    
    // static int fun(int n) {
    //     if(n==0) return 0;
    //     if(n ==1 || n == 2) return 1;
    //     return fun()
    // }
}