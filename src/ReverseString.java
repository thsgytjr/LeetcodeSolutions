
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    String reverseString(String s){
//        String[] arr = s.split("\\s+");
//        List<String> items = Arrays.asList(s.split("\\s+"));
//        Collections.reverse(items);
//        StringBuilder sb = new StringBuilder();
//        if (items.size()==0){
//            return "";
//        }
//        for(int i=0; i<items.size()-1;i++){
//            if (i+1<=items.size()-1&&items.get(i+1).equals("")){
//                sb.append(items.get(i));
//                break;
//            }
//            sb.append(items.get(i)+" ");
//        }
//        sb.append(items.get(items.size()-1));
//
//        return sb.toString();


        List<String> items = Arrays.asList(s.split("\\s+"));
        StringBuilder sb = new StringBuilder();
        if (items.size()==0) return "";
        for (int i=items.size()-1; i>=0; i--){
            if (i==items.size()-1){
                sb.append(items.get(i));
                continue;
            }
            if (!items.get(i).equals("")) {
                sb.append(" " + items.get(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverseString("the sky is blue");

    }
}
