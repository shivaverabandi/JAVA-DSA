package Math;

import java.util.Scanner;

public class GCD {

    static int findGcd(int a, int b){
        for(int i = Math.min(a,b); i>=2; i--){
            if( a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    static int findGCDOptimised(int a, int b){ // eucledian algorithm

        if(a > b){
            int temp = a;
            a = Math.min(a, b);
            b = temp;
        }

        while(a>0){
            int temp = b%a;
            b = a;
            a = temp;
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        System.out.println(findGcd(a,b));
        System.out.println("==========================================================");
        System.out.println(findGCDOptimised(a, b));
    }
}
