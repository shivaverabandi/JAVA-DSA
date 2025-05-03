package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Math1_1_10 {
    public static boolean isPrime(int num){
        if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11){
            return true;
        }
        int factorCnt = 1;
        for(int i = 2; i*i<=num; i++){
            if(num % i == 0){
                factorCnt++;
            }
        }
        return factorCnt == 1;
    }
    public static int countPrimesTillN(int N){
        int count = 0;
        int i = 2;
        while(i <= N){
            boolean check = isPrime(i);
            if(check){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String []args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.println("Enter N value: ");
        int N = Integer.parseInt(br.readLine());
        int count = countPrimesTillN(N);
        System.out.println("Number of primes is: " + count);
    }
}
