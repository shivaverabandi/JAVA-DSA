package OOP_Concepts.Oop_5_Interfaces;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
        //Constructor
    }
    
    abstract void career(String field);
    abstract void partner(String name, int age);

    final void urFather(){
        System.out.println("Father is not overriden");
    }
}
