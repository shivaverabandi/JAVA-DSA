package Recrsion_1;
import java.util.*;
public class factorial {

    public static int fact(int N){
        if(N==1){
            return 1;
        }
        return fact(N-1) * N;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        System.out.println(fact(N));
    }
}
