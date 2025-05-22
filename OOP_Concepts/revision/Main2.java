package OOP_Concepts.revision;

class MyPrintStream {

    public void println(String s) {
        System.out.print(s + "\n");
    }

    public void println(int a) {
        System.out.print(a + "\n");
    }
}
class MySystem{

    public static final MyPrintStream out = new MyPrintStream();
}
public class Main2 {
    public static void main(String[] args) {

        MySystem.out.println("Hello World");
        MySystem.out.println("Hello World");
        MySystem.out.println(2);
    }
}
