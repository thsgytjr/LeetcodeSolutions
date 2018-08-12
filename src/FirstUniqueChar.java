import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        if (s.length()==1) return 0;
        int index = -1;
        for (int i=0; i<s.length();i++){
            if (index==-1) {
                for (int j = 0; j < s.length(); j++) {
                    if (j == i) {
                        continue;
                    }
                    if (s.charAt(i) == s.charAt(j)) {
                        index = -1;
                        break;
                    }
                    index = i;
                }
            }else{
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        FirstUniqueChar fc = new FirstUniqueChar();
        fc.firstUniqChar("");


    }
}
