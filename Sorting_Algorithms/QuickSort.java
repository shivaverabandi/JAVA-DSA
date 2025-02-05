/*
 * why Quick sort?
 * -> It gives O(N*logN) time complexity at average case by using constant space.
 * ->it is unstable sorting(drawback)
 */

/*         Algorithm
 * 1. chose any pivot element -> mid or first or last or median
 * 2. place it in it's correct positon. (partition)
 * 3. recursively apply above two steps for pivot's left part and right part.
 * Note : Take pivot as middle element is best for most of the cases.
 */
/*
 * Time complexity : O(n^2) -> worst case
 *                   O(n*logn) -> Average case
 * Space Complexity : O(1). exlcude recursive stack space which is O(logN)
 */
package Sorting_Algorithms;
import java.util.*;
public class QuickSort {
    public static void quickSort(int a[],int low, int high){
        if(low < high){
            int pivotIdx = partition(a,low,high);
            quickSort(a, low,pivotIdx-1); // left part after placing pivot at it's correct position.
            quickSort(a, pivotIdx+1, high); // right part after placing pivot at it's correct position.
        }
    }

    private static int partition(int a[],int low, int high){
        int start_Idx = low;
        int end_Idx = high;
        int mid = (start_Idx + end_Idx)/2; // Here you can take any element as pivot. In this code, mid is taken as pivot.
        int pivotIdx = mid; // Mid is the pivot index.
        int pivot = a[mid];
        while(start_Idx < end_Idx){
            while ( start_Idx< high && a[start_Idx]<=pivot) { // see these cases carefully, these are the building blocks of this algo.
                start_Idx++;
            }
            while (end_Idx > low && a[end_Idx]>pivot){
                end_Idx--;
            }
            if(start_Idx < end_Idx){ // swap
                int temp = a[start_Idx];
                a[start_Idx] = a[end_Idx];
                a[end_Idx] = temp;
                start_Idx++;
                end_Idx--;
            }
        }
        // place pivot at it's position. so swap a[pivotIdx] with a[end_idx]
        int temp = a[end_Idx];
        a[end_Idx] = pivot; 
        a[pivotIdx] = temp;
        /*
         * 1.swap the endIdx why? beacuse we check a[startIdx] <= pivot. So lesser than equal elements go left side.
         * 2. if we use a[end_idx]>=pivot. Then return startIdx, beacuse greater than equal elements go right side.
         */
        return end_Idx; // return pivot postion.
    }

    public static void main(String[] args) {
        int a[] = {2,-1,0,-3,8,2,5,-3,9,-10,-4,2,4,2,1};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
