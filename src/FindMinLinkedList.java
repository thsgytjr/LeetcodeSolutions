import javax.xml.soap.Node;
import java.util.LinkedList;

import static javafx.scene.input.KeyCode.N;

public class FindMinLinkedList {


    int mindValue(LinkedList<Integer> list){
        int max = list.getFirst();
        for (Integer temp: list){
            if (temp>max){
                max = temp.intValue();
            }
        }

        return max;
    }

    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.add(10);
        list.add(4);
        list.add(8);
        list.add(11);
        list.add(3);
        FindMinLinkedList fm = new FindMinLinkedList();
        System.out.println(fm.mindValue(list));



    }
}
