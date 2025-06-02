package DesignPatterns;

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car start");
    }
    @Override
    public void stop(){
        System.out.println("Car stop");
    }
}
class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck start");
    }
    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}

class VehicleFactory{
    // By Using Vehicle Factory we can create so many cars and Trucks instances.
    public static Vehicle getVehicle(String type){
        if(type.equals("Car")){
            return new Car();
        }else if(type.equals("Truck")){
            return  new Truck();
        }else{
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
public class FactoryDesign {
    public static void main(String[] args) {
        Vehicle ferari = VehicleFactory.getVehicle("Car");
        ferari.start();
        ferari.stop();
        Vehicle bharathBenz = VehicleFactory.getVehicle("Truck");
        bharathBenz.start();
        bharathBenz.stop();
        Vehicle maruthi = VehicleFactory.getVehicle("Car");
        maruthi.start();
        maruthi.stop();
    }
}
