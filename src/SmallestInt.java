import java.util.Arrays;
import java.util.HashSet;

public class SmallestInt {

    int smallest(int[]A){
//        Arrays.sort(A);
        int result=0;
        HashSet hs = new HashSet();
        for (int i=0; i<A.length;i++){
            hs.add(A[i]);
        }
        for (int i=1; i<=A.length;i++){
            if (!hs.contains(i)){
                result = i;
                break;
            }else if (i==A.length){
                result = A.length+1;
            }else{
                result=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3};  // [1,1,2,3,4,6] {1,2,3,4,6}
        SmallestInt s = new SmallestInt();
        System.out.println(s.smallest(numbers));

    }
}
