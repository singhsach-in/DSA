class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        fun(ans, al, freq, nums);
        return ans;
    }
    static void fun(List<List<Integer>> ans, List<Integer> al, boolean[] freq, int[] nums) {
        if(al.size() == nums.length) {
            ans.add(new ArrayList(al)); 
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(freq[i] != true){
                freq[i] = true;
                al.add(nums[i]);
                fun(ans, al, freq, nums);
                al.remove(al.size() - 1);
                freq[i] = false;
            }
        }
    }
}