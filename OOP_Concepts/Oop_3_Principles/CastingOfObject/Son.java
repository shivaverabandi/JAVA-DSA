package OOP_Concepts.Oop_3_Principles.CastingOfObject;

public class Son extends Father {

    int age;
    Son() {
        super();
        this.age = 0;
    }
    Son(int age, int f_age){
        super(f_age);
        System.out.println(super.age);
       
        this.age = age;
        System.out.println(this.age);
    }


    Son(Son Son2){
        super(Son2);
        this.age = Son2.age;
    }
    @Override
    public void display(){
        System.out.println("This is Son's Display, Overrides the Father method");
    }
    public void display2(){
        System.out.println("This is son method, so cant use by reference type father");/*upCast*/ 
    }
}
