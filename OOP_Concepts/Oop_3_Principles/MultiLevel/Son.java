package OOP_Concepts.Oop_3_Principles.MultiLevel;

public class Son extends Parent{
    String shop;
    Son(String shop, String car, String house){
        super(house, car);
        this.shop = shop;
    }
}
