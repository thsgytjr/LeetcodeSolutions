import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicateInArray {

    List<Integer> findDuplicates(int[] arr){
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++){
            if (i==arr.length-1){
                break;
            }else{
                if (arr[i]==arr[i+1]){
                    result.add(arr[i]);
                }
            }
        }
        return result;
    }


    public static void MakeTheNumbersMatch(int a, int b, int x, int y)
    {
        while(a!=x || b!=y)
        {
            if(a>x) {
                a--;
            }else if (a==x) {
            }
            else{
                a++;
            }

            if(b>y) {
                b--;
            }else if (b==y) {

            }else {
                b++;
            }
            }
        }

    public static void main(String[] args) {
        FindAllDuplicateInArray fd = new FindAllDuplicateInArray();
        int[] array = new int[]{4,3,2,7,8,2,3,1};
//        System.out.println(fd.findDuplicates(array));
        fd.MakeTheNumbersMatch(10,8,7,10);

    }
}
