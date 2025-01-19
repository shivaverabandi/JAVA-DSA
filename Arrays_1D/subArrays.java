package Arrays_1D;

import java.util.*;
public class subArrays {

    /*
     * Algorithm: Find All Subarrays of an Array
     * 
     * Problem: 
     * Given an array, find all possible subarrays and return them as a list of lists.
     * A subarray is a contiguous segment of an array.
     * 
     * Steps:
     * 1. Initialize an ArrayList `ans` to store the final list of subarrays.
     * 2. Use a nested loop structure:
     *    - Outer loop (i): Start of the subarray.
     *    - Inner loop (j): End of the subarray.
     *    - For each (i, j) pair:
     *       a. Create a temporary list `list` to hold the current subarray.
     *       b. Use a third loop (k) to iterate from `i` to `j` and add elements
     *          from the array to the `list`.
     *       c. Add the subarray `list` to the `ans` list.
     * 3. Return `ans` containing all the subarrays.
     * 
     * Input:
     * - An integer array `nums`.
     * - Size of the array `n`.
     * 
     * Output:
     * - A list of all subarrays (each subarray is a list of integers).
     * 
     * Time Complexity:
     * - Outer loop: O(n)
     * - Inner loop: O(n)
     * - Third loop: O(n)
     * - Total: O(n^3)
     * 
     * Space Complexity:
     * - O(n^2) for storing all subarrays.
     */

    public static ArrayList<ArrayList<Integer>> find_Sub_Arrays(int nums[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(nums[k]);
                }
                ans.add(list);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        System.out.println("All subarrays are:");
        System.out.println(find_Sub_Arrays(nums));
    }
}
