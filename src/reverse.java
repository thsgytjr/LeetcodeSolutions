public class reverse {

    String r(String word){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<word.length();i++){
            //hello -> olleh
            sb.append(word.charAt(word.length()-1-i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        reverse rv = new reverse();
        System.out.println(rv.r("hello"));
    }
}
