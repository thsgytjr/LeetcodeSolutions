public class RepeatedStringMatch {
    int repeatedStringMatch(String A, String B){
        StringBuilder match = new StringBuilder("");
        for (int i=0; i<=B.length()/A.length()+2;i++){
            match.append(A);
            if (match.toString().contains(B)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] A = new String[]{"a"};
        String[] B = new String[]{"aa"};

        RepeatedStringMatch rs = new RepeatedStringMatch();
        rs.repeatedStringMatch("abc","cabcabca");
    }
}
