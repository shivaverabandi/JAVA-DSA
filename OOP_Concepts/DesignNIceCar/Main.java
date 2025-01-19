package OOP_Concepts.DesignNIceCar;

public class Main {
    
    public static void main(String[] args) {
        Nice_car audi = new Nice_car();
        audi.start();
        audi.changeEngine();
        audi.start();
        audi.startMusic();
        audi.changeMusic_System(new MusicPlay());
        audi.changeEngine();
        audi.upgradeEngine(new Electric());
        audi.upgradeEngine(new Diesel());
        Engine obj = new Electric();
        obj.method();
    }
}
