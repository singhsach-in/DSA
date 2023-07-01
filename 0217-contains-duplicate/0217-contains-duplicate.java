class Solution {
    public boolean containsDuplicate(int[] nums) {
//      HashSet<Integer> hs = new HashSet<>();
    
//     for(int x : nums){
//         if(hs.contains(x)) 
//             return true;
//         else 
//             hs.add(x);
//     }
//         return false;
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
}
}