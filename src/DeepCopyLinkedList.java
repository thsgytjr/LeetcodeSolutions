import java.util.List;

public class DeepCopyLinkedList {

    static class RandomListNode{
        RandomListNode next;
        RandomListNode random;
        int data;
        public RandomListNode(int newData){
            data = newData;
            next = null;
            random = null;
        }
        public RandomListNode (int newData, RandomListNode newNext, RandomListNode newRandom){
            data=newData;
            next = newNext;
            random = newRandom;
        }

    }

    RandomListNode copyLinkedList(RandomListNode head){
        RandomListNode iter = head;
        RandomListNode next;
        while (iter!=null){
            next = iter.next;
            RandomListNode copy = new RandomListNode(iter.data);
            iter.next = copy;
            copy.next = next;
            iter = copy;
        }



        return iter ;
    }

    public static void main(String[] args) {
        DeepCopyLinkedList dc = new DeepCopyLinkedList();
        RandomListNode first = new RandomListNode(1);
        RandomListNode second = new RandomListNode(2);
        RandomListNode third = new RandomListNode(3);
        RandomListNode forth = new RandomListNode(4);
        RandomListNode fifth = new RandomListNode(5);

        first.next = second;
        first.random = third;

        second.next = third;
        second.random = first;

        third.next=forth;
        third.random = fifth;

        forth.next = fifth;
        forth.random = third;

        fifth.random = forth;

        dc.copyLinkedList(first);



    }
}
