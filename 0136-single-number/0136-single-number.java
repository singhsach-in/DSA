class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums){
            if(hs.contains(x)){
                hs.remove(x);
            }
            else
                hs.add(x);
        }
        
        Iterator<Integer> value = hs.iterator();
        int ans=0;
        while(value.hasNext()) {
            ans = value.next();
        }
        return ans;

    }
}

    