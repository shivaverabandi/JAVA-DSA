package OOP_Concepts.Oop_2_Static.DesignPattern;

public class MultipleObject {
    public static void main(String[] args) {

        //SingleTon object = new SingleTon(); Here i cant create instace directly because constructor is "private".
        // Creating multiple references to the Singleton instance
        SingleTon object1 = SingleTon.getInstance();  // First call to getInstance() creates the instance
        SingleTon object2 = SingleTon.getInstance();  // Subsequent calls return the same instance
        SingleTon object3 = SingleTon.getInstance();  // All calls return the same instance

        // Checking if all references point to the same instance
        if(object1 == object2 && object1 == object3){
            System.out.println(true);  // Prints true because all objects point to the same instance
        }
    }
}
