package Recrsion_1;

public class CountDigits {
    public static int count(int N){
        if(N==0){
            return 0;
        }
        return count(N/10) + 1; // if require sum of digits then replace 1 with N % 10
    }
    public static void main(String[] args) {
        int N = 19908;
        System.out.println(count(N));
    }
}
