package Recrsion_1;

public class Largest {
    public static int find_largest(int arr[],int n,int idx,int lar){
        if(idx==n){
            return lar;
        }
        if(arr[idx]>lar){
            lar = find_largest(arr, n, idx+1, arr[idx]);
        }
        return lar;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,2,42,3,4,34};
        int n = arr.length;
        System.out.println(find_largest(arr,n,0,Integer.MIN_VALUE));
    }
}
