class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ans = -1;
        int cnt = 0;
        for(int num : nums){
            if(cnt == 0){
                ans = num;
                cnt = 1;
            }else if(num != ans){
                cnt--;
            }else {
                cnt++;
            }
        }
        return ans;
    }


    public int majorityElement2(int []nums){
        // space o(n), time o(n)
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
            if(map.get(num) > len/2){
                return num;
            }
        }
        return -1;
    }
}