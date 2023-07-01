class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        int[] frq1 = new int[5*10000];
        int[] frq2 = new int[5*10000];
        
        for(int i=0; i<s.length(); i++) {
            frq1[s.charAt(i) - '0']++;
            frq2[t.charAt(i) - '0']++;
        }
        
        for(int i=0; i<s.length(); i++){
            if(frq1[s.charAt(i) - '0'] != frq2[s.charAt(i) - '0']){
                return false;
            }
        }
        return true;
    }
}