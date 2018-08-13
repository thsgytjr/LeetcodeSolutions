import java.util.HashMap;

public class UniqueCharacter {
    boolean uniqueChar(String word){
        word = word.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i=0; i<word.length(); i++){
            if (hm.containsKey(word.charAt(i))==false){
                hm.put(word.charAt(i),1);
            }
            else{
                hm.put(word.charAt(i),hm.get(word.charAt(i)+1));
            }
        }
        if (hm.containsValue(1)){
            return true;
        }
        return false;
    }

    boolean uniqueCharNoDs(String word){
        boolean uniqueValue = false;
        for (int i=0; i<word.length(); i++){
            for (int j=0; j<word.length();j++){
                if (j==i){
                    continue;
                }
                if (word.charAt(i)!=word.charAt(j)){
                    uniqueValue = true;
                }else{
                    uniqueValue = false;
                    break;
                }
            }
            if (uniqueValue){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        UniqueCharacter uc = new UniqueCharacter();
        System.out.println(uc.uniqueCharNoDs("mtoto"));
    }
}
