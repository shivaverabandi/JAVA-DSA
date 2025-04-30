package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math1_1_1 {

    public static int findNumberOfDigits(int num) {
        int cnt = 0;
        while(num > 0) {
            num = num / 10;
            cnt++;
        }
        return cnt;
    }

    public static int findNumberOfDigits2(int num) {
        // Optimized approach using logarithm
        // Note: Doesn't work for num = 0 (would return -Infinity)
        if(num == 0) return 1;
        return (int) Math.log10(num) + 1;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inr);

        int num = Integer.parseInt(br.readLine());

        System.out.println(findNumberOfDigits(num));  // Time complexity: O(number of digits) = O(log₁₀ num)

        System.out.println(findNumberOfDigits2(num)); // Time complexity: O(1) but with floating-point operations
    }
}
