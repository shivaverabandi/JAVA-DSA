package LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class SingleLinkedList{
    
    private  Node head;

    public  int size = 0;

    public void addAtFirst(int val){
        size++;  // add at first of list O(1)
        Node newNode = new Node(val);//created node with given value.
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node delAtFirst(){ // delete at first of list O(1)
        if(head == null){
            return  null;
        }
        else if(head.next == null){
            size--;
            return null;
        }
        size--;
        head = head.next;
        return head;
    }

    public void addAtLast(int val){ // O(N) for adding value at last
        Node newNode = new Node(val);
        size++;
        if(head == null){ // edge case is if no node is present
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public Node delAtLast(){ // O(N) for deleting at last
        if(head == null){
            return null;
        }else if(head.next == null){
            size--;
            return null;
        }

        size--;
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        return prev.next = null;
       
    }


    public void inesrtAt(int pos, int val){ // Inset at given position(indexing start from 0) O(N)
        Node newNode = new Node(val);
        size++;
        if(pos == 0){  // if insertion at first
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        Node prev = null;
        int i = 0;
        while(i < pos && curr != null){
            prev = curr;
            curr = curr.next;
            i++;
        }
        if(curr == null){
            prev.next = newNode;
        }else{
            prev.next = newNode;
            newNode.next = curr;
        }
    }

    public Node delAt(int pos){
        if(pos == size){ // 0 based indexing so at size we have null
            return null;
        }
        size--;
        if(pos == 0){
            head = head.next;
            return head;
        }

        Node curr = head;
        Node prev = null;

        int i = 0;
        while(i<pos && curr != null){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
    }
    public void traversal(Node node){ // traversing list o(N)

        if(node == null){
            System.out.println("[] list is empty");
            return;
        }
        if(node.next == null){
            System.out.println(node.val);
            return;
        }
        Node temp = node;
        while(temp.next != null){
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    public static void main(String []args){
        SingleLinkedList list = new SingleLinkedList();

        list.addAtFirst(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtFirst(0);

        list.inesrtAt(0, 23);
        list.inesrtAt(3, 33);
        list.inesrtAt(7, 44);

        list.delAt(0);
        list.delAt(3);
        list.delAt(list.size);
        list.traversal(list.head);
        System.out.println(list.size);
    }
}
