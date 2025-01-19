
// Find the difference between the number of consonants and vowels.
package Strings;
public class Diff {
    public static int DifBetweenCOn_Vow(String str){
        int vow=0,con=0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }else{
                con++;
            }
        }
        return con-vow;
    }
    public static void main(String[] args) {
        String str = "aeioufzsstgh";
        System.out.println(DifBetweenCOn_Vow(str));
    }
}
