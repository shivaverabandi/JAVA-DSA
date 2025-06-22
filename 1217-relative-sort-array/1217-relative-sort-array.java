class Solution {
    // approach 1
     public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();

        // Traverse through the relative order array
        for (int i = 0; i < arr2.length; i++) {
            // Traverse through the target array
            for (int j = 0; j < arr1.length; j++) {
                // If element in target array matches with relative order element
                if (arr1[j] == arr2[i]) {
                    // Add it to the result array
                    result.add(arr1[j]);
                    // Mark the element in target array as visited
                    arr1[j] = -1;
                }
            }
        }

        // Sort the remaining elements in the target array
        Arrays.sort(arr1);
        // Add the remaining elements to the result array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result.add(arr1[i]);
            }
        }

        // Convert ArrayList to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    
    // Approach 2
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
