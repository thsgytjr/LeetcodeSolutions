import java.util.HashSet;

public class UniqueMorseCode {

    int uniqueMorse(String[] words){
        String [] array = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet hs = new HashSet();
        for (int i=0; i<words.length;i++){
            String s = new String();
            for (int j = 0; j<words[i].length();j++){
                s += array[(int)words[i].charAt(j)-97];
            }
            hs.add(s);
        }
        return hs.size();
    }


    public static void main(String[] args) {
        UniqueMorseCode morse = new UniqueMorseCode();
        String[] arr = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(morse.uniqueMorse(arr));

    }
}
