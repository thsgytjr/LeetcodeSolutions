import javax.xml.soap.Node;
import java.io.*;
import java.util.*;

public class LinkedListPlay {

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    Node insert(Node head, int data){
        Node temp = new Node(data);
        Node current = head;

        if (head!=null){
            while (current.next!=null)  { //2|3 3|null
                current=current.next;
            }
            current.next = temp;
        }else{
            head = temp;
        }
        return head;
//         if (head == null){
//             return new Node(data);
//         }else if (head.next == null){
//             head.next = new Node(data);
//             return head;
//         }else{
//             insert(head.next,data);
//         }
//         return head;
    }
    public static Node removeDuplicates(Node head) {
        //Write your code here   1 | 2 | 2 | 3
//        for(Node n = head; n.next != null; n = n.next){
//            if (n==null){
//                if (n.data==n.next.data){
//                    n.next=null;
//                }
//                break;
//            }else {
//                if (n.data == n.next.data) {
//                    if (n.next.next == null) {
//                        n.next = null;
//                        return head;
//                    } else {
//                        if (n.next==n.next.next)
//                        n.next = n.next.next;
//                    }
//
//                }
//
//            }
//        }
//        return head;
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }




    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Node head = null;
        LinkedListPlay ll = new LinkedListPlay();
        int[] ele = new int[]{1,2,3,3};
        for (int i=0; i<ele.length; i++){

            head = ll.insert(head,ele[i]);
        }
        head=removeDuplicates(head);
        display(head);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

//        System.out.println(duration);
    }
}
