package OOP_Concepts.Oop7_CollectionsFrameWork;

public class EnumEx {
    enum WEEK implements A{
            monday,tuesday,wednesday,thursday,friday,saturday,sunday;
//ordinal:->  0     1         2         3       4      5        6

        WEEK(){
            System.out.println("Enum Constructor "+ this);// --> This will internally create when one constant is called then,
        }                                                      // it calls all others also
        // Constructors in enums are private or default. Concept of enums is to create constant objects. SO we cant extends any classes.
        // Enum cant be inherited, or can't be nested enum under enum.

        @Override // Only With interfaces
        public void greetEnum(){
            System.out.println("Implementing the Interface A. "+" and "+ "Called by Enum Constant: "+ this);
        }
        // Overlaoding
        public void greetEnum(int a, int b){

        }
    }
    public static void main(String[] args) {
        WEEK weekDay = WEEK.monday;
        System.out.println(weekDay);
        for(WEEK week : WEEK.values()){
            System.out.println(week);
        }
        WEEK weekDay2 = WEEK.tuesday;
        System.out.println(weekDay2.ordinal()); // Gives the position of enum Constant, here it return 1.
        weekDay2.greetEnum();
        System.out.println(WEEK.valueOf("wednesday")); // It return the Enum Constant. here it return "wednesday"
        weekDay2.greetEnum(1, 2);
    }
}
