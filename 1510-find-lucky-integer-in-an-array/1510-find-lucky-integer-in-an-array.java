class Solution {
    public int findLucky(int[] arr) {
        int []freq = new int[501];

        for(int n : arr){
            freq[n]++;
        }
        int ans = -1;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == freq[arr[i]]){
                ans = Math.max(ans,arr[i]);
            }
        }
        return ans;
    }
}