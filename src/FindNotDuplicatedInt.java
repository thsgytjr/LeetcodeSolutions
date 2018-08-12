import java.util.*;

public class FindNotDuplicatedInt {

    int singleNumber(int[] nums) {
//        Hashtable<Integer, Integer> ht = new Hashtable<>();
//        int result=0; //4 1 2
//        for (int i = 0; i < nums.length; i++) {  //4,1,2,1,2
//            int key = nums[i];
//            if (ht.get(key)==null){
//                ht.put(key,1);
//            }else{
//                int value = ht.get(key).intValue();
//                value++;
//                ht.put(key,value);
//            }
//        }
//        for(Map.Entry entry: ht.entrySet()){
//            if ((Integer)entry.getValue()==1){
//                result = (Integer)entry.getKey();
//            }
//        }
//
//        return result;
       int result = 0;
       for (int i=0; i<nums.length;i++){
           result = result^nums[i];
       }
       return result;
    }

    public static void main(String[] args) {
        FindNotDuplicatedInt f = new FindNotDuplicatedInt();
        int[] arr = new int[]{2,1,3,2,3};
        System.out.println(f.singleNumber(arr));
//        System.out.println(0%1);
    }
}
