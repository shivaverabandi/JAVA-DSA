package Recrsion_1;

public class fibonocci {

    private static void  printFibo(int N,int a, int b,int cnt){
        if(N==cnt){
            return;
        }
        System.out.print(a+" ");
        printFibo(N, b, a+b, cnt+1);
    }
    public static void main(String[] args) {
        int N = 5;
        printFibo(N,0,1,0);
    }
}
