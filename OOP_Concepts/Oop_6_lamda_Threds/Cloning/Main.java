package OOP_Concepts.Oop_6_lamda_Threds.Cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human person1 = new Human(21,"Kunal");
        System.out.println(person1.name +" "+ person1.age);
        Human person3 = (Human)person1.clone(); // Shallow Copy
        System.out.println(person3.name+ " "+ person3.age);
        person3.name = "Shiva Sai"; 
        //In Shallow copy Strings are not chageable for all because strings are immutable, so when you make changes, 
        //It creates new String in the String Pool.
        System.out.println(person3.name +" "+ person3.age);
        System.out.println(Arrays.toString(person1.arr));
        System.out.println(Arrays.toString(person3.arr));
        person3.arr[2] = 8;// changing arr[2] = 1 to arr[2] = 8, Here arrays are mutable, so one change affects in all other objects
        System.out.println(Arrays.toString(person3.arr));
        System.out.println(Arrays.toString(person1.arr));
        // Proof of non primitives sharing reference
        System.out.println(person1.arr == person3.arr); // it gives true because due to shallo copy
        // Deep Copy--> Implemtation
        Human person4 = (Human)person1.clone();
        person4.arr[2]=17;
        System.out.println(Arrays.toString(person1.arr)); // Not changed because both are differ in reference
        System.out.println(person1.arr == person4.arr); // It gives false because due to deep copy
    }
    
}
