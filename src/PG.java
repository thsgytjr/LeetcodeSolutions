import java.util.ArrayList;
import java.util.List;

public class PG {

    int fib (int num){
        //1,1,2,3,5,8
        int f = 1;
        int b = 1;
        int ans = 0;
        if (num <= 2){
            return 1;
        }
        for (int i=3; i<=num; i++){
            ans = f+b;
            f = b;
            b= ans;
        }
        return ans;
    }

    int fac (int num){//n * (n-1)
        int ans = 1;
        for (int i=1; i<=num; i++){
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        PG p = new PG();
        System.out.println(p.fac(30)); //5,4,3,2,1

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        result.add(list);
        System.out.println(result);
    }
}
