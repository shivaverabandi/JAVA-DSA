
//Find the first and last index of occurrence for each character in a string.
package Strings;

import java.util.Arrays;

public class First_LastIdx {
    private static void printFirstLastIdx(String str){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(Arrays.toString(find(str,ch)));
        }
    }
    private static int[] find(String str, char ch){
        int ans[] = new int[2];
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==ch){
                ans[0] = i;
                break;
            }
        }
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)==ch){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "shiscassai";
        printFirstLastIdx(str);
    }
}
