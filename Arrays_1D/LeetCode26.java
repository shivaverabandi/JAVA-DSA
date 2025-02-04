package Arrays_1D;

//26. Remove Duplicates from Sorted Array
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

