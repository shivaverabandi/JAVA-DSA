/*
 * Concept: Nested Interfaces and Classes in Java
 * -----------------------------------------------
 * 1. **Nested Interface**: An interface defined inside a class or interface is called a nested interface. 
 *    - If the nested interface is marked `private`, it can only be accessed within the enclosing class.
 * 2. **Inner Class**: A class defined inside another class is called an inner class. 
 *    - If the inner class implements a private nested interface, it allows encapsulated implementation.
 * 3. **Static Block**: A static block is executed when the class is loaded into memory, before any object is created.
 * 
 * **Code Workflow**:
 * - A private nested interface `InnerNestedInterFace` is defined inside the class `NestedInterFace`.
 * - An inner class `innerClass` implements the private nested interface.
 * - The `nestedMethod()` of the private nested interface is implemented in the inner class.
 * - In the `main` method, an instance of the inner class is created and its method is invoked.
 */

package OOP_Concepts.Oop_5_Interfaces;

class NestedInterFace {
 
    // Static block - Executes when the class is loaded
    static {
        System.out.println("Static Block");
    }
 
    // Private nested interface and by default nested interfaces are static
    private interface InnerNestedInterFace {
        void nestedMethod(); // Abstract method to be implemented by a class
    }
 
    // Inner class that implements the private nested interface
    private class innerClass implements InnerNestedInterFace {
        @Override
        public void nestedMethod() {
            System.out.println("I am implemented by Nested Class");
        }
    }
 
    public static void main(String[] args) {
        // Create an instance of the enclosing class
        NestedInterFace obj = new NestedInterFace();
         
        // Create an instance of the inner class through the enclosing class instance
        NestedInterFace.innerClass create = obj.new innerClass();
         
        // Call the method implemented by the inner class
        create.nestedMethod();
    }
}
 
