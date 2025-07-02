class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
   // Appraoch 2 this also same but using streams.
    public boolean hasDuplicate(int[] nums) {
        // here logic is if set length is less than nums length then there are duplicates.
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
