package OOP_Concepts.Oop_5_Interfaces;

/*
 * Interfaces vs Abstract Classes
 * 
 * 1. **Definition**:
 *    - Interfaces: A contract that specifies methods a class must implement. By default, methods in an interface are abstract and public.
 *    - Abstract Classes: Classes that can have both abstract methods (without implementation) and concrete methods (with implementation).
 * 
 * 2. **Multiple Inheritance**:
 *    - Interfaces: A class can implement multiple interfaces, allowing multiple inheritance.
 *    - Abstract Classes: A class can extend only one abstract class, as Java doesn't support multiple inheritance with classes.
 * 
 * 3. **State Management**:
 *    - Interfaces: Cannot have instance variables (except constants - static and final variables).
 *    - Abstract Classes: Can have instance variables, allowing state management within the class.
 * 
 * 4. **Default and Static Methods**:
 *    - Interfaces: Can have default methods (with implementation) and static methods.
 *    - Abstract Classes: Can have concrete methods but no default methods.
 * 
 * 5. **Constructor**:
 *    - Interfaces: Cannot have constructors.
 *    - Abstract Classes: Can have constructors to initialize fields.
 * 
 * 6. **Use Cases**:
 *    - Use Interfaces: When you need to define a contract that multiple unrelated classes can implement (e.g., `Comparable`, `Runnable`).
 *    - Use Abstract Classes: When you need a base class with shared code and behavior, along with some abstract methods for subclass-specific implementation (e.g., `Animal` -> `Dog`, `Cat`).
 * 
 * Example:
 * - Interface: `Airways` defines a contract for any air transportation (e.g., airplane, helicopter).
 * - Abstract Class: `Parent` defines common behavior for subclasses like `Son` or `Daughter`.
 */

public class Main {
    
    public static void main(String[] args) {
        
       /* Parent son = new Son(21,41); These are Abstract class related
        son.career("SDE");
        son.partner("Jenny", 21);
        son.urFather(); */

        Airways plane1 = new AirPlane();
        System.out.println(plane1.tyres(7));

        PlatForm obj = new AirPlane();
        obj.drive();

        AirPlane obj2 = new AirPlane();
        obj2.check();
    }
}

