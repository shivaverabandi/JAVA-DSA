package OOP_Concepts.Oop_5_Interfaces.abstractVsInterfaces;

interface A {
    // int a --> variables are by default  public final static
    int a = 3; // at the time of initialisation we have to declare value also.
    /*
    * Constructors are not allowed interfaces.
    * Contain static and default methods form java 8 version to provide backward compatability
    * Static methods are used to use methods with interface name which makes use of methods,
      after the loading of interface. Which makes to use methods after loading of interface.
    * static  methods in interfaces are public by default.
    * default methods are calling by using object. These are like non-static methods. Belongs to object.
    * */
    default  void nonStaticDefaultMethod(){
        System.out.println("Default method of Interface");
    }
    static void staticMethod(){
        System.out.println("Static method of Interface");
    }


    void abstractMethod1();
    void abstractMethod2();
}

class B implements A {

    @Override
    public void abstractMethod1() {
        System.out.println("Abstract method1 of A implemented by B");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Abstract method2 of A implemented by B");
    }
}
public class PureAbstraction {

    public static void main(String[] args) {
        B obj = new B();
        obj.abstractMethod1();
        obj.abstractMethod2();
        A.staticMethod();
        obj.abstractMethod1();
        System.out.println(A.a);
    }
}
