package Math;

public class FindNcR {
    private static int findNcR(int n, int r){ // pascal triangle variation (base logic of pascal's triangle)
        if(n == 0){
            return 1;
        }else if(n==r){  // Time complexity O(r)
            return 1;
        }

        long ans = 1;
        for(int i = 0; i<r; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return (int)ans;

    }
    public static void main(String[] args) {
        int N = 4;
        int R = 2;
        System.out.println(findNcR(N,R)); 
    
        
    }
}
