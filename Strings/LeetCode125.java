// 125. Valid Palindrome
// Time Complexity O(N)
// Space Complexity O(1)
/*Due to immutability of Strings , java uses O(N) space to create new modified string */
package Strings;

public class LeetCode125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        for(int i = 0;i<s.length()/2;i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-i-1);
            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Race Car &*))@(@)";
        System.out.println(isPalindrome(str));
    }
}
