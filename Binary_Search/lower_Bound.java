package Binary_Search;
public class lower_Bound {

    // Function to find the lower bound of a target element in a sorted array
    private static int lowerBound(int a[], int tar) {
        int low = 0; // Start of the search range
        int end = a.length - 1; // End of the search range
        int ans = a.length; // Initial answer set to array length (default if target is greater than all elements)

        // Binary search loop
        while (low <= end) {
            int mid = low + (end - low) / 2; // Calculate the middle index to avoid overflow

            // If the middle element is greater than or equal to the target
            if (a[mid] >= tar) {
                ans = mid; // Update the potential answer to the current index
                end = mid - 1; // Move the search range to the left (lower indices)
            } else {
                // If the middle element is less than the target
                low = mid + 1; // Move the search range to the right (higher indices)
            }
        }

        // Return the index of the first element that is greater than or equal to the target
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = {2, 3, 5, 5, 5, 5, 5, 10, 11}; // Example sorted array

        // Find and print the lower bound index of the target value 5
        System.out.println(lowerBound(nums, 4)); // Expected output: 2 (first occurrence of 5)
    }
}
