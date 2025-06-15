class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int cnt[] = new int[1001];
        // count the freq of elements in arr1
        for(int i = 0; i<arr1.length; i++){ // -> o(N)
            cnt[arr1[i]]++;
        }

        int ans[] = new int[arr1.length]; // Output space // O(N)
        int idx = 0;
        // fill the answer array according to the elements in arr2.
        for(int i = 0; i<arr2.length; i++){ 
            // add in ans array until count becomes 0
            while(cnt[arr2[i]] > 0 ){
                ans[idx] = arr2[i];
                cnt[arr2[i]]--;
                idx++;
            }
        }
        // fill the ans array with arr1 elements which are not in arr2.
        for(int i = 0; i < 1001; i++){
            // add in ans array until count becomes 0
            while(cnt[i] > 0){
                ans[idx] = i;
                cnt[i]--;
                idx++;
            }
        }
        // return ans array.
        return ans;
    }
}
