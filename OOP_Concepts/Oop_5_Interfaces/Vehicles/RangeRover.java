package OOP_Concepts.Oop_5_Interfaces.Vehicles;

public class RangeRover implements Engine,Condition,Music,Mode{
    
    public void EngineType(){
        System.out.println("Diesel");
    }

    public void Ignition(){
        System.out.println("Start or Stop");
    }

    public void radio(){
        System.out.println("DTS.. Sound system");
    }

    public void acceleration(){
        System.out.println("Sport Mode");
    }
}
