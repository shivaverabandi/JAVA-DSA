package Recrsion_1;
public class Gcd {
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 16;
        System.out.println(gcd(a,b));
    }
}