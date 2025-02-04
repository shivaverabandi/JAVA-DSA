package Arrays_1D;

//977. Squares of a Sorted Array
//Problem link --> https://leetcode.com/problems/squares-of-a-sorted-array/

public class LeetCode977 {
    public int[] sortedSquares(int[] nums) { // Optimized --> O(N) Two pointer Approach.
        int i = 0;
        int j = nums.length-1;
        int ans[] = new int[nums.length];
        for(int idx = nums.length - 1; idx >= 0; idx --){
            int val;
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                val = nums[j];
                j--;
            }else{
                val = nums[i];
                i++;
            }
            ans[idx] = val * val; // Squaring and store in ans array
        }
        return ans;
    }
}
