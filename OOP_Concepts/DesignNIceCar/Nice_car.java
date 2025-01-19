package OOP_Concepts.DesignNIceCar;

// Main class representing a Nice car.
public class Nice_car {
    
    // Instance variables: the car has an engine and a music system
    private Engine engine;
    private MusicSys music = new MusicPlay();  // Default music system is MusicPlay.
    
    // Constructor: Initializes the car with an Electric engine by default.
    Nice_car() {
        engine = new Electric();  // By default, the engine is Electric.
    }

    // Method to start the car's engine
    public void start() {
        engine.start();  // Calls the start method of the current engine (could be Electric, Diesel, etc.).
    }

    // Method to stop the car's engine
    public void stop() {
        engine.stop();  // Calls the stop method of the current engine.
    }

    // Method to upgrade the car's engine to a new type of engine
    public void upgradeEngine(Engine Upgraded) {
        this.engine = Upgraded;  // Updates the engine to the provided upgraded engine.
        System.out.println("Engine is Upgraded");  // Prints a message indicating the engine has been upgraded.
    }

    // Method to change the car's engine (e.g., from Electric to Diesel)
    public void changeEngine() {
        engine = new Diesel();  // Changes the current engine to a Diesel engine.
        System.out.println("Engine is Changed, Start and check");  // Prints a message to indicate the engine has been changed.
    }

    // Method to start the car's music system
    public void startMusic() {
        music.start();  // Calls the start method of the music system (could be MusicPlay, MusicAdvanced, etc.).
    }

    // Method to stop the car's music system
    public void stopMusic() {
        music.stop();  // Calls the stop method of the music system.
    }

    // Method to upgrade or change the car's music system
    public void changeMusic_System(MusicPlay music) {
        this.music = music;  // Updates the music system to the provided one.
        System.out.println("Music system is Upgraded");  // Prints a message indicating the music system has been upgraded.
    }
}
