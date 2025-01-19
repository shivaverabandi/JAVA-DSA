
/* Print ASCII value of each character in a string. */
package Strings;
import java.util.*;
public class PrintAsciiVal{

    static  void Print(String str){
        for(int i = 0; i<str.length(); i++){
            int  ascii = str.charAt(i);
            System.out.print(ascii +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Print(str);
        sc.close();
    }
}