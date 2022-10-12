class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n1 = Integer.MAX_VALUE, n2 = Integer.MAX_VALUE;
        for(int x :  nums) {
            if(x <= n1) {
                n1 = x;
            }
            else if( x <= n2) {
                n2 = x ;
            }
            else {
                return true;
            }
        }
        return false;
    }
}