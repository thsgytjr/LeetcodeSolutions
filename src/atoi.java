import java.math.BigInteger;

public class atoi {

    int stringToInteger(String str){
        StringBuilder sb = new StringBuilder();
        boolean prefix = false;
        if (str.length()==0){
            return 0;
        }
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)>=48&&str.charAt(i)<=57||str.charAt(i)==45){
                if (prefix==false&&str.charAt(i)==45){
                    if (str.length()>i+1&&str.charAt(i+1)>=48&&str.charAt(i+1)<=57) {
                        sb.insert(0, str.charAt(i));
                        prefix = true;
                        continue;
                    }
                }
                if (str.charAt(i)>=48&&str.charAt(i)<=57){
                    sb.append(str.charAt(i)-'0');
                    prefix=true;
                    if (str.length()-1>i+1){
                        if (str.charAt(i+1)<48 || str.charAt(i+1)>58){
                            break;
                        }
                    }


                }
            }
        }
        if (sb.toString().equals("")){
            return 0;
        }
        if (sb.length()>11&&sb.charAt(0)=='-'){
            return -2147483647;
        }
        if (sb.length()>11){
            return 2147483647;
        }

        if (sb.length()<9||Long.valueOf(sb.toString())>2147483647){
            return 2147483647;
        }
        if (sb.length()<9||Long.valueOf(sb.toString())<-2147483647){
            return -2147483647;
        }

        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        atoi a = new atoi();
        String str ="42";
        a.stringToInteger(str);
    }
}
