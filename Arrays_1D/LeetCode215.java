package Arrays_1D;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Kth Largest Element.
 * 
*/
public class LeetCode215 {
    //1. sort the array
    //2. return n-kth element.
    public int findKthLargest1(int[] nums, int k) { // Brute Force --> O(N*LogN)
        Arrays.sort(nums);
        return nums[nums.length-k];
    }


    /**
 * Algorithm to find the k-th largest element in an array using a min-heap:
 *
 * 1. Create an empty min-heap (PriorityQueue) that will store at most k elements.
 * 2. Iterate through each element in the input array:
 *    - Add the element to the min-heap.
 *    - If the size of the min-heap exceeds k, remove the smallest element.
 *      This ensures that the heap always contains the k largest elements encountered so far.
 * 3. After processing all elements, the root of the min-heap (the smallest element in the heap)
 *    will be the k-th largest element in the array.
 *
 * Why a min-heap?
 * - The min-heap efficiently keeps track of the k largest elements with O(log k) insertion and removal.
 * - When the heap size exceeds k, removing the smallest element (root) is fast and ensures only the largest k elements remain.
 * - The k-th largest element is then the smallest among these k elements.
 *
 * Time Complexity: O(n log k), where n is the number of elements in the array.
 * Space Complexity: O(k)
 */
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    } 
}
