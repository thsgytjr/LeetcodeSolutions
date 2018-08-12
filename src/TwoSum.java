import java.util.ArrayList;

public class TwoSum {

    Node addTwoNumbers(Node l1, Node l2) {
        Node l3 = new Node(0);
        Node dummy = l3;
        if(l1==null) return l2;
        if(l2==null) return l1;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0) {
            if(l1!=null) {
                carry += l1.data;
                l1 = l1.next;
            }
            if(l2!=null) {
                carry += l2.data;
                l2 = l2.next;
            }
            dummy.next = new Node(carry%10);
            dummy = dummy.next;
            carry = carry/10;
        }
        return l3.next;
    }

//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        StringBuilder sb3 = new StringBuilder();
//        Node l3 = new Node(0);
//        long result;
//        while (l1!=null){
//            sb1.append(l1.data);
//            l1 = l1.next;
//        }
//        sb1.reverse();
//        while (l2!=null){
//            sb2.append(l2.data);
//            l2 = l2.next;
//        }
//        sb2.reverse();
//        result = (Long.valueOf(sb1.toString()))+ (Integer.valueOf(sb2.toString()));
//        sb3.append(Long.toString(result)).reverse();
//        sb3.length();
//        Node dummmy = l3;
//        for (int i=0; i<sb3.length(); i++){
//            dummmy.next = new Node(Integer.valueOf(sb3.charAt(i)-'0'));
//            dummmy = dummmy.next;
//        }
//
//        return l3.next;
//    }



    public static void main(String[] args) {

        TwoSum ts = new TwoSum();

        Node head1 = new Node(2);
        Node second1 = new Node(4);
        Node third1 = new Node(3);

        Node head2 = new Node(5);
        Node second2 = new Node(6);
        Node third2 = new Node(4);



        head1.next = second1;
        second1.next = third1;

        head2.next = second2;
        second2.next = third2;


        System.out.println(ts.addTwoNumbers(head1,head2));

    }

}
