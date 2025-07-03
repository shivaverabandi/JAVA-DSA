class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            if(val != nums[i]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    // Appraoch 2 . small tricky, but this is impressive
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        int n = nums.length;
        while(idx < n){
            if(nums[idx] == val){
                nums[idx] = nums[--n];
            }else{
                idx++;
            }
        }
        return n;
    }
}
