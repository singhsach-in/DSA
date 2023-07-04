class Solution {
    public int numRabbits(int[] answers) {
        if(answers.length == 0) return 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int x : answers) {
            if(!hs.containsKey(x)) {
                hs.put(x,1); continue;
            }
            hs.put(x, hs.get(x)+1);
        }
        System.out.println(hs);
        int res=0;
        for(int i=0; i<answers.length; i++) {
            if(!hs.containsKey(answers[i])) continue;
            int x = answers[i];
            int val = hs.get(x);
            while(val > 0) {
                res += x+1;
                val -= x+1;
            }
            hs.remove(x);
        }
        
        return res;
    }
}