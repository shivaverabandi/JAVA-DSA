package Arrays_1D;

//26. Remove Duplicates from Sorted Array
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class LeetCode26 {
    /*
    Algorithm: Two-Pointer Technique (Optimal)
    1. Problem: Remove duplicates from a sorted array in-place.
    2. Approach:
       - Use two pointers: 'i' (slow) tracks the last unique element.
       - 'j' (fast) scans the array for new unique elements.
       - When a new unique element is found, place it next to the last unique one.
    3. Key Points:
       - Works because input array is SORTED (duplicates are consecutive).
       - Time Complexity: O(n) → Single pass through array.
       - Space Complexity: O(1) → In-place modification.
    */
    
    public int removeDuplicates(int[] nums) {
        // Initialize slow pointer (i) to track last unique element position
        int i = 0;

        // Fast pointer (j) scans entire array starting from second element
        for(int j = 1; j < nums.length; j++){
            
            // When new unique element is found
            if(nums[i] != nums[j]) {
                // Place new unique element next to last unique element
                nums[i + 1] = nums[j];
                // Move slow pointer to new unique element's position
                i++;
            }
        }
        
        // Number of unique elements = index of last unique + 1
        return i + 1;
    }
}

