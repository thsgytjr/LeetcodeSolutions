import java.util.HashSet;
import java.util.Hashtable;

public class JewelsStones {
//    public int numJewelsInStones(String J, String S) {
////        String[] jewels = J.split("(?!^)");
////        String[] stones = S.split("(?!^)");
//        int count=0;
//        for (int i=0; i< J.length();i++){
//            for(int j=0; j<S.length();j++){
//                if (J.charAt(i)==S.charAt(j)){
//                    count = count+1;
//                }
//            }
//        }
//        return count;
//    }
    int numJewelsInStones(String J, String S){
        HashSet hs = new HashSet();
        for (int i=0; i<J.length(); i++){
            hs.add(J.charAt(i));
        }
        int count = 0;
        for (int j=0; j<S.length(); j++){
            if (hs.contains(S.charAt(j))){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        JewelsStones js = new JewelsStones();
        js.numJewelsInStones("z","ZZ");
    }
}
