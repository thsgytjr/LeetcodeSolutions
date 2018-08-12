import java.util.*;

public class ReverseVowels {
    String reverseVowels(String s){
        StringBuilder sb = new StringBuilder(s);
        Character temp;
        int right = s.length()-1;
        for (int i=0;i<right;i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U'){
                for (int j=right; j>i; j--){
                    if (s.charAt(j)=='a'||s.charAt(j)=='A'||s.charAt(j)=='e'||s.charAt(j)=='E'||s.charAt(j)=='i'||s.charAt(j)=='I'||s.charAt(j)=='o'||s.charAt(j)=='O'||s.charAt(j)=='u'||s.charAt(j)=='U'){
                        temp = s.charAt(j);
                        sb.setCharAt(j,s.charAt(i));
                        sb.setCharAt(i,temp);
                        right = j-1;
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        rv.reverseVowels("aA");
    }
}
