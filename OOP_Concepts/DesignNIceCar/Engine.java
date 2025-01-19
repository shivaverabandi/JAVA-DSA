package OOP_Concepts.DesignNIceCar;

public interface Engine {
    
    void engine();
    void stop();
    void start();

    default void method(){
        System.out.println("I am default method");
    }
}
