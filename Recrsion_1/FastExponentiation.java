// leet code Problem 50,236
package Recrsion_1;
import java.util.*;
public class FastExponentiation {
    public static int iterativePow(int x, int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans *= x;
        }
        return ans;
    }
    public static int recursivePow(int x,int n){
        if(n==0){
            return 1;
        }
        return x * recursivePow(x, n-1);
    }
    public static int fastExp(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n%2==0){
            int half = fastExp(x,n/2);
            return half*half;
        }else{
            return x*fastExp(x,n-1);
        }
    }
    public static int iterativeFastExp(int x, int n){
        int ans = 1;
        while(n>0){
            if(n%2==0){
                x = x*x;
                n = n/2;
            }else{
                ans *= x;
                n = n-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        in.close();
        System.out.println(iterativePow(x,n));
        System.out.println(recursivePow(x, n));
        System.out.println(fastExp(x, n));
        System.out.println(iterativeFastExp(x, n));
    }
}
