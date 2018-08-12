import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidPalindrome {

    boolean isPalindrome(String s){
        String convert = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        char[] ch = convert.toCharArray();
        int counter=0;
        for (int i=ch.length-1; i>0;i--){
            if (ch[i]!=convert.charAt(counter)){
                return false;
            }
            counter++;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String s = "raceacar";
        vp.isPalindrome(s);
    }
}
