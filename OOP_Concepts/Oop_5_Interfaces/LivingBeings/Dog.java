package OOP_Concepts.Oop_5_Interfaces.LivingBeings;

public class Dog implements Animal,Human {

    public void speak(){
        System.out.println("Bark Like Bow");
    }
    public void eat(){
        System.out.println("I eat with mouth");
    }
    public void walk(){
        System.out.println("Walk with four Legs");
    }

    public void think(){
        System.out.println("No that much not think, just bite...");
    }
}
