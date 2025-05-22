package OOP_Concepts.revision;
abstract class Student2 {
    String name;
    private int age;
    Student2() {
        System.out.println("Student2 Constructor");
        name = "shiva";
        age = 23;
    }


}

class Teacher2 extends Student2 {
    public Teacher2() {

    }

    public void teach() {
        System.out.println(name);
    }

}
public class InterView1 {
    public static void main(String[] args) {

        Teacher2 t = new Teacher2();
        t.teach();
    }
}
