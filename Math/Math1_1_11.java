package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math1_1_11 {
    public static int findGcd1(int a, int b){ // Time Complexity --> O(min(a,b))
        int gcd = 1;
        int i = Math.min(a,b);
        while(i > 1){
            if( ( a%i == 0 ) && ( b%i == 0 ) ){
                gcd = i;
                return gcd;
            }
            i--;
        }
        return gcd;
    }

    // Euclidean Algorithm --> O(log(min(a,b)))
    public static int findGcd2(int a, int b){

        while(a > 0){
            int rem = b % a; // Not necessary to swap. If bigger is 'a' then for first iteration here swapping will happen.
            b = a;
            a = rem;
        }
        return b;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(br.readLine());

        int ans1 = findGcd1(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + ans1);

        int ans2 = findGcd2(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + ans2);
    }
}
