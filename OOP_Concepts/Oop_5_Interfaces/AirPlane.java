package OOP_Concepts.Oop_5_Interfaces;

public class AirPlane extends PlatForm  implements Company,Service{
    @Override
    public int milage(int n){
        return n;
    }

    public int tyres(int n){
        return n;
    }

    // public void drive(){
    //     System.out.println("Pilot trained and ready to take offs");
    // }

    public String brand(String name){
        return name;
    }

    //COmpany details
    public int price(){
        System.out.println("buisiness Class is 20000");
        return 20000;
    }

    public String brand(){
        System.out.println("Company Brand");
        return "Jazz Airways";
    }

    //Service

    public void check(){
        System.out.println("Checked... Ready to Fly");
    }
}
