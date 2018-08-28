import java.util.HashSet;
import java.util.Set;

public class LongestSubsting {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> hs = new HashSet();
        for (int i=0; i<=s.length()-1; i++){
            if (!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                longest = Math.max(longest,hs.size());
            }
            else{
                hs.remove(s.charAt(i));
                i = i+1;
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        LongestSubsting ls = new LongestSubsting();
        ls.lengthOfLongestSubstring("pwwkew");
    }
}
