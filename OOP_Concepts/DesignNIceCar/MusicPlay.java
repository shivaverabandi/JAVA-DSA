package OOP_Concepts.DesignNIceCar;

public class MusicPlay implements MusicSys{
    @Override
    public void start(){
        System.out.println("ON the music");
    }
    @Override
    public void stop(){
        System.out.println("Off the Music");
    }
}
