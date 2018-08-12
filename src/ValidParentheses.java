import java.util.Stack;

public class ValidParentheses {

    boolean isValidParentheses(String s){
        if (s.length()==0) return true;
        if (s.length()%2!=0) return false;
        boolean isValid = false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if (stack.empty()){
                isValid= false;
            }
            else if (s.charAt(i)==')'){
                if (stack.pop().equals('(')){
                    isValid= true;
                }else{
                    return false;
                }
            }else if (s.charAt(i)=='}'){
                if (stack.pop().equals('{')){
                    isValid= true;
                }else{
                    return false;
                }
            }else if (s.charAt(i)==']'){
                if (stack.pop().equals('[')){
                    isValid= true;
                }else{
                    return false;
                }
            }else{
                isValid= false;
            }
        }
        if (!stack.empty()){
            return false;
        }
        return isValid;
//        for (char c : s.toCharArray()) {
//            if (c == '(')
//                stack.push(')');
//            else if (c == '{')
//                stack.push('}');
//            else if (c == '[')
//                stack.push(']');
//            else if (stack.isEmpty() || stack.pop()!=c)
//                return false;
//        }
//        return stack.isEmpty();
    }


    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValidParentheses("(()("));
    }
}
