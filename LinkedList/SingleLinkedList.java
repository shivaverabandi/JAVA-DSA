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
    
    private static Node head;

    public void addAtFirst(int val){ // add at first of list O(1)
        Node newNode = new Node(val); //created node with given value.
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node delAtFirst(){ // delete at first of list O(1)
        if(head == null || head.next == null){
            return  null;
        }
        head = head.next;
        return head;
    }

    public void addAtLast(int val){ // O(N) for adding value at last
        Node newNode = new Node(val);
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
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        return prev.next = null;
       
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
        head = new Node(1);
        list.addAtFirst(2);
        list.addAtFirst(3);
        list.addAtFirst(4);
        list.traversal(head);
        list.delAtFirst();
        list.traversal(head);
        list.addAtLast(0);
        list.addAtLast(1);
        list.addAtLast(2);
        list.traversal(head);
        list.delAtLast();
        list.delAtLast();
        list.traversal(head);
    }
}
