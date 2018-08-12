import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class AnagramMappings {

   public int[] anagramMappings(int[] A, int[] B){
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        int[] result = new int[A.length];
        for (int i=0 ;i<B.length; i++){
            ht.put(B[i],i);
        }
        for (int i=0; i<A.length;i++){
            result[i] = ht.get(A[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{12,28,46,32,50};
        int[] B = new int[]{50,12,32,46,28};
        AnagramMappings am = new AnagramMappings();
        am.anagramMappings(A,B);

    }
}
