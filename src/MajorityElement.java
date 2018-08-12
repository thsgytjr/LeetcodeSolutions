import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MajorityElement {

    int me (int[] nums){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int value=0;
        for (int i=0; i<nums.length;i++){

            if (i==nums.length-1){
                if (nums[i]==nums[i-1]){
                    value++;
                    tm.put(value,nums[i]);
                }else{
                    value = 1;
                    tm.put(value,nums[i]);
                }
                break;
            }
            if (i==0){
                value++;
                tm.put(value,nums[i]);
                continue;
            }
            if (nums[i]<=nums[i+1]&&nums[i]==nums[i-1]){
                value++;
                tm.put(value,nums[i]);
            }else if (nums[i]!=nums[i-1]){
                value = 1;
            }

            tm.put(value,nums[i]);
        }
        return tm.get(tm.lastKey()) ;
//        if(nums == null || nums.length == 0) {
//            return 0;
//        }
//        int count = 0, majorityElement = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(count == 0) {
//                majorityElement = nums[i];
//                count++;
//            }else if(nums[i] == majorityElement) {
//                count++;
//            }else {
//                count--;
//            }
//        }
//        return majorityElement;
    }


    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] arr = new int[]{1,2,1,2,2};
        System.out.println(me.me(arr));



    }


}
