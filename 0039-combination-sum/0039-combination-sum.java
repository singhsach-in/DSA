class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        int index=0, n = candidates.length, sum=0;
        
        fun(index, n, sum, target, al, ans, candidates);
        return ans;
    }
    static void fun(int i, int n, int sum, int target,List<Integer> al,
                  List<List<Integer>> ans, int[] arr) {
        
        if(i == n) {
            if(target == 0) {
                ans.add(new ArrayList(al));
            }
            return;
        }
       
        if(arr[i] <= target) {
        al.add(arr[i]);
        // pick same number
        fun(i, n, sum, target-arr[i], al, ans, arr);       
        al.remove(al.size() -1);
        }

        // pick next number
        fun(i+1, n, sum, target, al, ans, arr);
        
    }
}