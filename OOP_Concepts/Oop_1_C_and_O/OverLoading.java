package OOP_Concepts.Oop_1_C_and_O;

public class OverLoading {
    int number;
    float points;
    String name;

    OverLoading(int number, float points){
        this.number = number;
        this.points = points;
    }
    OverLoading(float points, int number, String name){
        this.number = number;
        this.points = points;
        this.name = name;
    }
    OverLoading(int number, float points, String name){
        this.number = number;
        this.points = points;
        this.name = name;
    }
    OverLoading  display(OverLoading obj){
        return this;
    }
    // Creating a copy of object. Note .. Not sharing reference.
    OverLoading(OverLoading Object){
        // Here we can see what is Object and What  this refer to.
        System.out.println(Object);
        System.out.println(this);
        this.name  = Object.name;
        this.number = Object.number;
    }
    public static void main(String[] args) {
        //OverLoading obj1 = new Overloading(); --> If you make any constructor than jvm doesnt provide default one
        OverLoading obj2 = new OverLoading(45,32.111f);
        System.out.println(obj2);
        obj2 = obj2.display(obj2);
        System.out.println(obj2);
        OverLoading obj3 = new OverLoading(8, 95.4f,"shiva");
        System.out.println(obj3);
        System.out.println(obj3.name);

        //Calling Object Constructor
        OverLoading obj4 = new OverLoading(obj3);
        System.out.println(obj4.name);
        obj4.name = "kunal";
        System.out.println(obj4.name);
        System.out.println(obj3.name); // In reference sharing change effect other too.. But here Not Effect.
    }
}
