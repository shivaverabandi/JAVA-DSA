class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    Map<Integer, Integer> freqCntForElemInNums2 = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        
        for(int n : nums2){ 
            freqCntForElemInNums2.put(n,freqCntForElemInNums2.getOrDefault(n,0)+1);
        }
    }
    
    public void add(int index, int val) {
        // update count of previous number which is at index of nums2
        freqCntForElemInNums2.put(nums2[index],  freqCntForElemInNums2.get(nums2[index]) - 1);
        nums2[index] += val;
        // update the map with the value after added.
        freqCntForElemInNums2.put(nums2[index], freqCntForElemInNums2.getOrDefault(nums2[index],0)+1);
    }

    public int count(int tot) {
        int ans = 0;
        for(int i = 0; i<nums1.length; i++){ // At worst case it runs for 1000 times when this method calls
            int diff = tot - nums1[i];
            if(freqCntForElemInNums2.containsKey(diff)){
                ans += freqCntForElemInNums2.get(diff);
            }
        } 
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */