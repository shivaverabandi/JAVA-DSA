/*
 * Algorithm:
Input the Array:

Take the size of the array n as input.
Read n integers into the array nums.

Initialize Storage and Tracking Variables:
    Use an array ans to store all subarray sums.
    The size of ans will be n * (n + 1) / 2, as this is the total number of subarrays.
    Use two variables:
    max to store the maximum sum.
    min to store the minimum sum.
Iterate Through All Subarrays:

Use three loops:
    Outer loop (i): Fix the starting index of the subarray.
    Middle loop (j): Fix the ending index of the subarray (must be greater than or equal to i).
    Inner loop (k): Traverse the subarray from index i to j to calculate the sum.

Calculate Sum of Each Subarray:
    For each subarray defined by start index i and end index j:
    Initialize a variable sum = 0.
    Use the inner loop to add all elements from i to j to sum.
    Store and Update:

    Store the current sum in the ans array.
    Update max if sum is greater than max.
    Update min if sum is smaller than min.

Print Results:
    Print the maximum subarray sum (max).
    Print the minimum subarray sum (min).
    Print all subarray sums stored in the ans array.


    Time Complexity is O(N^3)
    Space Complexity is O(N*(N+1)/2)
 */


package Arrays_1D;
import java.util.*;
public class sub_Ar_Sum {
    private static int[]  sub_Ar_SumFind(int nums[]){
        int n = nums.length;
        int ans[] = new int[n*(n+1)/2];
        int idx = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += nums[k];
                }
                ans[idx++] = sum;
                max = Math.max(sum,max);
                min = Math.min(sum,min);
            }       
        }
        System.out.println("max of All is:"+max);
        System.out.println("min of All is"+min);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        while(--size >=0 ){
            nums[size] = sc.nextInt(); 
        }
        sc.close();
        System.out.println(Arrays.toString(sub_Ar_SumFind(nums)));
    }
}
