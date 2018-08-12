import java.util.HashSet;

public class CompareNumbers{
    void compare(int[]numbers){

        HashSet hs = new HashSet();
        for (int i=0; i<numbers.length;i++){
            if (!hs.contains(numbers[i])){
                hs.add(numbers[i]);
            }
        }
        for(Object k: hs){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{1,1,1,1,1,1,5,6,8,7,9,5,10};
        CompareNumbers cn = new CompareNumbers();
        cn.compare(numbers);
    }
}
