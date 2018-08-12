public class DivideTwoNumbers {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        int result =0;

        if (num2==0){
             return;
        }
        for (int i=num2; num2<=num1; num2 +=i){
            result += 1;
        }
        System.out.println(result);
    }
}
