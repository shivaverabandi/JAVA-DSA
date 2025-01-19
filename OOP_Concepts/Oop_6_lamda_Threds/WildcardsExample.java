package OOP_Concepts.Oop_6_lamda_Threds;


import java.util.List;
import java.util.ArrayList;
public class WildcardsExample {

    // Upper Bounded Wildcard: ? extends T
    // This method accepts lists of any type that extends from Number (e.g., Integer, Double, etc.)
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }

    // Lower Bounded Wildcard: ? super T
    // This method accepts lists of any type that is a superclass of Integer (e.g., Number, Object)
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(42);  // We can safely add Integer to the list
    }

    // Unbounded Wildcard: ?
    // This method accepts lists of any type, but we can't add elements to it.
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // Upper Bounded Wildcard Example
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(2.71);
        // This works for both Integer and Double as they extend from Number
        System.out.println("Upper Bounded Wildcard:");
        printNumbers(integers);
        printNumbers(doubles);
        System.out.println();
        // Lower Bounded Wildcard Example
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);  // Adding Integer to the list of Number
        List<Object> objects = new ArrayList<>();
        addNumbers(objects);  // Adding Integer to the list of Object
        System.out.println("Lower Bounded Wildcard:");
        System.out.println(numbers);
        System.out.println(objects);
        System.out.println();
        // Unbounded Wildcard Example
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        System.out.println("Unbounded Wildcard:");
        printList(strings);  // Can accept any type of list
        printList(integerList);
    }
}
