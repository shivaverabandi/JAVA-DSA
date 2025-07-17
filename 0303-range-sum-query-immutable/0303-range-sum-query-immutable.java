class NumArray {
    private int nums[];
    private int n; // length

    private int  []prefix; // prefix array 

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;

        // calculate prefix array.
        prefix = new int[n];
        for(int i = 0; i < n; i++){
            prefix[i] = (i == 0) ? nums[i] : prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        //prefix fomulae -> sum[left,right] => prefix[right] - prefix[left-1]

        return left == 0 ? /* sum(left=0,right) */ prefix[right] : /*sum(left,right)*/ prefix[right] - prefix[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */