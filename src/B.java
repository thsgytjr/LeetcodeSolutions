

public class B {
    Node reverse(Node node){
        Node previous = null;
        Node current = node;
        Node next = null;

        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node one = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);

        one.next=two;
        two.next=three;

        B b = new B();
        b.reverse(one);


    }
}
