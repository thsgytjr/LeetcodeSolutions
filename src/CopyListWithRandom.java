public class CopyListWithRandom {
    CopyListWithRandom next;
    CopyListWithRandom random;
    int data;
    CopyListWithRandom(int newData){
        data=newData;
        random = null;
        next = null;
    }
    CopyListWithRandom(int newData, CopyListWithRandom newNext, CopyListWithRandom newRandom){
        data=newData;
        random = newRandom;
        next = newNext;
    }

    public static void main(String[] args) {
        CopyListWithRandom cl1 = new CopyListWithRandom(1);
        CopyListWithRandom cl2 = new CopyListWithRandom(2);
        CopyListWithRandom cl3 = new CopyListWithRandom(3);

        cl1.next = cl2;
        cl1.random = cl3;
        cl2.next = cl3;
        cl2.random = cl1;
        cl3.next=null;
        cl3.random=cl2;

        CopyListWithRandom clone = new CopyListWithRandom(0);
        CopyListWithRandom p = clone;
//       while (p!=null){
//           p.next = cl1;
//           cl1 = cl1.next;
//           p = p.next;
//       }
        String str = "hi";
       StringBuilder sb = new StringBuilder(Integer.toString(10));
        System.out.println(sb.toString());



    }
}
