class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int cnt[] = new int[1001];
        for(int i = 0; i<arr1.length; i++){
            cnt[arr1[i]]++;
        }
        int ans[] = new int[arr1.length];
        int idx = 0;
        for(int i = 0; i<arr2.length; i++){
            while(cnt[arr2[i]] > 0 ){
                ans[idx] = arr2[i];
                cnt[arr2[i]]--;
                idx++;
            }
        }
        for(int i = 0; i < 1001; i++){
            while(cnt[i] > 0){
                ans[idx] = i;
                cnt[i]--;
                idx++;
            }
        }
        return ans;
    }
}