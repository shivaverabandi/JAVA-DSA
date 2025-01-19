package OOP_Concepts.Oop_3_Principles.Abstraction;

public class RangeRover extends Vehicle{
    float milage(int n){
        return n;
    }

    protected void drive(){
        System.out.println("Driving mode on..");
    }
    
    public int tyres(int n){
        return n;
    }
}
