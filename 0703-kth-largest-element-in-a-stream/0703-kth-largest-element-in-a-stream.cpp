class KthLargest {
    priority_queue <int, vector<int>, greater<int>> p;
    int n;
public:
    KthLargest(int k, vector<int>& nums) {
        n=k;
        for(int i=0; i<nums.size(); i++){
            p.push(nums[i]);
        }
    }
    
    int add(int val) {
        p.push(val);
    while(p.size() > n) p.pop();
        return p.top();
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */