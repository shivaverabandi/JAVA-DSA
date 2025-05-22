package OOP_Concepts.revision;

public class ImmutableClass extends Exception {
    public ImmutableClass() {
        super("immutable class");
    }
    public final void method(){
        System.out.println("immutable class");
    }

}
class child extends ImmutableClass{

    public void child(){
        ImmutableClass child = new child();
        child.method();
    }
}