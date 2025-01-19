package OOP_Concepts.Oop_6_lamda_Threds;
public class ArrayList {
    private Integer[] list; // Array to store elements
    private int DEFAULT_CAPACITY = 10; // Initial capacity
    public static int size = 0; // Tracks the number of elements

    // Constructor: Initialize the list with default capacity
    ArrayList() {
        this.list = new Integer[DEFAULT_CAPACITY];
    }

    // Add function to append an element at the end of the list
    public void add(int x) {
        if (isFull()) {
            resize(); // Double the size if full
        }
        list[size++] = x; // Assign the value and increment size
    }

    // Resize function to increase the array capacity
    private void resize() {
        Integer temp[] = new Integer[list.length * 2]; // Create a new array with double capacity
        for (int i = 0; i < size; i++) { // Copy elements from the old array
            temp[i] = list[i];
        }
        list = temp; // Replace old array with the new one
    }

    // Check if the list is full
    private boolean isFull() {
        return size == list.length; // Full when size equals the array length
    }

    // Insert function to insert an element at a specific index
    public void insert(int idx, int x) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        list[idx] = x; // Insert the element at the specified index
    }

    // Remove function to remove and return the last element
    public int remove() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        int removed = list[--size]; // Decrement size and get the last element
        list[size] = null; // Clear the slot for garbage collection
        return removed;
    }

    // Print function to display the elements of the list
    public void print() {
        for (int i = 0; i < size; i++) { // Iterate through valid elements only
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    //Size of list
    public int size(){
        return size;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // Create a new ArrayList

        list.add(3); // Add an element
        for (int i = 0; i < 10; i++) { // Add more elements
            list.add(i + 3);
        }

        list.print(); // Print the elements
        list.remove();
        list.print();
        System.out.println(list.size());
    }
}
