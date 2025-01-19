package OOP_Concepts.Oop_1_C_and_O;

public class thisKeyword {

    Long number;
    String name;

    thisKeyword(Long number, String name){
        // Here you can get clarity about this
        System.out.println(this); // it prints the reference of current object.
        this.name = name;
        this.number = number;
    }
    public static void main(String[] args) {
        thisKeyword obj1 = new thisKeyword(89L,"Shiva");
        System.out.println(obj1); // verify with above print statement.
        thisKeyword obj2 = new thisKeyword(17L, "kunal");
        System.out.println(obj2); // verify with above print statement.
    }
}
