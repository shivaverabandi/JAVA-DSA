package OOP_Concepts.Oop_5_Interfaces.abstractVsInterfaces;


abstract  class Demo1{
    private int num;
    public Demo1(int num){ // constructor is allowed in Abstract classes.
        this.num = num;     // In interfaces constructors are not allowed
    }
    public void nonStaticMethod(){
        System.out.println("Non Static Method");
    }
    public abstract void abstractMethod();
}
class Demo2 extends Demo1{

    /* 1. The class which is extending the abstract class should pass the
          value for the Abstract class constructor by using super().
       2. we can't create object directly for abstract classes. By using inner classes we can.
       3.
    */
    public Demo2(int num){
        super(num);
    }
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method implemented by Demo2");
    }
}
public class PartialAbstract {
    public static void main(String[] args) {

    }
}
