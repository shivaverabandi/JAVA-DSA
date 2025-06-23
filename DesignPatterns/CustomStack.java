
class DynamicStack<E> extends CustomStack<E>{
    
    public DynamicStack(){
        super();
    }
    
    public DynamicStack(int size){
        super(size);
    }
    
    @Override
    public void push(E o){
        if(isFull()){
            Object []temp = new Object[2* this.data.length];
            temp = Arrays.copyOf(data,temp.length);
            data = temp;
        }
        super.push(o);
    }
    
}
public class CustomStack<E> {
    public Object [] data;
    protected int top = -1;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomStack(){
        this(DEFAULT_CAPACITY);
    }
    public CustomStack(int size){
        this.data = new Object[size];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(E o){
        if(isFull()){
            throw new StackOverflowError("Stack is full..!");
        }
        data[++top] = o;
    }

    public E peek() {
        if(isEmpty()){
            throw new StackOverflowError("Stack is Empty..!");
        }
        return (E) data[top];
    }

    public E pop(){
        if(isEmpty()){
            throw new StackOverflowError("Stack is Empty..!");
        }

        return (E) data[top--];
    }

    public Integer size(){
        return top + 1;
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

}
class Main{
    public static void main(String []args){
        CustomStack<Integer> stack = new CustomStack<>();
//         stack.push(2);
//         stack.push(4);
//         stack.push(6);
//         stack.push(9);

//         System.out.println(stack.peek());
//         System.out.println(stack.isEmpty());
//         System.out.println(stack.pop());

//         while(!stack.isEmpty()){
//             System.out.println(stack.pop());
//         }

        // System.out.println(stack.pop());
        
        
        CustomStack<Integer> st = new DynamicStack<>();

        st.push(2);
        st.push(4);
        st.push(6);
        st.push(9);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(9);
        

        st.push(2);
        st.push(4);
        st.push(6);
        st.push(9);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(9);
        System.out.println(st.size());
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        
    }
}
