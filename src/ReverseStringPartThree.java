public class ReverseStringPartThree {
    public String reverseWords(String s) {
        char[] c = s.replaceAll(" ","").toCharArray();

//        for (int i=0; i<=strArr.length-1; i++){
//            for (int j=0; j<=strArr[i].length(); j++){
//
//            }
//        }
        return s;
    }

    String reverse(String str , int end){
        char temp;
        for (int i=0; i<end; i++){
            temp = str.charAt(i);
//            str.charAt(end)= temp;
            end--;
        }
        return str;
    }

    public static void main(String[] args) {
        ReverseStringPartThree rs = new ReverseStringPartThree();
        rs.reverseWords("how are you");
    }
}
