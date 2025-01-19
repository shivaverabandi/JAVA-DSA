package OOP_Concepts.Oop_3_Principles.Encapsulation;
/*
 * Encapsulation in Java:
 * 1. What is Encapsulation?
 *    - Encapsulation is the concept of binding data and methods together 
 *      to make a program secure.
 *    - It can be visualized as a capsule where everything inside a class 
 *      is wrapped or encapsulated.
 *    - Example:
 *      class A {
 *          private int a;
 *          public void setA(int num) {
 *                a = num;
 *          }
 * 
 *          public int getA() { 
 *              return a; 
 *          }
 *      }
 * 
 * 2. How to achieve Encapsulation?
 *    - By using access specifiers (private, protected, public, default), 
 *      we control access to data and achieve encapsulation.
 * 
 * 3. Benefits of Encapsulation:
 *    - Helps achieve abstraction.
 *    - Enhances security by restricting direct access to data.
 *    - Enables maintaining logs through methods when binding data and methods.
 * 
 * 4. How to use private data?
 *    - Use getter and setter methods to access and modify private data.
 *    - Example:
 *      private int num;
 *      public int getNum() { return num; }
 *      public void setNum(int num) { this.num = num; }
 */

 public class DataHide {
    // Private data members for encapsulation
    private String name;
    private int password;

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method to set the password
    public void setPassword(int number) {
        this.password = number;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }

    // Getter method to get the password
    public int getPassword() {
        return password;
    }
}
