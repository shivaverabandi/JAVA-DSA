//Find a specific substring within a string.

package Strings;

public class findSubStr {
    //Inbuilt
    public static boolean find(String str,String tar){
        int idx = str.indexOf(tar);
        return idx !=-1;
    }
    //Brute Force O(N*M)
    public static boolean find1(String str,String tar){
        int N = str.length();
        int M = tar.length();
        for(int i=0;i<=N-M;i++){
            int temp = i;
            int j = 0;
            for(;j<M;j++){
                if(str.charAt(temp)!=tar.charAt(j)){
                    break;
                }
                temp++;
            }
            if(j==M){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "shivansh";
        String tar = "vani";
        System.out.println(find(str,tar));
        System.out.println(find1(str,tar));

    }
}
