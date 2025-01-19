package OOP_Concepts.Oop_1_C_and_O;

public class FinalExample {
    // final int a;
    // a = 53;
    // The above gives you error. Reason.. intialization & declaration makes at a time.
    final int a = 53;
    int number;
    String name;
    FinalExample(int num, String name){
        this.number = num;
        this.name = name;
    }

    public static void main(String[] args) {
        final FinalExample finObj = new FinalExample(8, "Shiva");
        System.out.println(finObj.name);
        // Here you can change the value in the object, but can't change the reference of that object.
        // finObj = new FinalExample(17, "Deep");
        // The above line gives you error
        // You can change the value of name in the in object.
        finObj.name = "deep";
        // by this we can change. Where on the other, in the primitives we cant change values.
        System.out.println(finObj.name);
    }
}
