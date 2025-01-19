package Strings;
//Check if a string contains all letters from 'a' to 'z'.
public class panagram {
    public static boolean isPanagram(String str){
        int hash[] = new int[26];
        for(int i = 0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        for(int i : hash){
            if(i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcdefghijklmnrstuvwxyz";
        System.out.println(isPanagram(str));
    }
}
