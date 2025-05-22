package OOP_Concepts.revision;

import java.util.List;

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);

}

public class Main {
    public static void main(String[] args) {
        Calculator c = (a,b) -> a + b;
        System.out.println(c.calc(10, 20));
    }
}
