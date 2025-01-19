package Patterns;

public class Diamond {
    public static void printDiamond(int n){
        int j;
        for(int i=1; i<=n; i++){
            j = 1;
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            j = 1;
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printDiamond(n);
    }
}
