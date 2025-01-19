package OOP_Concepts.Oop_2_Static.Package1;



 // same package and public so class can be shared
public class Employ {
    int age;
    int exp;
    String name;
    long salary;
    Employ(int age,int exp,String name,long salary){
        this.age = age;
        this.exp = exp;
        this.name = name;
        this.salary = salary;
    }
    Employ(){
        System.out.println("I am Fresher" );
    }
    
   public void printDetails(){
        System.out.println("Hi i am Employ");
    }

    public static void main(String[] args){
      //  static int a = 1; This is error, because statics are class level variables not belonged particular methods
    } 
    public static Employ object = new Employ(); 
}