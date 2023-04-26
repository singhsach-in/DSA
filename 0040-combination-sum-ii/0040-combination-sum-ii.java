class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        int index=0, n = candidates.length, sum=0;
        
        fun(index, n,  target, al, ans, candidates);
        return ans;
    }
    static void fun(int index, int n,  int target,List<Integer> al,
                  List<List<Integer>> ans, int[] arr) {
        
            if(target == 0) {
                ans.add(new ArrayList(al));
                 return;
            }

        for(int i = index; i< n; i++){  
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
               al.add(arr[i]);
               fun(i+1, n,  target-arr[i], al, ans, arr); 
               al.remove(al.size() -1);           
        }  
    }
}