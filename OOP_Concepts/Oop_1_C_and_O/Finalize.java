/**
 * Theory: finalize() and Garbage Collector in Java
 *
 * - The `finalize()` method is a special method in Java that the garbage collector calls 
 *   before destroying an object. It is used to perform cleanup operations, such as 
 *   releasing resources or closing file handles.
 *
 * - Key Points:
 *   1. The `finalize()` method is defined in the `Object` class and can be overridden.
 *   2. It is invoked when the garbage collector determines that there are no more references to the object.
 *   3. The garbage collector's execution and the invocation of `finalize()` are non-deterministic, 
 *      meaning you cannot predict exactly when (or if) it will be executed.
 *   4. Starting with Java 9, `finalize()` has been deprecated due to performance issues 
 *      and the availability of better alternatives like `try-with-resources` and `AutoCloseable`.
 * 
 * - Best Practices:
 *   - Avoid using `finalize()` in new code.
 *   - Use proper resource management techniques, such as explicit resource cleanup 
 *     or using `try-with-resources` for deterministic finalization.
 *
 * - Example: This code demonstrates the usage of `finalize()` to observe object creation 
 *   and destruction during garbage collection. Note that the behavior of garbage collection 
 *   and `finalize()` execution is JVM-dependent.
 */
package OOP_Concepts.Oop_1_C_and_O;
 public class Finalize {

    // Constructor: Prints a message when an object is created
    Finalize() {
        System.out.println("Object is Created");
    }

    // Suppressing warnings as finalize() is deprecated in modern Java versions
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        // Prints a message when the object is destroyed by the garbage collector
        System.out.println("Object is Destroyed");
        // Ensures the finalize() method in the superclass is also called
        super.finalize();
        
        
    }

    public static void main(String[] args) {
        // Creating an instance of the Finalize class
        Finalize object = new Finalize();

        // Loop to create many objects, making previous objects eligible for garbage collection
        for (int i = 0; i < 1000000; i++) {
            object = new Finalize(); // Reassigning 'object' to a new instance
        }

        // Printing the last object reference (final assigned object)
        System.out.println(object);

        // Note: Garbage collection is non-deterministic; finalize() may or may not execute during the program run.
    }
}
