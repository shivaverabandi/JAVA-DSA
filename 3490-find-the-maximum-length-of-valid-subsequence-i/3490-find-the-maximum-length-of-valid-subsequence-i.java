class Solution {
    public int maximumLength(int[] nums) {

        int ans = 0;

        int possibleWays[][] = {{0,0},{0,1},{1,0},{1,1}}; // even - even , even - odd , odd - even , odd - odd

        for(int []pair : possibleWays){
            int subSeqLen = 0; // track the max subSeqLength
            for(int n : nums){
                if(n % 2 == pair[subSeqLen % 2]){ // we will check curr remainder with expected remainder.
                    subSeqLen++;
                }
            }
            ans = Math.max(ans,subSeqLen);
        }
        return ans;
    }
}

/*
Input: nums = [1,2,3,4]

Output: 4

Explanation:  The longest valid subsequence is [1, 2, 3, 4].

Here it is following odd - even pair so, we get maximum at {1,0}


*/