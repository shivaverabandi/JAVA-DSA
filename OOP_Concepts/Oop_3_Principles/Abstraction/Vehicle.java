/*
 * Abstraction in Java:
 * -------------------
 * Abstraction is a key concept in object-oriented programming (OOP) that helps to hide the complexity 
 * of the system by exposing only the essential features and hiding the internal details.
 * It allows the programmer to focus on "what" an object does rather than "how" it does it.
 *
 * In this code, we are demonstrating abstraction through the abstract class `Vehicle`.
 * 
 * 1. The `Vehicle` class serves as a blueprint for all vehicle types (e.g., cars, bikes) with common 
 *    behaviors like driving and music playing. 
 * 2. The methods `drive()`, `milage(int n)`, and `tyres(int n)` are **abstract**, which means that they 
 *    do not have implementations in this class. These methods must be implemented by any subclass of 
 *    `Vehicle`, ensuring that all vehicle types have these behaviors.
 * 
 * 3. The `PlayMusic()` method is a **concrete method** that provides a common implementation. 
 *    This method is inherited by all subclasses, and it can be overridden if needed to customize the 
 *    behavior for specific vehicle types.
 * 
 * **Why use Abstraction?**
 * -----------------------
 * - **Simplifies code**: It hides the implementation details and exposes only necessary functionalities.
 * - **Increases security**: Sensitive data or implementation details can be hidden from the user.
 * - **Encourages reusability**: Common behavior (like `PlayMusic()`) can be shared across different vehicle types.
 * - **Improves maintainability**: When we need to change how things are done (implementation), we only 
 *   need to change it in one place (in the subclasses).
 * 
 * In this class, subclasses like `RangeRover` or `gt_Continental` will provide specific implementations 
 * for the abstract methods.
 */

package OOP_Concepts.Oop_3_Principles.Abstraction;

public abstract class Vehicle {

 
    // Abstract method for driving functionality (to be implemented by subclasses)
    protected abstract void drive();
 
    // Abstract method to calculate mileage (to be implemented by subclasses)
    abstract float milage(int n);
 
    // Abstract method to return the number of tyres (to be implemented by subclasses)
    public abstract int tyres(int n);
 
    // Concrete method that can be shared by all vehicle types
    public void PlayMusic() {
        System.out.println("Music is in Every Vehicle");
    }
    static void method(){
        System.out.println("Hi i am static");
    }
    static {
    }

    static int a;
    
}
 
