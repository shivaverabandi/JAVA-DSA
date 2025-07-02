class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans = new int[nums.length*2];
        int index = 0;
    // scalable solution if problem is like concate array k times then we can run this loop for k times instead of 2 times.
        for(int i = 0; i < 2; i++){
            for(int n : nums){
                ans[index++] = n;
            }
        }
        return ans;
    }

    public int[] getConcatenation2(int [] nums){
        int n = nums.length;
        int []ans = new int[n*2];
        for(int i = 0; i < n; i++){
            ans[i] = ans[n+i] = nums[i];
        }
        return ans;
    }
}