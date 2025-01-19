package OOP_Concepts.Oop_2_Static.Package1;


 // same package and public so class can be shared
public class Engineer {
    public static void main(String[] args) {
       Employ obj = new Employ();
       Employ obj1 = new Employ(21, 2,"Shiva", 20000);
       obj.printDetails();
       obj1.printDetails();

       Employ.object.printDetails();
    }
}
