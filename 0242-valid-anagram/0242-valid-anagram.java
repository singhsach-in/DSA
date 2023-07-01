class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        int[] frq = new int[26];
        for(char x : s.toCharArray()) frq[x - 'a']++;
        for(char x : t.toCharArray()) frq[x - 'a']--;
        
        for(int x : frq) if( x != 0 ) return false;
        
        return true;
    }
}