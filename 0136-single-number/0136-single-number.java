class Solution {
    public int singleNumber(int[] nums) {
//         HashSet<Integer> hs = new HashSet<>();
//         for(int x : nums){
//             if(hs.contains(x)){
//                 hs.remove(x);
//             }
//             else
//                 hs.add(x);
//         }
        
//         Iterator<Integer> value = hs.iterator();
//         int ans=0;
//         while(value.hasNext()) {
//             ans = value.next();
//         }
//         return ans;
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

    