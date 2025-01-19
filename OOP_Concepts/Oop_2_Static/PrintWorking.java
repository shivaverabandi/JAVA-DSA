package OOP_Concepts.Oop_2_Static;

public class PrintWorking {
    String name;

    // Constructor to initialize the name field
    PrintWorking(String name) {
        this.name = name;
    }

    /**
     * Override the toString method to provide a custom string representation
     * for objects of the PrintWorking class. Instead of the default memory
     * address representation, this will return the specified custom statement.
     */
    @Override
    public String toString() {
        return "Object belongs to PrintWorking Class";
    }

    public static void main(String[] args) {
        // Create an object of the PrintWorking class
        PrintWorking object = new PrintWorking("Shiva");

        // Print the object, which will call the overridden toString method
        System.out.println(object);
    }
}
