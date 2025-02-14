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

    public void traversal(Node node){ // traversing list o(N)

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

    }
}
