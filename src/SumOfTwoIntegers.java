import java.math.BigInteger;
import java.util.ArrayList;

public class SumOfTwoIntegers {

    int sum(int a, int b) {

        BigInteger bigInteger=new BigInteger(String.valueOf(a));
        BigInteger bigInteger2=new BigInteger(String.valueOf(b));

        bigInteger=bigInteger.add(bigInteger2);

        int n=Integer.valueOf(bigInteger.toString());

        return n;
//        ArrayList list = new ArrayList();
//        boolean negativeIntA = false;
//        boolean negativeIntB = false;
//
//        if (a < 0) {
//            negativeIntA = true;
//        }
//        if (b < 0) {
//            negativeIntB = true;
//        }
//        if (a!=0 && b!=0) {
//
//            if (negativeIntA == false && negativeIntB == false) {
//                for (int i = 0; i < a; i++) { //1
//                    list.add(i);
//                }
//                for (int j = 0; j < b; j++) { //2
//                    list.add(j);
//                }
//                return list.size();
//            } else if (negativeIntA == true && negativeIntB == true) {
//                for (int i = 0; i < Math.abs(a); i++) { //-1
//                    list.add(i);
//                }
//                for (int j = 0; j < Math.abs(b); j++) { //-2
//                    list.add(j);
//                }
//                return list.size() * -1;
//            } else if (negativeIntA == true && negativeIntB == false) {
//                a = a * -1;
//                for (int j = 0; j < Math.abs(b); j++) { //2
//                    list.add(j);
//                }
//                for (int i = a - 1; i >= 0; i--) { //-1
//                    list.remove(i);
//                }
//                return list.size();
//            } else if (negativeIntA == false && negativeIntB == true) {
//                b = b * -1;
//                for (int i = 0; i < Math.abs(a); i++) { //-1
//                    list.add(i);
//                }
//                for (int j = b - 1; j >= 0; j--) { //2
//                    list.remove(j);
//                }
//                return list.size();
//            }
//        }else if (a==0 && b==0){
//            return 0;
//        }else if (a==0 && b!=0){
//            if (negativeIntB==true){
//                b = b * -1;
//                for (int j = 0; j < b; j++) { //2
//                    list.add(j);
//                }
//                return list.size()*-1;
//            }else{
//                for (int j = 0; j < b; j++) { //2
//                    list.add(j);
//                }
//                return list.size();
//            }
//        }else if (a!=0 && b==0){
//            if (negativeIntA==true){
//                a= a*-1;
//                for (int i = 0; i < a; i++) { //-1
//                    list.add(i);
//                }
//                return list.size()*-1;
//            }else{
//                for (int i = 0; i < a; i++) { //-1
//                    list.add(i);
//                }
//                return list.size();
//            }
//        }
//        return 0;
    }
    public static void main(String[] args) {
        SumOfTwoIntegers s = new SumOfTwoIntegers();
        System.out.println(s.sum(1,-9));

    }
}
