package Sorting_Algorithms;

import java.util.Arrays;

/**
 * Algorithm: Insertion Sort
 * 
 * Steps:
 * 1. Iterate through the array from index 1 to n-1 (outer loop).
 * 2. For each element at index i:
 *    a. Compare it with previous elements (inner loop) by moving backward from i.
 *    b. If the current element is smaller than its predecessor, swap them.
 *    c. Repeat until the element is in its correct sorted position (left side).
 * 
 * Key Characteristics:
 * - Time Complexity: O(n²) (average/worst case), O(n) (best case for nearly sorted input)
 * - In-place sorting (no extra memory required)
 * - Stable sort (preserves order of equal elements)
 * - Efficient for small datasets or partially sorted data
 */
public class InsertionSort {
    public static void insertionSort(int a[], int n) {
        for(int i = 1; i < n; i++) {
            int j = i;
            // Shift element left until it finds its sorted position
            while(j > 0 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 23, 3, 14, 0};
        insertionSort(a, a.length);
        System.out.println(Arrays.toString(a)); // Output: [0, 1, 3, 14, 23]
    }
}