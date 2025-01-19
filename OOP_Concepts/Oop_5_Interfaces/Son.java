package OOP_Concepts.Oop_5_Interfaces;

public class Son extends Parent{

    Son(int age, int f_age){
        super(f_age);
        this.age = age;  
    }

    void career(String field){
        System.out.println("papa.. I want to be an Engineer:"+field);
    }

    void partner(String name, int age){
        System.out.println("She is " + name + " Her age is: "+ age);
    }

    // @Override
    // void urFather(){
    //     System.out.println("Not change your father beta..");
    // }

}
