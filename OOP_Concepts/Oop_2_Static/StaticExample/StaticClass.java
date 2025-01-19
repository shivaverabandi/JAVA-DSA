// Outer class cannot be static because it is meant to hold instance-specific data and behavior. 
// A static outer class would not have access to instance variables and methods, which limits its functionality.
// Therefore, the outer class must be non-static to allow creating instances and accessing instance members.

package OOP_Concepts.Oop_2_Static.StaticExample;

public class StaticClass {

    // Static inner class
    static class InnerStaticClass {
        String name; // Instance variable to store the name

        // Constructor to initialize the name variable
        InnerStaticClass(String name) {
            this.name = name; // Set the name to the passed argument
        }
    }

    public static void main(String[] args) {
        // Creating instances of the static inner class with different names
        InnerStaticClass obj1 = new InnerStaticClass("Shiva");  // obj1 initialized with name "Shiva"
        InnerStaticClass obj2 = new InnerStaticClass("Kunal");  // obj2 initialized with name "Kunal"

        // Printing the name from both objects
        System.out.println(obj1.name);  // Output: Shiva
        System.out.println(obj2.name);  // Output: Kunal
    }
}

