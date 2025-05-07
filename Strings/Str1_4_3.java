package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Str1_4_3 {
    public static Integer findLargestOdd(String s) {
        int len = s.length();
        int ans = 0;
        int idx = 0;
        while (idx < len) {
            Character c = s.charAt(idx);
            int odd = Integer.parseInt(c.toString());
            if(odd % 2 != 0){
                ans = Math.max(ans, odd);
            }
            idx++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String s = br.readLine();
        int ans = findLargestOdd(s);
        System.out.println("Largest Odd number : " + ans);
    }
}
