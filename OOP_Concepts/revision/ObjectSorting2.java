package OOP_Concepts.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ObjectSorting2 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        Student s2 = new Student("Jane", 52);
        Student s3 = new Student("Jack", 32);
        Student s4 = new Student("Jill", 11);
        Student s5 = new Student("Jill", 7);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students, (a,b) -> a.age - b.age);
        System.out.println(students);

    }
}
