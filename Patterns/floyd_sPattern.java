package Patterns;
import java.util.*;
public class floyd_sPattern {

    public static void printFloyd(int n){
        int k = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printFloyd(n);
    }
}
