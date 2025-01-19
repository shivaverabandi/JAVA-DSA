

//Generate all possible substrings of a string
package Strings;
import java.util.Arrays;
public class GenerateAllSubStrings {
    //Time O(N^2)
    //space O(N^2)
    private static String[] generateAll(String str){
        
        int N = str.length();
        //No of Possible strings 
        int noOfStr = N*(N+1)/2 +1;
        String[] list = new String[noOfStr];
        list[0] = new String("empty");
        int idx = 1;
        for(int i = 0; i<str.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j<str.length(); j++){
                sb.append(str.charAt(j));
                String temp = sb.toString();
                list[idx++] = temp;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "shiva";
        System.out.println(Arrays.toString(generateAll(str)));
    }
}
