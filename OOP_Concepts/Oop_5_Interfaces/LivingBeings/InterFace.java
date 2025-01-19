package OOP_Concepts.Oop_5_Interfaces.LivingBeings;

// Define the first interface
interface Writer {
    void write();
    int remember();

}

// Define the second interface
interface Reader {
    void read();
    int remember();
}

// Class implements both interfaces
class Person implements Writer, Reader {
    @Override
    public void write() {
        System.out.println("Person is writing a book.");
    }

    @Override
    public void read() {
        System.out.println("Person is reading a novel.");
    }
    @Override
    public int remember(){
        return 50;
    }
}

// Main class to demonstrate multiple interface implementation
public class InterFace {
    public static void main(String[] args) {
        Person person = new Person();

        person.write(); // Call the write method
        person.read();  // Call the read method
        System.out.println(person.remember());// Every person having their own capacity.
    }
}

