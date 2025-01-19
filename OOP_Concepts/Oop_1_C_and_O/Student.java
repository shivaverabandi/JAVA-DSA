package OOP_Concepts.Oop_1_C_and_O;

/*
 * This file demonstrates the concepts of Classes and Objects in Java.
 * It includes:
 * 1. Class definition with attributes and methods.
 * 2. Constructor for initializing objects.
 * 3. Object creation and accessing fields and methods.
 * Author: [Your Name]
 * Date: [YYYY-MM-DD]
 */

import java.util.*;

 // Define the Student class
 public class Student {
     // Attributes (Fields) of the Student class
     String rollNo;       // Roll number of the student
     String name;         // Name of the student
     Long mobileNo;       // Mobile number of the student
     float[] marks;       // Marks array
     String collegeName;  // College name
 
     // Constructor to initialize attributes
     public Student(String rollNo, String name, Long mobileNo, float[] marks, String collegeName) {
         this.rollNo = rollNo;
         this.name = name;
         this.mobileNo = mobileNo;
         this.marks = marks;
         this.collegeName = collegeName;
     }
 
     // Method to display the student's details
     void displayDetails() {
         System.out.println("Student Details:");
         System.out.println("----------------");
         System.out.println("Name        : " + name);
         System.out.println("Roll No     : " + rollNo);
         System.out.println("Mobile No   : " + mobileNo);
         System.out.println("Marks       : " + Arrays.toString(marks));
         System.out.println("College     : " + collegeName);
     }
 
     public static void main(String[] args) {
        // Array to store marks
        float[] marksOfShiva = {89, 90, 100, 67, 69};
        float[] marksOfDeep = {74,90,53,90,100,90};

        // Create an object of Student using the constructor
        Student student1 = new Student("21A81A0253", "Shiva", 999999999L, marksOfShiva, "Sri Vasavi College");
        Student student2 = new Student("21A81A0254","Deep",888888888L,marksOfDeep,"Sri Vasavi College");
        // Call the displayDetails method to show student details
        student1.displayDetails();
        student2.displayDetails();
        
     }
 }
 