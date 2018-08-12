import java.util.LinkedList;

public class LinkedListPractice {

    LinkedList link (int[] a){
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for(int item: a){
            ll.add(item);
        }
        ll.remove(a.length-2);

            return ll;
    }
    public static void main(String[] args) {
        LinkedListPractice lp = new LinkedListPractice();
        int[] arr = new int[]{1,2,3,4,5};

//        System.out.println(lp.link(arr))
// [1,2,3,4]

        System.out.println(4/2);
    }
}
