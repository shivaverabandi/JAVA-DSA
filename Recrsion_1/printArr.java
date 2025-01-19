package Recrsion_1;

public class printArr {
    private static void printNum(int arr[], int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printNum(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,44,34,23,232,32,323,2,32,32,323};
        printNum(arr,0);
    }    
}
