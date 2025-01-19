package OOP_Concepts.Oop_5_Interfaces.LivingBeings;

public class Main {
    
    public static void main(String[] args) {
        Human student = new Student();

        student.speak();
        student.think();

        Animal jony = new Dog();

        jony.eat();
        jony.think();
    }
}
