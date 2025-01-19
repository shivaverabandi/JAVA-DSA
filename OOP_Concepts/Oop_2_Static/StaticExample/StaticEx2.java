package OOP_Concepts.Oop_2_Static.StaticExample;

public class StaticEx2 {
    // static {
    //     System.out.println(population); This gives error because the population variable is not intialized till the line, it is intialised below.
    // }
    static int number;
    static{
        System.out.println(++number);
    }
    public static void main(String[] args) {
        System.out.println(++StaticEx2.number);

       //StaticEx2 obj1 = new StaticEx2();
        System.out.println(StaticEx2.number);
        //StaticEx2 obj2 = new StaticEx2();
        System.out.println(StaticEx2.number); // Observe that static block actually run once when the time of class is loaded.
    }
}
