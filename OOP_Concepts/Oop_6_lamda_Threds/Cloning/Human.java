package OOP_Concepts.Oop_6_lamda_Threds.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int arr[];
    Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,1,8,9};
    }
    //Copy of Object
    Human(Human other){
        this.age = other.age;
        this.name = other.name;
        this.arr= new int[other.arr.length]; // this implementation of example of  DEEP COPY .
    }
    //Cloning an Object using clone() method --> Shallow Copy, Deep Copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Shallow Copy: Creates a shallow copy using Object's clone method.
        Human deepCopy = (Human) super.clone(); 
        // Deep Copy: Creates a new array and copies the elements of the original array.
        deepCopy.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            deepCopy.arr[i] = this.arr[i];
        }
        // Returns the deep copy of the object.
        return deepCopy;
    }
}
