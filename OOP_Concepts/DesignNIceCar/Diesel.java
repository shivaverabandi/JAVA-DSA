package OOP_Concepts.DesignNIceCar;

public class Diesel implements Engine{
    @Override
    public void engine(){
        System.out.println("Diesel Engine");
    }
    @Override
    public void stop(){
        System.out.println("Diesel Engine Stopped");
    }
    @Override
    public void start(){
        System.out.println("Diesel engine Started");
    }
}
