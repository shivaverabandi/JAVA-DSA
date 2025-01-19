package OOP_Concepts.Oop7_CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VECTOR_CLASS {
    public static void main(String[] args) {
        // Vector are thread safe and slower than ArrayList. One thread can acces object at a time
        List<Integer> vec = new Vector<>();
        vec.add(34);
        vec.add(21);

        // ArrayList are thread unsafe and faster than vector. Multiple thread can Access One object at a time
        List<Integer> al = new ArrayList<>();
        al.add(8);
        al.add(17);
        

    }
}
