class Solution {
    public int majorityElement(int[] nums) {
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