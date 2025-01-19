package OOP_Concepts.Oop_3_Principles.Inheritance;
        // Key Points about Inheritance and the super keyword:

        /*
         * 1. **Inheritance**:
         *    - Inheritance is a mechanism in OOP (Object-Oriented Programming) where one class (child class)
         *      inherits the fields and methods of another class (parent class).
         *    - In this example, `BoxWeight` inherits from `Box`, meaning `BoxWeight` gets all the fields 
         *      (`l`, `h`, `w`) and methods (`displayBoxInfo()`) from `Box`.
         *    - Inheritance allows the child class to reuse code from the parent class, reducing redundancy.
         *    - It also allows for method overriding, where the child class can provide its own version of a method 
         *      defined in the parent class (not shown in this example, but important for customization).

         * 2. **The `super` keyword**:
         *    - `super()` is used to call the constructor of the parent class.
         *    - In the `BoxWeight` constructor `BoxWeight(int len, int width, int height, int weight)`, 
         *      we use `super(len, width, height)` to call the parent class (`Box`) constructor 
         *      that initializes the dimensions of the box (`l`, `w`, and `h`).
         *    - The `super()` call ensures that the fields of the parent class are properly initialized 
         *      before the child class adds its own fields (like `weight` and `price`).
         *    - If `super()` is not explicitly called, the default constructor of the parent class is called 
         *      automatically (if it exists).
         */
public class Main {
    public static void main(String[] args) {
        // Create an object of the Box class using the default constructor
        Box box1 = new Box();
        // Print the values of l, w, and h of the box1 object (initial values from default constructor)
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        //System.out.println(box1.weight); child fields cant acces by parent
        
        // Create an object of the BoxWeight class using the default constructor
        BoxWeight box2 = new BoxWeight();
        // Print the values of h and weight (inherited from Box, added weight from BoxWeight)
        System.out.println(box2.h +"  "+box2.weight);
        
        // Call the method displayBoxInfo() inherited from the Box class
        box2.displayBoxInfo(); 
        
        // Create an object of the BoxWeight class using the parameterized constructor
        BoxWeight box3 = new BoxWeight(2,3,4,20);
        // Print the values of h, l, w, and weight
        System.out.println(box3.h + " "+ box3.l+ " "+box3.w +" "+box3.weight);
    }
}
