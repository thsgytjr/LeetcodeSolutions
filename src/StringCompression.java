import java.util.HashMap;

public class StringCompression {

    int compress(char[] chars){
        HashMap<Character, Integer> hm = new HashMap();
        int result = 0;
        for (int i=0; i<=chars.length-1; i++){
            if (!hm.containsKey(chars[i])){
                hm.put(chars[i],1);
            }else{
                hm.put(chars[i],hm.get(chars[i])+1);
            }
        }
        for (Object value : hm.values()) {
            if (value.equals(1)){
                result++;
            }
        }
        if (result==0){
            return hm.size()*2;
        }
        return hm.size()*2 - result;
    }
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] arr = new char[]{'a','a','b','b','c','c','c'};
        sc.compress(arr);
    }
}
