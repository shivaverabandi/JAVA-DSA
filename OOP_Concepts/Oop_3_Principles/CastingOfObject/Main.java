package OOP_Concepts.Oop_3_Principles.CastingOfObject;

 public class Main {

    public static void main(String[] args) {
        //Override happen here
        Father upCast = new Son();
        System.out.println(upCast);
        upCast.display1();
        //upCast.display2(); even though its Object is type of son, 
        //cant use because the reference type decide what to choose
        upCast.display();
        //Inherited by Son
        Son inherit = new Son();
        System.out.println(inherit);
        inherit.display1();

        Son obj = new Son(21,34);
        System.out.println(obj);

        Father obj2  = new Son(obj);
        System.out.println(obj2.age);
    }
}