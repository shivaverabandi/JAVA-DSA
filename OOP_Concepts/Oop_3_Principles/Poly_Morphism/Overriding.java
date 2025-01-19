package OOP_Concepts.Oop_3_Principles.Poly_Morphism;

// This program demonstrates Method Overriding in Java.
// Method Overriding allows a subclass (child class) to provide a specific implementation
// of a method that is already defined in its parent class.
// Key Points:
// 1. The method in the child class must have the same name, return type, and parameters as the method in the parent class.
// 2. Overriding is used to achieve runtime polymorphism.
// 3. The parent class reference can point to a child class object, and the overridden method
//    in the child class will be called dynamically at runtime.

// In this example:
// - The `Shapes` class is the parent class with an `area` method.
// - `Circle`, `Square`, and `Triangle` are child classes of `Shapes`.
// - Each child class overrides the `area` method to provide its specific implementation.

public class Overriding {
    public static void main(String[] args) {
        Shapes shapes = new Shapes(); // Parent class object
        shapes.area(); // Calls area() from Shapes

        Shapes cir = new Circle(); // Parent reference pointing to Circle object
        cir.area(); // Calls overridden area() from Circle

        Shapes square = new Square(); // Parent reference pointing to Square object
        square.area(); // Calls overridden area() from Square
        
        
        // Final keyWOrd usage demonstrates by below objects
        Circle obj = new Circle();
        obj.numDsiplay(3);
        Circle1 obj2 = new Circle1();
        obj2.numDsiplay(2);
        Circle1.staticMethod();
    }
}


