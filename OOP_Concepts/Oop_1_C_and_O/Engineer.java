package OOP_Concepts.Oop_1_C_and_O;

/*
 * ========================================= Concept ==============================================================
                                        Concepts Involved

    1.Classes and Objects:
    A class is a blueprint for objects. The Engineer class defines the attributes and behavior of an engineer.
    Objects are instances of a class. Here, roles is an array of Engineer objects.
    Constructor:

    2.The Engineer constructor is used to initialize the attributes (name, age, exp, and salary) of the Engineer class.
    Array of Objects:

    3.An array is used to store multiple Engineer objects. Each object represents an individual engineer with unique data.
    Object Initialization:

    4.Objects in the array are initialized using the new keyword and the class constructor. 
 */

//===================================================================================================================

//======================================================== Key Points ==================================================
/*

Class and Attributes:
    Engineer is a user-defined class with four attributes: name, age, exp, and salary. 
    These attributes represent the properties of an engineer.

Constructor Usage:

    The constructor Engineer(String name, int age, int exp, Long salary) initializes these attributes. 
    this refers to the current object's instance.
Array of Objects:

    Engineer roles[] = new Engineer[5]; creates an array capable of holding 5 Engineer objects.
    Each element in the array is initially null until explicitly initialized with a new Engineer object.
Object Creation:

    roles[0] = new Engineer("Shiva", 21, 1, 500000L); 
    creates a new Engineer object with specified parameters and assigns it to the first position of the array (roles[0]).

Accessing Object Attributes:
    
    roles[0].name accesses the name attribute of the first Engineer object in the array.

Long Data Type:
    
    The salary attribute is of type long to store large salary values without overflow.*/

//==================================================================================================================
public class Engineer {

    // Instance variables (attributes of the Engineer class)
    String name;   // Name of the engineer
    int age;       // Age of the engineer
    int exp;       // Experience (in years)
    long salary;   // Salary of the engineer in long type to handle large values

    // Constructor to initialize the attributes of an Engineer object
    Engineer(String name, int age, int exp, Long salary) {
        this.name = name;     // Assign the name parameter to the instance variable
        this.age = age;       // Assign the age parameter to the instance variable
        this.exp = exp;       // Assign the experience parameter to the instance variable
        this.salary = salary; // Assign the salary parameter to the instance variable
    }

    public static void main(String[] args) {
        // Create an array to store 5 Engineer objects
        Engineer roles[] = new Engineer[5];

        // Create the first Engineer object and store it in the array
        roles[0] = new Engineer("Shiva", 21, 1, 500000L);
        // Print the name of the first Engineer object
        System.out.println(roles[0].name); // Output: Shiva

        // Create the second Engineer object and store it in the array
        roles[1] = new Engineer("Mani deep", 23, 2, 10000000L);
        // Print the name of the second Engineer object
        System.out.println(roles[1].name); // Output: Mani deep
    }
}


