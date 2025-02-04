package Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {

    // Idea is to push the maximum element to last at every iteration of "i".
    public static void bubbleSort(int a[],int n){
        for(int i = 0; i<n-1; i++){
            boolean swap = true;
            for(int j = 0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = false;
                }
            }
            if(swap){ // Best Case --> If a[] is already sorted then it breaks here, so time complexity O(N) for best Case
                break;
            }
        }
    }
    public static void main(String []args){
        int a[] = {11,2,23,2,5};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));

    }
}
