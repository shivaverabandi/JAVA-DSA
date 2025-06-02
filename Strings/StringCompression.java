package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            int cnt = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                cnt++;
                i++;
            }
            sb.append(str.charAt(i));
            if(cnt > 1){
                sb.append(cnt);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(compress(str));
    }
}
