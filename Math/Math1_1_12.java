package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math1_1_12 {

    public static int findLcm1(int a, int b) { // Time complexity --> O(Max(a,b))
        int i = Math.max(a,b);
        while(i > 1){
            if(i % a == 0 && i % b == 0){
                return i;
            }
            i++;
        }
        return a * b;
    }

    // Optimised time complexity.
    public static int euclidean(int a, int b) {

        while(a > 0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        return b;
    }
    public static int findLcm2(int a, int b) {
        int gcd = euclidean(a,b); // Time Complexity --> O(log(Max(a,b)))
        return (a * b ) / gcd ;
    }
    public static void main(String []args){
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        Integer a = null;
        Integer b = null;
        try {
            System.out.println("Enter the first number: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number: ");
            b = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally {
            try{
                inp.close();
                br.close();
            }
            catch(Exception e){
                System.out.println("Error");
            }

        }

        if(a != null && b != null){
            int lcm1 = findLcm1(a,b);
            System.out.println("The lcm of " + a + " and " + b + " is " + lcm1);
            int lcm2 = findLcm2(a,b);
            System.out.println("The lcm of " + a + " and " + b + " is " + lcm2);
        }
    }
}
