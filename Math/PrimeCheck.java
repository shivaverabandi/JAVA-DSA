package Math;

public class PrimeCheck {
    public static void main(String[] args) {
        int n =1000099999;
        int cnt = 0;
        boolean ans = true;
        for(int i = 1; i*i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt >2) {
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is Not a Prime");
        }
    }
}
