public class LongestPalindromicSubstring {

    String longestPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        int match=0;
        int pointer=0;
        int max=0;

        for(int i=s.length()-1;i>=0; i--){
            if (s.charAt(i)==s.charAt(pointer)){
                match++;
                sb.append(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {

    }
}
