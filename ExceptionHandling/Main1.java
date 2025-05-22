package ExceptionHandling;

import java.nio.file.FileAlreadyExistsException;

class CustomException extends RuntimeException{

    public CustomException(String msg){
        super(msg);
    }
}

class AgeChecker{

    public void checkAge(int age) throws CustomException {
        try {

            if (age > 100) {
                throw new CustomException("Too Large");

            }
            System.out.println(2 / 1);
        }
        finally{
            System.out.println("Age is "+age);
        }
    }
}
public class Main1 {
    public static void main(String[] args){
        AgeChecker a = new AgeChecker();
        try{
            a.checkAge(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
