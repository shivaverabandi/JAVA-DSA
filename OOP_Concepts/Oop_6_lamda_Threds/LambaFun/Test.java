package OOP_Concepts.Oop_6_lamda_Threds.LambaFun;


import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(2); list.add(-2); list.add(58);
        list.add(0);
        list.add(-3);
    
        // Printing the list before sorting using a lambda function
        System.out.println("Before Sorting the list");
        list.forEach((a -> System.out.println(a)));  // This prints each element of the list before sorting
    
        // Sorting the list in ascending order using a lambda function
        Collections.sort(list, (a, b) -> a - b);  // Lambda function compares elements for sorting
    
        // Printing the list after sorting
        System.out.println("After the sort the list");
        list.forEach(a -> System.out.println(a));  // This prints each element of the list after sorting
    
        // Summing all elements in the list using Streams and reduce
        System.out.println("sum is " + list.stream().reduce(0, (a, b) -> a + b));  // Lambda used in reduce to sum elements
    }
    
}
