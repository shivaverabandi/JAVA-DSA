package Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {

/* 
 * Algorithm: Selection Sort
 * 
 * Steps:
 * 1. Iterate through the array from index 0 to n-2 (outer loop).
 * 2. For each position i:
 *    a. Assume the minimum element is at index i (minIdx = i).
 *    b. Compare with elements from i+1 to n-1 (inner loop).
 *    c. If any element a[j] < a[minIdx], update minIdx to j.
 * 3. After finding the minimum element in the unsorted subarray (i to n-1),
 *    swap it with the element at position i.
 * 
 * Key Characteristics:
 * - Time Complexity: O(n²) (average and worst case)
 * - In-place sorting (no extra memory required)
 * - Unstable sort (does not preserve order of equal elements)
 */
public static void selectionSort(int a[], int n) {
    for(int i = 0; i < n-1; i++) {
        int minIdx = i;
        for(int j = i+1; j < n; j++) {
            if(a[minIdx] > a[j]) {
                minIdx = j;
            }
        }
        int temp = a[minIdx];
        a[minIdx] = a[i];
        a[i] = temp;
    }
}
    public static void main(String[] args) {
         int a[] = {1,23,3,14,0};
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
