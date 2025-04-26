package OOP_Concepts.Oop_1_C_and_O;

public class ConsChaining {
    int i;
    double d;
    String name;
    ConsChaining(int i){
        //System.out.println(this); //--> If you uncomment & try this it gives you error.
        this (i,45.3);
        System.out.println(this); // why did not get error?
    }
    ConsChaining(int i, double d){
       // super();
        this(i,d,"shiva");
        //System.out.println(this); //--> If you uncomment & try this it gives you error... Ask yourself Why?
        this.i = i;
        this.d = d;
    }
    ConsChaining(int i , double d, String name){
        System.out.println(this); // Here not error why?.. Because the object created first here.
        this.i = i;
        this.d = d;
        this.name = name;
    }
    public static void main(String[] args) {
        ConsChaining obj1 = new ConsChaining(8);
        System.out.println(obj1.i);
        System.out.println(obj1.d);
        System.out.println(obj1.name);
    }
}
