package Arrays_1D;

import java.util.*;

public class pairs_In_Array {

    /* Time Complexity  O(n²)
    * Space Complexity O(n²) */

    // Method to find all unique pairs of elements in the given array
    public static ArrayList<ArrayList<Integer>> find_Pairs(int nums[]) {
        // If the array has only one element, no pairs can be formed
        if (nums.length == 1) {
            return new ArrayList<>(); // Return an empty list
        }

        // Create a list to store all pairs
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Outer loop: Iterates through the array to pick the first element of the pair
        for (int i = 0; i < nums.length; i++) {
            // Inner loop: Iterates through the remaining elements to pick the second element
            for (int j = i + 1; j < nums.length; j++) {
                // Add the pair (nums[i], nums[j]) as a new ArrayList to the list of pairs
                ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
            }
        }

        // Return the list of all pairs
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a scanner for user input

        // Input the size of the array
        int n = in.nextInt();

        // Declare an array to store the input elements
        int nums[] = new int[n];

        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        in.close(); // Close the scanner to avoid resource leaks

        // Call the method to find pairs and print the result
        System.out.println(find_Pairs(nums));
    }
}
