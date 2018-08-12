public class CommonPrefix {

    String common(String[] strs){
        if (strs.length==0)return "";
        String common = strs[0];
        for (int i=1; i<strs.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<common.length(); j++){
                if (strs[i].length()==j){
                    break;
                }
                if (strs[i].charAt(j)!=common.charAt(j)){
                    break;
                }
                sb.append(strs[i].charAt(j));
            }
            common = sb.toString();
        }
        return common;
    }

    public static void main(String[] args) {
        String[] arr  = new String[]{"Finger","Finger","Fingers","Fingers"};
        CommonPrefix cp = new CommonPrefix();
        System.out.println(cp.common(arr));
    }
}
