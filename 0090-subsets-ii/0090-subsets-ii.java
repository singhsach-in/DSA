class Solution {
       

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
           Set<List<Integer>> st = new HashSet<>();
           List<List<Integer>> ls = new ArrayList<>();
         ArrayList<Integer> al = new ArrayList<>();
      int  index = 0;
        fun(index, al, nums, nums.length,  st );
        System.out.println(st);
       for(List<Integer> l : st){
           ArrayList<Integer> l2 = new ArrayList<>();
           for(int x : l) {
               l2.add(x);
           }
           ls.add(l2);
       }
        
        return ls;
    }
    static void fun(int index, ArrayList<Integer> al, int[] nums, int n, Set<List<Integer>> st ) {
        if(index == n){
             // System.out.println(al);
            // st.add(al);
             st.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[index]);
        fun(index+1, al, nums,n, st);
        al.remove(al.size() - 1);
        fun(index+1, al, nums,n, st);
   }
}