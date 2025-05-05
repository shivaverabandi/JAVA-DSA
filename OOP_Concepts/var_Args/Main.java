package OOP_Concepts.var_Args;

public class Main{

    static void variable_Args(int fixed, int...var_Args){
        System.out.println("Fixed one:"+fixed);
        for(int n : var_Args){
            System.out.println("Internally these are stored as Array:"+n);
        }
    }
    public static void main(String[] args) {

        variable_Args(9, 2,4,5,3535,34,34,343,43,43,4);
    }
}