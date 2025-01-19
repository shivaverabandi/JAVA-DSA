package OOP_Concepts.Oop_6_lamda_Threds.ExceptionHandling;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        try{
            int c = divide(a,b);
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            in.close();
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Not divide by 0.");
        }
        return a/b;
    }
}

