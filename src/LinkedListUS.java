import java.util.LinkedList;
import java.util.List;

public class LinkedListUS {

    // Properties
    Node head;
    int count;

    // Constructors
//    public LinkedList(){
//        head=null;
//        count=0;
//    }

    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;

    }

    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }

    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove() {
        //remove from back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public Node reverseList(Node head1) {

        if (head1 == null || head1.next == null)
            return head1;
        Node nextNode = head1.next;
        Node newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<String>();
//        Node node = new Node(1);
//        LinkedListUS ls = new LinkedListUS(node);
//        ls.add(2);
//        ls.add(3);
//        ls.add(4);
//        ls.add(5);
//        int max = node.getData();


        Node head1 = new Node(10);
        Node second1 = new Node(9);
        Node third1 = new Node(5);
        Node forth1 = new Node(12);
        Node fifth1 = new Node(2);

        Node head2 = new Node(1);
        Node second2 = new Node(4);
        Node third2 = new Node(7);

//
        head1.next = second1;
        second1.next = third1;
        third1.next = forth1;
        forth1.next = fifth1;

        LinkedListUS linkedListUS = new LinkedListUS(head1);
        linkedListUS.reverseList(head1);


        head2.next = second2;
        second2.next = third2;



        int totalNodes = 0;
        Node result = head1;
        while (result != null) {
            result = result.next;
            totalNodes++;
        }
        for (int i = 0; i <= totalNodes / 2; i++) {
            if (i == totalNodes / 2) {
                System.out.println(head1.data);
            }
            head1 = head1.next;
        }
//
        ///////////Reverse LinkLise////////////
        Node previous = null;
        Node current = head1;
        Node next = null;

        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        System.out.println(previous);
        ///////////Reverse LinkLise////////////
//
//
//        Node returnNode = new Node(0);
//        Node head3 = returnNode;
//
//        while (head1!=null&&head2!=null){
//            if (head1.data>=head2.data){
//                head3.next = head2;
//                head2 = head2.next;
//            }else{
//                head3.next = head1;
//                head1 = head1.next;
//            }
//            head3 = head3.next;
//        }
//        if (head1==null){
//            head3.next = head2;
//        }
//        else if(head2==null){
//            head3.next = head1;
//        }




//        Node previous = null;
//        Node current = head;
//        Node next = null;
//
//        System.out.println(head);
//        while (current!=null){
//            next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        head = previous;
//
//
//
//        System.out.println(head);

//        while (node!=null){
//            count++;
//            System.out.println(node.data);
//            node = node.next;
//        }


//        while (node!=null){
//            if (node.getData()<max){
//                max = node.getData();
//            }
//            node = node.next;
//        }
//
//        System.out.println(max);


    }
}

