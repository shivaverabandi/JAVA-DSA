package OOP_Concepts.DesignNIceCar;

public class Electric implements Engine{
    
    @Override
    public void engine(){
        System.out.println("Electric Engine");
    }
    @Override
    public void stop(){
        System.out.println("Electrical Engine Stopped");
    }
    @Override
    public void start(){
        System.out.println("Electrical Engine Started");
    }
}
