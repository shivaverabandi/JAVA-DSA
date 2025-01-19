// This program demonstrates multilevel inheritance in Java.
// In multilevel inheritance, a class is derived from another class,
// which is also derived from another class, forming a hierarchy.
// Here, 'GrandParent' is the base class, 'Parent' is derived from 'GrandParent',
// and 'Son' is derived from 'Parent', creating a three-level inheritance structure.
//
// In this hierarchy:
// - 'GrandParent' has a property 'house'.
// - 'Parent' inherits 'house' from 'GrandParent' and adds a new property 'car'.
// - 'Son' inherits both 'house' and 'car', and introduces an additional property 'shop'.
//
// When an object of 'Son' is created, it has access to all three properties:
// 'house', 'car', and 'shop'. However, when a 'Son' object is referenced
// by a variable of type 'Parent' or 'GrandParent', it can only access the properties
// defined in the respective classes and their superclasses. This is due to the way
// Java handles inheritance and polymorphism, where the reference type determines
// the accessible members, not the actual object type.
//
// For example:
// - A 'Parent' reference to a 'Son' object can access 'house' and 'car', but not 'shop'.
// - A 'GrandParent' reference to a 'Son' object can only access 'house'.
//
// This behavior ensures that each class in the hierarchy encapsulates its own properties,
// and only exposes them to subclasses or other classes as intended.

package OOP_Concepts.Oop_3_Principles.MultiLevel;

public class Main {

    public static void main(String[] args) {
        Son obj = new Son("Super Market", "Innova", "Triple Stair");
        System.out.println(obj.house); // Accessing property from GrandParent
        System.out.println(obj.car);   // Accessing property from Parent
        System.out.println(obj.shop);  // Accessing property from Son

        Parent obj1 = new Son("Market is not Accessible", "Innova is Mine, take it when you extends me", "House given by ur Grand Parent");
        // System.out.println(obj1.shop); // Not accessible, as 'shop' is not defined in Parent
        System.out.println(obj1.house); // Accessing property from GrandParent
        System.out.println(obj1.car);   // Accessing property from Parent

        GrandParent obj2 = new Son("null", "null", "single Stair");
        System.out.println(obj2.house); // Accessing property from GrandParent
        // System.out.println(obj2.car);  // Not accessible, as 'car' is not defined in GrandParent
        // System.out.println(obj2.shop); // Not accessible, as 'shop' is not defined in GrandParent

        /*                  Son obj3 = new GrandParent(null);

        A Son object inherently includes all characteristics of its parent (Parent) and 
        grandparent (GrandParent) classes,along with its own unique features. 
        However, a GrandParent object lacks the specific properties and methods defined in the Son class.
        Allowing such an assignment would enable access to Son-specific members that the GrandParent 
        object does not possess,leading to potential runtime errors.

        Therefore, Java enforces type safety by
        disallowing the assignment of a parent class object to a child class reference. 
        This ensures that a reference variable can only access members that are guaranteed 
        to exist in the actual object it points to.
        
        */
    }
}

    
