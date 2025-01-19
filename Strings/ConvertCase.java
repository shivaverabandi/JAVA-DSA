package Strings;

public class ConvertCase {
    static String convertCasetoUp(String str){
        String ans = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            ans = ans + (char)(ch-' ');
        }
        return ans;
    }
    static String convertCasetoLow(String str){
        String ans = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            ans = ans + (char)(ch+' ');
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "shivasai";
        System.out.println(convertCasetoUp(str));
        String str1 = "SHIVASAI";
        System.out.println(convertCasetoLow(str1));
    }
}
