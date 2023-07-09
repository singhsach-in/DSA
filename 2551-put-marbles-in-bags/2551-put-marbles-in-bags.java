class Solution {
    public long putMarbles(int[] arr, int k) {
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++) {
            al.add(arr[i] + arr[i+1]);
        }
        Collections.sort(al);
        long min=0, max=0;
        for(int i=0; i<k-1; i++) {
            min += al.get(i);
            max += al.get(al.size()-1-i);
        }
        return max-min;
        
    }
}