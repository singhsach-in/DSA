class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = 1;
        }
        
        int i=0, j=0;
        for(int k=1; k < nums.length; k++) {
            i=0; j=k;
            while(i < j) {
                if(nums[j] > nums[i]) {
                    arr[j] = Math.max(arr[j], arr[i]+1);
                    // j++;
                }
                
                    i++;         
                
            }
            
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}