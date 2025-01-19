
//Remove leading, trailing, and extra spaces in a string.
package Strings;
public class RemoveSpaces {

    private static String remove(String str){
        str = str.trim();
        return str = str.replaceAll("\\s","");

    }
    public static void main(String[] args) {
        String str = "  shiva     sai V  ";
        System.out.println(remove(str));
    }
}