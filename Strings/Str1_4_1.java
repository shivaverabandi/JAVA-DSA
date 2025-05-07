package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Str1_4_1 {
    public static String reverseString(String str) {
        StringBuilder rev  =new StringBuilder();
        int len = str.length();
        int idx = len-1;
        while(idx >= 0) {
            rev.append(str.charAt(idx--));
        }
        return rev.toString();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String input = br.readLine();
        System.out.println(input);
        String output = reverseString(input);
        System.out.println(output);
    }
}
