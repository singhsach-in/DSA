class Solution {
public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> al = new ArrayList<>();
    int  index = 0;
    fun(index, al, nums, nums.length,  ans );
    return ans;
    }
    
static void fun(int index, ArrayList<Integer> al, int[] arr, int n, List<List<Integer>> ans ) {
        
             ans.add(new ArrayList<>(al));
     
        for(int i=index; i<n; i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            al.add(arr[i]);
            fun(i+1, al, arr, n,  ans );
            al.remove(al.size() - 1);
        }
   }
}