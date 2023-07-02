class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i=0; i<pattern.length(); i++) {
            if(!hm.containsKey(pattern.charAt(i)) && !hm.containsValue(arr[i])){
                hm.put(pattern.charAt(i), arr[i]);
            }
            if(!hm.containsKey(pattern.charAt(i)) && hm.containsValue(arr[i])){
                return false;
            }
            else if(hm.get(pattern.charAt(i)).equals(arr[i]) == false)
                    return false;
            
            // else if(hm.containsValue(arr[i]){
            //     return false;
            // }
            
        }
        return true;
    }
}