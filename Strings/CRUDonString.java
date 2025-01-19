
//Insert a character at the first, last, and Kth position in a string.
//Remove the first, last, and Kth character from a string.
package Strings;

public class CRUDonString {
    public static String insert(String str,int k){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, 'V');
        
        sb.insert(sb.length(),'A');
        sb.insert(k, 'A');
        return str=sb.toString();
    }
    public static String delete(String str, int k){
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 1);

        
        sb.deleteCharAt(k);
        sb.delete(sb.length()-1,sb.length());
        return str = sb.toString();
    }
    public static void main(String[] args) {
        String str = "shiva";
        System.out.println(insert(str,3));
        System.out.println(delete(str, 3));
    }
}
