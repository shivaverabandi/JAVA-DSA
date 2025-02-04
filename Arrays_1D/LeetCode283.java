
package Arrays_1D;

//283. Move Zeroes
// Problem link :https://leetcode.com/problems/move-zeroes/

public class LeetCode283 {

    public void moveZeroes(int[] nums) { //O(N) Two pointer
        int j = 0;
        for( ;j<nums.length; j++){
         if(j == nums.length-1){ // if all elements are non - zero.
             return; 
         }
         if(nums[j]==0){
             break;
         }
        }
        for(int i = j+1; i < nums.length; i++){
         if(nums[i] != 0){
             int temp = nums[j];
             nums[j] = nums[i];
             nums[i] = temp;
             j++;
         }
        }
    }
}