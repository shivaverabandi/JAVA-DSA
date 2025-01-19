package OOP_Concepts.Oop_6_lamda_Threds.LambaFun;

/**
 * Flow of the `sum` operation execution:
 * 1. The `main` method initializes an instance of the `Calculator` class (`obj`).
 * 2. It creates a lambda expression `sum` of the `Operation` interface that implements the addition logic: (a, b) -> (a + b).
 * 3. The `operate` method is called with arguments 3, 2, and the `sum` operation:
 *      a. Inside `operate`, the `opearation` method of the `sum` lambda is executed.
 *      b. The lambda evaluates the expression `a + b`, where `a = 3` and `b = 2`.
 *      c. The result, `5`, is returned to the `main` method.
 * 4. The `main` method prints the result (`5`) to the console.
 */

interface Operation {
    int opearation(int a, int b);
}

public class Calculator {
    private int operate(int a, int b, Operation op) {
        return op.opearation(a, b);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Operation sum = (a, b) -> (a + b); // Lambda for addition
        Operation mul = (a, b) -> (a * b); // Lambda for multiplication
        Operation div = (a, b) -> (a / b); // Lambda for division

        // Using the operations and printing results
        System.out.println(obj.operate(3, 2, sum)); // Output: 5
        System.out.println(obj.operate(3, 3, mul)); // Output: 9
        System.out.println(obj.operate(4, 2, div)); // Output: 2
    }
}

