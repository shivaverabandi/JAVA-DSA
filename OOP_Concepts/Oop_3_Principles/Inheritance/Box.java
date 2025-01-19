package OOP_Concepts.Oop_3_Principles.Inheritance;

public class Box {
    // Class fields for length, height, and width of the box
    int l;
    int h;
    int w;

    // Default constructor: initializes length, height, and width to -1
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // Constructor for a cube: initializes length, width, and height to the same value
    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // Constructor for a cuboid: initializes length, width, and height with specified values
    Box(int len, int width, int height){
        this.l = len;
        this.w = width;
        this.h = height;
    }

    // Copy constructor: copies the values of an existing Box object to create a new Box
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    // Method to display information about the box (for demonstration)
    public void displayBoxInfo(){
        System.out.println("Running the Box");
    }
}
