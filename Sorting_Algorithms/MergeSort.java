package Sorting_Algorithms;

import java.util.Arrays;

public class MergeSort {

    // Main method to test the merge sort implementation
    public static void main(String args[]) {
        int arr[] = {3, 1, 0, -9, 3, 7, 1};
        // Call mergeSort on the entire array and print the sorted result
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    // Recursive method to perform merge sort on a subarray from index 'start' to 'end'
    public static int[] mergeSort(int arr[], int start, int end) {
        // Base case: if the subarray has one element or is empty, return it as a single-element array
        if (start >= end) {
            return new int[]{arr[start]};
        }

        // Calculate the middle index to divide the array into two halves
        int mid = (start + end) / 2;

        // Recursively sort the left half (from start to mid)
        int left[] = mergeSort(arr, start, mid);
        // Recursively sort the right half (from mid+1 to end)
        int right[] = mergeSort(arr, mid + 1, end);

        // Merge the two sorted halves and return the result
        return merge(left, right);
    }

    // Helper method to merge two sorted arrays into one sorted array
    private static int[] merge(int left[], int right[]) {
        // Create a new array to hold the merged result
        int ans[] = new int[left.length + right.length];
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the merged array

        // Merge elements from left and right arrays into ans in sorted order
        while (i < left.length && j < right.length) {
            // Compare current elements of left and right
            // Add the smaller element to the merged array
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements from the left array (if any)
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        // Add any remaining elements from the right array (if any)
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        // Return the merged sorted array
        return ans;
    }
}