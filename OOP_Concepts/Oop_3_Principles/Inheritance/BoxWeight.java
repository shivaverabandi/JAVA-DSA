package OOP_Concepts.Oop_3_Principles.Inheritance;

public class BoxWeight extends Box {
    // Additional fields specific to BoxWeight
    int weight;
    int price;

    // Default constructor: initializes weight to -1
    BoxWeight(){
        this.weight = -1;
    }

    // Constructor to initialize both weight and price
    BoxWeight(int weight, int price){
        super();
        this.price = price;
        this.weight = weight;
    }

    // Constructor to initialize length, width, height, and weight, calling the parent constructor
    BoxWeight(int len, int width, int height, int weight){
        // Calling the parent class constructor with parameters (len, width, height)
        super(len, width, height); // Calls Box(int len, int width, int height)
        this.weight = weight;


    }
}
