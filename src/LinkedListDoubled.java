import java.util.Arrays;
import java.util.LinkedList;


public class LinkedListDoubled {

    LinkedList linkedDoubled (LinkedList ll){

        LinkedList reversed = new LinkedList();
        int count = 0;
        for (int i=ll.size()-1; i>=0; i--){
            reversed.add(count,ll.get(i));
            count+=1;
        }
        return reversed;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        LinkedListDoubled ld = new LinkedListDoubled();
//        ld.linkedDoubled(ll);
        int[] array = new int[]{4,3,2,7,8,2,3,1};
        Arrays.sort(array);
    }
}
