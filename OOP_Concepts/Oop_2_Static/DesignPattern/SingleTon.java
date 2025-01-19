package OOP_Concepts.Oop_2_Static.DesignPattern;

/**
 * Singleton Design Pattern:
 * - Ensures that a class has only one instance and provides a global point of access to that instance.
 * - The constructor is made private to prevent direct instantiation from outside the class.
 * - The instance of the class is created lazily (only when needed) and accessed through a public static method.
 * 
 * Important Points:
 * 1. The Singleton pattern ensures that only one instance of the class is created.
 * 2. The constructor is private, so it can't be instantiated from outside the class.
 * 3. The instance is created only when it's needed for the first time, saving resources.
 * 4. The static `getInstance()` method is used to access the instance of the class.
 * 5. The instance is usually stored in a private static variable.
 */
public class SingleTon {

    // Step 1: Private constructor to prevent direct instantiation
   private SingleTon(){
        // Constructor
   }

   // Step 2: Private static variable to hold the single instance
   private static SingleTon instance;

   // Step 3: Public static method to get the instance
   public static SingleTon getInstatnce(){
       if(instance == null){  // Create an instance only if it doesn't already exist
           instance = new SingleTon(); // here i can call constructor because both in same file.
       }
       return instance;  // Return the single instance
   }
}







