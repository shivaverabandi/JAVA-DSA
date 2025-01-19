/*
 * Abstraction in Java:
 * --------------------
 * Abstraction is the process of hiding the implementation details 
 * and exposing only the essential features of an object. It focuses 
 * on "what" an object does rather than "how" it does it.
 * 
 * In this example:
 * ----------------
 * 1. The `Vehicle` abstract class defines a common blueprint for all types of vehicles.
 *    - It contains both abstract methods (without implementation) and a concrete method (`PlayMusic`).
 *    - Abstract methods (`drive`, `milage`, `tyres`) must be implemented by any subclass.
 * 
 * 2. Subclasses like `RangeRover` and `gt_Continental` provide specific implementations for the abstract methods.
 * 
 * 3. Benefits of Abstraction:
 *    - Provides a clear structure for different types of vehicles.
 *    - Promotes code reusability through common methods (`PlayMusic`).
 *    - Makes it easier to maintain and extend code by separating "what" from "how".
 * 
 * Example Use Case:
 * -----------------
 * In the `Main` class, we use the `Vehicle` reference type to handle different 
 * subclasses (`RangeRover`, `gt_Continental`). This demonstrates abstraction 
 * as the specific implementation details of each vehicle type are hidden.
 */

package OOP_Concepts.Oop_3_Principles.Abstraction;

public class Main {
    public static void main(String[] args) {
 
        // Car --> For Range Rover
        Vehicle car = new RangeRover();
        car.PlayMusic();
        car.drive();
        System.out.println(car.milage(20));
        System.out.println(car.tyres(4));
 
        // Bike --> For GT Continental
        Vehicle bike = new gt_Continental();
        bike.PlayMusic();
        bike.drive();
        System.out.println(bike.milage(35));
        System.out.println(bike.tyres(2));
        Vehicle.method();

    }
}
 