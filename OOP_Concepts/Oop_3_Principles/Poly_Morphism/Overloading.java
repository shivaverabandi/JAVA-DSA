package OOP_Concepts.Oop_3_Principles.Poly_Morphism;


// This program demonstrates Compile-Time Polymorphism in Java (Method Overloading).
// Compile-Time Polymorphism allows multiple methods in the same class to have the same name
// but differ in their parameter list (number, type, or order of parameters).
// Key Points:
// 1. Return type alone cannot differentiate overloaded methods (commented example included).
// 2. Method signature includes the method name and parameter list (not the return type).
// 3. Overloading happens in the same class.
public class Overloading {

    // Method with no parameters
    public static void method() {
        System.out.println("Method with zero parameters called.");
    }

    // Method with one parameter
    public static void method(int a) {
        System.out.println("Method with one parameter (int a) called. Value: " + a);
    }

    // Method with two parameters of the same type
    public static void method(int a, int b) {
        System.out.println("Method with two parameters (int a, int b) called. Values: a = " + a + ", b = " + b);
    }

    // Method with two parameters of different types (String first, int second)
    public static void method(String name, int a) {
        System.out.println("Method with two parameters (String name, int a) called. Name: " + name + ", Value: " + a);
    }

    // Method with two parameters of different types and different order (int first, String second)
    public static void method(int a, String name) {
        System.out.println("Method with two parameters (int a, String name) called. Value: " + a + ", Name: " + name);
    }

    /* Uncommenting the below methods will cause a compilation error because return type
       alone cannot differentiate overloaded methods.

       public static int method1(int a, int b) {
           return b + a;
       }

       public static double method1(int a, int b) {
           return a + b;
       }
    */

    public static void main(String[] args) {
        // Calling method with zero parameters
        method();

        // Calling method with one parameter
        method(0);

        // Calling method with two parameters (int, String)
        method(0, "shiva");

        // Calling method with two parameters (String, int)
        method("null", 0);

        // Calling method with two parameters (int, int)
        method(0, 0);
    }
}

