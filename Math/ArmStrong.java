package Math;

public class ArmStrong {

    public static void main(String[] args) {
        int n = 103;
        int copy = n;
        int num = 0;
        while(n > 0){
            int last = n % 10;
            n = n/10;
            num += Math.pow(last,3);
        }

        if(num == copy){
            System.out.println(copy + " Arm Strong");
        }else{
            System.out.println(copy +" Not an Arm Strong");
        }
    }   
}
