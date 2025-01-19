
//Count the number of words in a string.
package Strings;
public class NumOfWords {
    public static int Count(String str){
        String s[] = str.split(" ");
        return s.length;
    }
    public static void main(String[] args) {
        String str = "shiva sai ansh s ";
        System.out.println(Count(str));
    }
}
