
/*
 * Explanation of the 'static' keyword in Java:
 * 
 * 1. **What is 'static'?**
 *    - The `static` keyword in Java is used to define members (variables, methods, blocks) 
 *      that belong to the class rather than to any specific instance of the class.
 *    - Static members are shared among all instances of a class. 
 * 
 * 2. **In the Context of This Code:**
 *    - `static long population`: 
 *        - This variable is declared as `static`, meaning it belongs to the `Human` class itself.
 *        - It keeps a count of the total population of `Human` objects created.
 *        - Since it is shared, any change to `population` by one object is reflected for all objects.
 * 
 * 3. **Behavior Demonstrated in This Code:**
 *    - Each time a new `Human` object is created, the constructor increments the `population` variable by 1.
 *    - This shared `population` variable tracks the cumulative number of `Human` objects.
 *    - The value of `population` can be accessed directly using the class name (`Human.population`) because it's static.
 * 
 * 4. **Why Use Static?**
 *    - Static variables are useful for shared data that shouldn't be duplicated across instances.
 *    - In this example, the `population` variable is used to store a count shared by all instances.
 * 
 * 5. **Key Observations in Output:**
 *    - Even though `shiva` and `kunal` are separate objects with their own `age` and `name`, they share the same `population` variable.
 *    - The output of `Human.population` reflects the total number of `Human` objects created, not specific to any instance.
 */
package OOP_Concepts.Oop_2_Static.StaticExample;
public class Human {
    public static void greet1(){
        //greet2(); Not permission to call non static from static because it executes before object creation, 
        //then how can you call the method  which is depedent on objects.
        //you can access it or call it via using specific object of that class
        //Human obj = new Human();
        //obj.greet2();
        System.out.println("Hi I am static method, depend on class");
    }
    // static{
    //     System.out.println(population); error because the flow how it defined it follows like that, when class is loaded.
    // }
    int age;           // Instance variable, unique to each object
    String name;       // Instance variable, unique to each object
    static long population; // Static variable, shared across all objects

    static {
        System.out.println(population);
    }
    // Constructor
    Human(int age, String name) {
        this.age = age;
        this.name = name;
        population += 1; // Increment shared population count
    }

    Human(){
        System.out.println("recursion");
        //no parameterized constructor
    }
    // When the class is loaded, after the compilation, it will be exexcuted
    static {
        
        System.out.println("Static Block 1"); // Example for static blocks
    } 
    //public Human object1 = new Human(); This statement makes you create objects recursively and stops after stack filled.
    //public static  Human object1 = new Human(); This statement makes you create objects recursively and stops after stack filed. 
    //How recursive..? then Debug..we will get to know amazing facts about debuggsing also....

    

    public void greet2(){
        greet1(); // we can call static from non static because static is depend on class.
        System.out.println("Hi I am depedent on Object");
    }
    public static void main(String[] args) { // It is exmaple for static method
        System.out.println("Main method executed");
        // Creating instances of Human
        Human shiva = new Human(21, "Shiva");
        Human kunal = new Human(23, "Kunal Kushwaha");

        greet1();

        // Accessing instance variables
        System.out.println(shiva.name); // Output: Shiva
        System.out.println(kunal.name); // Output: Kunal Kushwaha

        // Accessing static variable
        System.out.println(Human.population); // Output: 2 (total number of Human objects created)
    }
    static {
        System.out.println("Static Block 2");
    }
}

