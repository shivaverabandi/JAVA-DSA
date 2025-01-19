package OOP_Concepts.Oop_3_Principles.Abstraction;

public class gt_Continental extends Vehicle{
    
    protected void drive(){
        System.out.println("Driving mode on for GT>>>........");
    }

    float milage(int n){
        return n;
    }

    public int tyres(int n){
        return n;
    }
    @Override
    public void PlayMusic(){
        System.out.println("I am a two wheeler, Can't have music system");
    }
}
