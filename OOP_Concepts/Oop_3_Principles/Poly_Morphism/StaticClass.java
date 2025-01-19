package OOP_Concepts.Oop_3_Principles.Poly_Morphism;

public class StaticClass {
    public static class InnerStaticClass {
       static void display(){
            System.out.println("Static Inner class");
        }
    }
}

class child extends StaticClass.InnerStaticClass {
    //using the display method of Static inner class
}

class Main {
    public static void main(String[] args) {
        child.display();
    }
    
}
