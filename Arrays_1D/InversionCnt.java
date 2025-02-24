
package Arrays_1D;

import java.util.ArrayList;

public class InversionCnt {


    public static int merge(int []a, int l,int mid, int e){
        int cnt = 0;
        int i = l;
        int j = mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<=mid && j<=e) {
            if(a[i]<a[j]){
                list.add(a[i]);
                i++;
            }else{
                // here a[i]>a[j] we found pair
                list.add(a[j]);
                cnt += mid - i + 1; // no of inversion pairs
                j++;
            }
        }
        while(i<=mid){
            list.add(a[i]);
            i++;
        }
        while(j<=e){
            list.add(a[j]);
            j++;
        }
        // transfer list elments into original array which is a[]
        for(int k = l; k<=e; k++){
            a[k] = list.get(k-l);
        }
        return cnt;
    }

    public static int mergeSort(int []a, int l, int e){
        int cnt = 0;
        if(l>=e){ 
            return cnt;
        }
        
        int mid = l + (e-l)/2;
        cnt += mergeSort(a, l, mid);
        cnt += mergeSort(a, mid+1, e);
        cnt += merge(a,l,mid,e);
        return cnt;
    }
    public static int inversionCnt(int a[]){
        return mergeSort(a,0,a.length-1);
    }
    public static void main(String []args){
        int []a = {5,3,2,4,1};

        System.out.println(inversionCnt(a));
    }
}
