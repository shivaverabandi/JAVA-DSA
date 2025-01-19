/**
 * This class demonstrates the use of all Java access modifiers:
 *
 * 1. **private**:
 *    - Accessible only within the same class.
 *    - Ensures encapsulation by hiding implementation details.
 *    - Example: The variable `num` is private and can only be accessed within this class.
 *
 * 2. **protected**:
 *    - Accessible within the same package and by subclasses in other packages.
 *    - Used for sharing functionality with related classes (via inheritance).
 *    - Example: The constructor, methods, and variable `name` are protected and can be inherited.
 *
 * 3. **public**:
 *    - Accessible from everywhere in the program.
 *    - Provides the highest level of access.
 *    - Example: The array `array[]` is declared public and can be accessed from anywhere.
 *
 * 4. **default (package-private)**:
 *    - Accessible within the same package only.
 *    - Does not require an explicit access modifier keyword.
 *    - Example: The variable `bigNumber` is default and accessible within the package.
 */
package OOP_Concepts.Oop_4_Access_Mod;

public class TryModifier {
    // Private member: accessible only within this class
    private int num;

    // Protected member: accessible in the same package or through inheritance
    protected String name;

    // Public member: accessible everywhere
    public int array[];

    // Default (package-private) member: accessible only within the same package
    long bigNumber;

    // Protected constructor: accessible in the same package or through inheritance
    protected TryModifier(String name, int array[], long bigNumber){
        this.name = name;
        this.array = array;
        this.bigNumber = bigNumber;
    }

    // Protected constructor with no arguments
    protected TryModifier(){

    }

    // Protected method: accessible in the same package or through inheritance
    protected int getNum(){
        return num;
    }

    // Protected method: accessible in the same package or through inheritance
    protected void display(){
        System.out.println("Display the TryModifier Method");
    }
}

