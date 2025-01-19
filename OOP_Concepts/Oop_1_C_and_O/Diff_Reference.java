package OOP_Concepts.Oop_1_C_and_O;

public class Diff_Reference {

    int UniqueNumber;
    static int sharedNumber=1998;
    //create a constructor with one parameter which takes number
    Diff_Reference(int number){
        UniqueNumber = number;
    }

    int getNumber(){
        return UniqueNumber;
    }
    // Dont bother about below @suppress warnings...It just written to neglect warning checks.
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Diff_Reference obj1 = new Diff_Reference(8);
        Diff_Reference obj2 = new Diff_Reference(8);
        //Here its shows that obj1 and ob2 having unique reference
        System.out.println(obj1 == obj2);
        // Why true below print statement....?
        // Because we comparing values in the objects not objects, since they are primitives, so these are
        //compared by their values.
        System.out.println(obj1.UniqueNumber==obj2.UniqueNumber);
        // How static shared across all objects. Lets clarify this...
        //lets print the shared number of Obj1
        System.out.println(obj1.sharedNumber);
        //lets change the sharedNumber by obj2, then print by obj1..and see what happens..
        //if it is changed then ask yourself why changed ?
        //Yes, you are rightm the reason is static context load once and shared across all the objects
        obj2.sharedNumber += 5;
        System.out.println(obj1.sharedNumber);
    }
}
