class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        ans[0] = lower(nums,target,n);
        ans[1] = upper(nums,target,n);
        return ans;
    }
    private int upper(int a[], int key, int n){
        int low = 0;
        int end = n - 1;
        int ans = -1;

        while(low <= end){

            int mid = low + (end - low)/2;

            if(a[mid] == key){
                ans = mid;
                low = mid + 1;
            }else if(a[mid] <= key){
                low = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return ans;
    }
    private int lower(int a[], int key, int n){
        int low = 0;
        int end = n - 1;
        int ans = -1;

        while(low <= end){

            int mid = low + (end - low)/2;

            if(a[mid] == key){
                ans = mid;
                end = mid - 1;
            }else if(a[mid] >= key){
                end = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}