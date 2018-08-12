import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class PlusOne {

    int[] plusOne(int[]digits){
        boolean newArray = true;
        BigInteger total = new BigInteger("0");
        long multiplier = (long)(Math.pow(10,digits.length-1));
        String totalString ="";
        int[] result1 = new int[digits.length];
        int[] result2 = new int[digits.length+1];

        for (int i=0; i<digits.length; i++){
//            total = total+digits[i]*multiplier;
            multiplier= multiplier/10;
            if (digits[i]==9&&newArray){
                newArray = true;
            }else{
                newArray = false;

            }
        }
        total=total.add(BigInteger.ONE);
        totalString =total.toString();
        if (newArray){
            for (int i=0; i<result2.length; i++){
                result2[i] = Integer.valueOf(totalString.charAt(i)-'0');
            }
            return  result2;
        }else{
            for (int i=0; i<result1.length; i++){
                result1[i] = Integer.valueOf(totalString.charAt(i)-'0');
            }
            return result1;
        }
    }

    int[] plusOneSimple(int[] digits){
        int arraySize = digits.length;
        boolean allNines = IntStream.of(digits).sum()/digits.length==9;
        int carry = 0;
        if (allNines){
            arraySize = arraySize+1;
            int[] result = new int[arraySize];
            result[0]= 1;
            return result;
        }
        int[] result = new int[arraySize];
        for (int i=arraySize-1; i>=0; i--){
            if (i==arraySize-1){
                if (digits[i]+1==10){
                    carry = 1;
                    result[i] = 0;
                }else{
                    result[i] = digits[i]+1;
                }
            }else if (digits[i]+carry==10){
                carry = 1;
                digits[i] = 0;
            }else{
                result[i] = carry+digits[i];
                carry=0;
            }
        }
        return result;
    }

    int[] proSol (int[] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,9,9};
        PlusOne po = new PlusOne();
//        System.out.println(po.proSol(arr));
        double a = 11;
        double b = 2;
        String c = "23";
        System.out.println(a/b);

//        System.out.println(b);
    }
}
