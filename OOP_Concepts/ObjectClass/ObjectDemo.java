package OOP_Concepts.ObjectClass;

public class ObjectDemo {

    int num;
    float num1;

    ObjectDemo(int n,float num1){
        this.num = n;
        this.num1 = num1;
    }

    ObjectDemo(){

    }
    @Override
    public int hashCode(){
        return num;
    }
    @Override
    public String toString(){
        return "ObjectDemo";
    }
    @Override
    public Object clone() {
        return (Object)"Cloned";
    }
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num;
    }

    public boolean isSameRef(ObjectDemo old){
        return this == old;
    }

    public static void main(String[] args)  {
        ObjectDemo obj = new ObjectDemo(8,0);
        ObjectDemo ob = new ObjectDemo();

        Object obj1 = new ObjectDemo(8, 34.2f);

        System.out.println(obj.equals(obj1));
        System.out.println(obj.hashCode());
        System.out.println(ob.getClass());
    }
}
