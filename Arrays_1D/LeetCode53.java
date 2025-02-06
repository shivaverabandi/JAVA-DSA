package Arrays_1D;
public class LeetCode53 {

    public int maxSubArray1(int[] nums) {
        return divide(nums,0,nums.length-1); // Divide & Conquer Algorithm O(N*LogN).
    }
    private int divide(int nums[], int left, int right){
        if(left==right){
            return nums[left]; // base case
        }
        int mid = (left+right)/2; // middle 
        int leftMax = divide(nums,left,mid);
        int rightMax = divide(nums,mid+1,right);
        // left + right 
        int MaxSum = conquerLeftRight(nums,left,mid,right);
        // return max of left, right, left+right
        return  Math.max(Math.max(leftMax,rightMax),MaxSum);
    }
    private int conquerLeftRight(int nums[],int left,int mid,int right){
        int leftMaxSum = Integer.MIN_VALUE;
        int currLeftsum = 0;
        // why BackWard --> sum upto whole left of the nums to get max From left part
        for(int i = mid; i>=left; i--){
            currLeftsum += nums[i];
            leftMaxSum = Math.max(currLeftsum,leftMaxSum);
        }
        // why Forward --> sum upto whole right(end of nums) to get max From right part
        int rightMaxSum = Integer.MIN_VALUE;
        int currRightsum = 0; 
        for(int i = mid+1; i<=right; i++){
            currRightsum += nums[i];
            rightMaxSum = Math.max(currRightsum,rightMaxSum);
        }
        return leftMaxSum + rightMaxSum;
    }

    public static int kadenesAlgo(int nums[]){ // O(N) --> Kadanes Algorithm.
        int sum = 0;
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            ans = Math.max(sum,ans);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}