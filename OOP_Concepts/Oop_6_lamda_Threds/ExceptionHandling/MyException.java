package OOP_Concepts.Oop_6_lamda_Threds.ExceptionHandling;

import java.util.Scanner;

public class MyException extends Exception {  
   public MyException(){
        super();
   }
   public MyException(String s){
        super(s);
   }
   static int method(int a , int b) throws MyException{
    if(b ==0){
        throw new MyException("Dont try to divide with Zero");
    }
    return a/b;
   }
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        try{
            int c = method(a, b);
            System.out.println("Division is:"+ c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            in.close();
        }
   }
}
