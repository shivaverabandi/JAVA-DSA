package OOP_Concepts.Oop_1_C_and_O;

public class Reference {
    int num;
    float num1;
    String name;
    
    Reference(int num, float num1, String name){
        this.name = name;
        this.num1 = num1;
        this.num = num;
    }

    void display(){
        System.out.println(name);
        System.out.println(num);
        System.out.println(num1);
    }
    public static void main(String[] args) {
        Reference obj1 = new Reference(8, 1998, "Shiva");
        obj1.display();
        //In java, Objects stored in heap Memory, 
        // SO objects cant be copied to another, insted of both pointing to the same object
        // Thats why changes happen.
        Reference obj2 = obj1;
        System.out.println(obj2.name);
        obj2.name = "Kunal";
        System.out.println(obj1.name);
        Reference obj = new Reference(34, 12, "null");
        obj.display();
    }
}
