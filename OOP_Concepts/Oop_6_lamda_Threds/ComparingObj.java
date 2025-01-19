package OOP_Concepts.Oop_6_lamda_Threds;

public class ComparingObj implements Comparable<ComparingObj>{
    int marks;
    float grade;

    public ComparingObj(int m, float g){
        this.marks = m;
        this.grade = g;
    }

    public ComparingObj(int n){
        this.marks = n;
    }
    @Override
    public String toString(){
        return marks +"  "+ grade;
    }

    @Override
    public int compareTo(ComparingObj obj){
        System.out.println("Entered into method");
        return Float.compare(this.grade, obj.grade);
    }
}
