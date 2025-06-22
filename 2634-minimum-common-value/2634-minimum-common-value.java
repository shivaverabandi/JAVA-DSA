class Solution {
    // Approach 1 
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num))
                return num;
        }
        return -1;
    }
    // Approach 2
    public int getCommon(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0;
        while(i < l1 && j < l2){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return -1;
    }
}
