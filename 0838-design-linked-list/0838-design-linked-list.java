
class MyLinkedList {

    private class Node{
        
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

    }

    private Node head;
    private Node tail;
    private int size = 0;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }

        Node curr = head;
        while(index > 0){
            curr = curr.next;
            index--;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        if(tail == null){
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        size++;
        tail.next = newNode;
        tail = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        // Base Cases
        if(index == size){
            addAtTail(val);
            return;
        }else if(index > size || index < 0){
            return;
        }else if(index == 0){
            addAtHead(val);
            return;
        }

        size++;
        Node newNode = new Node(val);

        Node prev = null;
        Node curr = head;
        while(index > 0){
            prev = curr;
            curr  = curr.next;
            index--;
        }
        prev.next = newNode;
        newNode.next = curr;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }

        int temp = index;
        Node curr = head;
        while(index > 1){
            curr = curr.next;
            index--;
        }
        if(temp == size -1){
            curr.next = null;
            tail = curr;
            size--;
            return;
        }
        curr.next = curr.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */