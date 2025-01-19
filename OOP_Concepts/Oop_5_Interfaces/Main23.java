/*
 * Concept: Static Interfaces, Nested Static Interfaces, and Static Methods
 * ------------------------------------------------------------------------
 * 1. **Static Interface**:
 *    - By default, all fields in an interface are `public static final`.
 *    - Methods inside an interface can be declared as `static` starting from Java 8.
 *    - Static methods in an interface can only be accessed using the interface name (not through objects).
 *
 * 2. **Nested Static Interfaces**:
 *    - An interface can contain another static interface as a member.
 *    - The nested static interface acts independently and can be implemented like a top-level interface.
 *
 * 3. **Implementation**:
 *    - Class `A` implements both `StaticInterface` and its nested static interface `InnerStaicInterFace`.
 *    - The static method `greeting()` from `StaticInterface` is invoked using the interface name.
 * 
 * **Code Workflow**:
 * - Static fields (`a`) and methods (`greeting`) are utilized in the `StaticInterface`.
 * - The nested static interface `InnerStaicInterFace` declares an abstract method `greet1()`.
 * - Class `A` implements both the outer interface (`StaticInterface`) and the nested static interface (`InnerStaicInterFace`).
 * - In the `main` method, an object of class `A` is created, and the methods `greet1()` and `greet()` are invoked.
 */


package OOP_Concepts.Oop_5_Interfaces;
 // Static interface with fields, methods, and a nested static interface
interface StaticInterface {
     // Static field (implicitly public, static, and final)
    static int a = 2;
 
     // Static method that can be invoked without an object
    static void greeting() {
        if (true) { // Example condition (always true in this case)
            System.out.println(a * a); // Prints the square of the static field 'a'
        }
    }
 
     // Nested static interface
    static interface InnerStaicInterFace {
        void greet1(); // Abstract method to be implemented by a class
    }
 
    void greet(); // Abstract method to be implemented by a class
}
 
 // Class implementing both the outer interface and the nested static interface
class A implements StaticInterface.InnerStaicInterFace, StaticInterface {
    @Override
    public void greet1() {
        System.out.println("I AM INNER METHOD");
    }
 
    @Override
    public void greet() {
        System.out.println("I am outer method");
        StaticInterface.greeting(); // Calling the static method of the interface
    }
}
 
 // Main class to execute the program
class Main23 {
    public static void main(String[] args) {
        // Create an object of class A
        A ob = new A();

        // Call the method implemented from the nested static interface
        ob.greet1();
        
        // Call the method implemented from the outer interface
        ob.greet();
    }
}
 
 