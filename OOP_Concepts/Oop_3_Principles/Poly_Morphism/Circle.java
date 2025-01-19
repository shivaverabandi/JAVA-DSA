package OOP_Concepts.Oop_3_Principles.Poly_Morphism;

public class Circle extends Shapes{
    @Override // Annotation
    //Early Binding
    final void area(){
        System.out.println("Area of Circle");
    }
    // Late Binding
    void numDsiplay( final int num){
        System.out.println(num);
    }
    static void staticMethod(){
        System.out.println("STATIC of Circle");
    }
}

class Circle1 extends Circle{
   /* void area(){
        System.out.println("Not override");
    }
    */

    void numDsiplay(final int num){
        //num = 3;
        System.out.println(num*2);
    }
   // @Override
    static void staticMethod(){
        System.out.println("static of Circle1");
    }
}