
package OOP_Concepts.Oop_6_lamda_Threds;
public class CustomArrayList<T>{
    private Object list[];
    private int DEFAULT_CAPACITY = 10;
    private int size = 0;
    CustomArrayList(){
        this.list = new Object[DEFAULT_CAPACITY];
    }
    //Add Method
    public void add(T x){
        if(isFull()){
            resize();
        }
        list[size++] = x; 
    }
    // IS Full Method
    private boolean isFull(){
        return size == list.length;
    }
    // Resize the ArrayList, grow the size
    private void resize(){
        Object temp[] =  new Object[size*2];
        for(int i = 0; i<size; i++){
            temp[i] = list[i];
        }
        list = temp;
    }
    //Set at particular Positon
    public void set(int idx, T x){
        list[idx] = x;
    }
    //Remove method
    @SuppressWarnings("unchecked")
    public T remove(){
        Object removed = list[--size];
        return (T)(removed);
    }
    // To know size of list
    public int size(){
        return size;
    }

    public void print(){
        if(size==0){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for(int i = 0; i<size-1; i++){
            System.out.print(list[i]+",");
        }
        System.out.print( list[size-1] +"]");
        System.out.println();
    }
    public static void main(String args[]){
        CustomArrayList<String> list1 = new CustomArrayList<>();
        list1.add("Shiva");
        list1.add("sai");
        list1.print();
        System.out.println(list1.size());
        CustomArrayList<Integer> list2 = new CustomArrayList<>();
        for(int i = 0; i<13; i++){
            list2.add(i*2);
        }
        list2.print();
        list2.remove();
        list2.print();
        list2.set(list2.size()-1,0);
        list2.print();

    }
}
