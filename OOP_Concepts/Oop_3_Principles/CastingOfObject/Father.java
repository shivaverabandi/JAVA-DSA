package OOP_Concepts.Oop_3_Principles.CastingOfObject;

public class Father {

    int age;
    Father(){
        this.age = 0;
    }
    Father(int age){
        this.age = age;
    }
    Father(Father babai){
        this.age = babai.age;
    }
    public void display(){
        System.out.println("This is Father's Display Method, but overriden by Son");
    }
   public void display1(){
        System.out.println("This is Not overidden by son but inherited by son");
    }
}
