class Solution {
    private void swap(int []a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int start = 0, moving = 0, end = nums.length-1;

        while(moving <= end){
            if(nums[moving] == 0){
                swap(nums,start,moving);
                start++;
                moving++;
            }else if(nums[moving] == 1){
                moving++;
            }else{
                swap(nums,end,moving);
                end--;
            }
        }
    }
}