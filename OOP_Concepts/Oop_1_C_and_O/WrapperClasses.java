package OOP_Concepts.Oop_1_C_and_O;

public class WrapperClasses{

    public static void swap(Integer a , Integer b){
        Integer c = a;
        a = b;
        b=c;
    }
    public static void main(String args[]){
        Integer a =3;
        Integer b =4;
        swap(a,b); // why not swapped, because these are objects na...Reason is Integer class is declared as final.
        System.out.println(a);
        System.out.println(b);

        // AutoBox and Unbox
        int c = 17;
        Integer d = c; // AutoBox
        Integer e = 8;
        int f = e; // UnBox
        System.out.println(d +" " + f);

        //final cant be modified

        final int A = 4;
       // A++; It gives you error , because can't modified
       System.out.println(A);


    }
}