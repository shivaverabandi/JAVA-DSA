class Solution {

    private int[] mergeSort(int[] a, int start, int end){
        if(start >= end){
            return new int[]{a[start]};
        }
        int mid = start + (end - start)/2;
        int left[] = mergeSort(a,start, mid);
        int right[] = mergeSort(a,mid + 1, end);
        return merge(left,right);
    }

    private int[] merge(int left[], int right[]){
        int l = left.length;
        int r = right.length;
        int merge[] = new int[l + r];
        int i = 0; // index for left
        int j = 0; // index for right
        int k = 0; // index for merge
        
        // merge logic for sorted array
        while(i < l && j < r){
            if(left[i] < right[j]){
                merge[k]=left[i++];
            }else{
                merge[k]=right[j++];
            }
            k++;
        }

        while(i < l){
            merge[k++] = left[i++]; 
        }
        while(j < r){
            merge[k++] = right[j++];
        }

        return merge;
    }

    public int[] sortArray(int[] nums) {
       return mergeSort(nums,0,nums.length-1);
    }
}