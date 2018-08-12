import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneNumber {

    List<String> letterCombinations(String digits){
        String[] numbers = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        char[] c = digits.toCharArray();
        if (digits.length()==0){
            return ans;
        }
            ans.add("");
            for (int i=0; i<digits.length(); i++){
                ans=(calculate(String.valueOf(numbers[digits.charAt(i)-'0']),ans));
            }
//        Collections.sort(ans);
        return ans;
    }

    List<String> calculate (String digit, List<String> l){
        List<String> list = new ArrayList<>();

        for (int i=0; i<digit.length();i++){
            for (String x: l){
                list.add(x+(String.valueOf(digit.charAt(i))));
            }
        }
        return list;

    }

    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber();
        pn.letterCombinations("23");

    }
}
