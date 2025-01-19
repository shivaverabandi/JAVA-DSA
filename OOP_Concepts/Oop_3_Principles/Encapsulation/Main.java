package OOP_Concepts.Oop_3_Principles.Encapsulation;

public class Main {

    public static void main(String[] args) {
        DataHide object = new DataHide();
        //object.name = "shiva"; Due to data hiding using private keyword, we cant access it directly.
    
        object.setName("Shiva");
        object.setPassword(851998);
        System.out.println(object.getName());
        System.out.println(object.getPassword());  
    }
}
