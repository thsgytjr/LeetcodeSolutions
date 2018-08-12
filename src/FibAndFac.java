import java.util.LinkedList;
import java.util.Queue;

public class FibAndFac {
    static int fib(int n){
        // 1 , 1, 2, 3, 5, 8
        if (n<0){
            return 0;
        }
        else if (n ==1 || n==2){
            return 1;
        }else{
            return fib(n-2)+fib(n-1);
        }
    }

    static int fac(int n){
        if (n <= 1){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.remove());
    }
}








