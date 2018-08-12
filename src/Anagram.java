public class Anagram {

    boolean isAnagram(String s, String t){
        int sTimesInt = 1;
        int tTimesInt = 1;
        int sPlusInt = 0;
        int tPlusInt = 0;
        if (s.length()!=t.length()){
            return false;
        }else{
            for (int i=0; i<s.length();i++){
                sTimesInt*=s.charAt(i);
                sPlusInt +=s.charAt(i);
                tTimesInt*=t.charAt(i);
                tPlusInt+=t.charAt(i);
            }
            if (sTimesInt==tTimesInt && sPlusInt==tPlusInt){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        String s = "nl";
        String t = "cx";
        Anagram a = new Anagram();
        System.out.println(a.isAnagram(s,t));

    }
}
