
/* Count letters, numbers, and special characters in a string. */
package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CntLSD {

    static int[] Count(String str){
        int []cnt = new int[3];
        for(int i= 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                cnt[0]++;
            }else if(ch>='0'&& ch<='9'){
                cnt[1]++;
            }else{
                cnt[2]++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(Arrays.toString(Count(str)));
    }
}
