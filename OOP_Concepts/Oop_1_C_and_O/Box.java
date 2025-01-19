package OOP_Concepts.Oop_1_C_and_O;


/*================================================ Concepts Covered ==============================================
 * About new Key Word
 * Why Null is not printed directly in sysout statement.
 * Proof for new key Word returns reference to the variable.
 * 
 */
//import java.util.*;
public class Box{

   void  description_Of_Box(){
        System.out.println("Hi.., I am an Empty Box. Doesn't have any parameters.");
    }
    public static void main(String[] args) {

       

        /*Why b1 is called as reference Varible? 
         * If you try to print the below statement then it gives you error the (variable not intialized.)
         * Because you didn't store any value in it. Thus new key return a reference when object created.
         * That returned value store in (b1) variable, tha's why it is called as reference variable.
        */

        /*  Proof for above theory...
            If you comment out then it gives error that variable not intialized.
            Box b1;
            System.out.println(b1);
        */


        /*Now create an object using new KeyWord..
         * this where how new word allocated memory...
         * And returns reference to the variable.
         * That's Why it doesn't give any error, instead it prints the reference of object.
        */

        Box b1 = new Box();
        System.out.println(b1);
        // In the above statements state that new keyword returns reference to the variable.
        // Creates space to object in the Memory.(heap Memory)

    }
}