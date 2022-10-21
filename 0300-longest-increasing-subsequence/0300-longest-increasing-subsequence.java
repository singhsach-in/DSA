class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++)
            arr[i]=1;
        
        for(int i=1; i<nums.length; i++) {
            int p1= 0;
            int p2 = i;
            while(p1 != p2) {
                if(nums[p1] < nums[p2]) {
                    arr[p2] = Math.max(arr[p2], arr[p1]+1);
                }
                p1++;
            }
            
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }
}