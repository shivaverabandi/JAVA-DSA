package Recrsion_1;

public class Print1_to_N {

    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
