class Solution {

    // optimal solution
    // public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;

    //     int ans[] = new int[n];

    //     // find left product
    //     ans[0] = 1;
    //     for(int i = 1; i < n; i++){
    //         ans[i] = ans[i-1] * nums[i-1];
    //     }

    //     // find right product
    //     int rightProd = 1;
    //     for(int i = n-1; i >= 0; i--){
    //         ans[i] = rightProd * ans[i];
    //         rightProd *= nums[i];
    //     }

    //     return ans;

    // }

    
    // Better  solution
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int ans[] = new int[n];
        int pref[] = new int[n];
        int suf[] = new int[n];

        // find left product
        pref[0] = 1;
        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] * nums[i-1];
        }

        // find right product
        suf[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            suf[i] = suf[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < n; i++){
            ans[i] = pref[i] * suf[i];
        }
        return ans;

    }

// Better but not have code quality, not followed rules, used division operation
/*
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
    
        long totalProduct = 1;
        int zeroCount = 0;
    
        // Single pass to count zeros and calculate product
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                if (zeroCount > 1) return ans; // All zeros
            } else {
                totalProduct *= num;
            }
        }
    
        // Handle different zero cases
        for (int i = 0; i < n; i++) {
            if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? (int)totalProduct : 0;
            } else if (zeroCount == 0) {
                ans[i] = (int)(totalProduct / nums[i]);
            }
            // zeroCount > 1 case already handled (all zeros)
        }
        return ans;
    }
*/
}