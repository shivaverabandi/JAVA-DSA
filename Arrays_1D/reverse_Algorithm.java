package Arrays_1D;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_Algorithm {

    // Method to reverse the array using auxiliary space (new array)
    public static int[] reverse_List1(int nums[]) {
        // If the array has only one element, no need to reverse
        if (nums.length == 1) {
            return nums;
        }

        // Create a new array to store the reversed elements
        int aux_space[] = new int[nums.length];

        // Fill the new array with elements from nums in reverse order
        for (int i = nums.length - 1; i >= 0; i--) {
            // Calculate the correct index in the new array
            aux_space[nums.length - i - 1] = nums[i];
        }

        // Return the reversed array
        return aux_space;
    }

    // Method to reverse the array in-place (no extra space used)
    public static int[] reverse_List2(int nums[]) {
        // If the array has only one element, no need to reverse
        if (nums.length == 1) {
            return nums;
        }

        // Initialize two pointers: one at the beginning and one at the end
        int i = 0;
        int j = nums.length - 1;

        // Swap elements from both ends of the array until pointers meet
        while (i < j) {
            // Swap the elements at indices i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            // Move the pointers closer to the center
            i++;
            j--;
        }

        // Return the reversed array
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner for user input

        // Input the size of the array
        int size = sc.nextInt();
        int nums[] = new int[size]; // Declare an array of the given size

        // Input the elements of the array
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close(); // Close the scanner to avoid resource leaks

        //Auxillary Space Approach
        // *** Time Complexity O(N)
        // *** Space Complexity O(N)
        // Call the first method and print the reversed array
        System.out.println("Reversed with auxiliary space: " + Arrays.toString(reverse_List1(nums)));

        // Two Pointer Appraoch ***Time Complexity O(N/2)
        //***Space Complexity O(1)
        // Call the second method and print the reversed array
        System.out.println("Reversed in-place: " + Arrays.toString(reverse_List2(nums)));
    }
}

