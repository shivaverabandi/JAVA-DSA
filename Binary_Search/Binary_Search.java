package Binary_Search;

import java.util.*;
public class Binary_Search {

    // Method to find the index of the target element using binary search
    public static int find_Index(int nums[], int target){
        int n = nums.length; // Length of the array
        int start = 0;       // Start index of the search range
        int end = n - 1;     // End index of the search range
        
        // Binary search loop
        while(start <= end){ 
            // Calculate the middle index
            int mid = (start + end) / 2;

            // Check if the middle element matches the target
            if(nums[mid] == target){
                return mid;  // Return the index if found
            }
            // If target is smaller, search in the left half
            else if(nums[mid] > target){
                end = mid - 1; 
            }
            // If target is larger, search in the right half
            else {
                start = mid + 1; 
            }
        }
        // If the target is not found, return -1
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner for user input

        // Input the size of the array
        int size = sc.nextInt();
        int nums[] = new int[size]; // Declare an array of the given size

        // Input the elements of the array
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        // Input the target value to search for
        int target = sc.nextInt();
        sc.close(); // Close the scanner to avoid resource leaks

        // Call the find_Index method and print the result
        System.out.println(find_Index(nums, target));
    }  
}
