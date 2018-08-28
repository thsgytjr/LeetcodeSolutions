import java.util.*;
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

    List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int number1 = nums[0], number2 = nums[0], count1 = 0, count2 = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == number1)
                count1++;
            else if (nums[i] == number2)
                count2++;
            else if (count1 == 0) {
                number1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                number2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == number1)
                count1++;
            else if (nums[i] == number2)
                count2++;
        }
        if (count1 > len / 3)
            result.add(number1);
        if (count2 > len / 3)
            result.add(number2);
        return result;
    }


    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] arr = new int[]{3,2,3};
        System.out.println(me.majorityElement(arr));



    }


}
