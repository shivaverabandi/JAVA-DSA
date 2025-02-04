package Sorting_Algorithms;
import java.util.Arrays;
public class MergeSort {
    public static int[] mergeSort(int arr[],int start, int end){
        if(start >= end){
            return new int[]{arr[start]};
        }
        int mid = (start + end)/2;
        int left[] = mergeSort(arr, start, mid);
        int right[] = mergeSort(arr, mid+1, end);
        return merge(left,right);
    }
    private static int[] merge(int left[], int right[]){
        int ans[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {3,1,0,-9,3,7,1};
        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    }
}
