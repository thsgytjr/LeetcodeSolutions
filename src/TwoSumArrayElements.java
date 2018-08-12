import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArrayElements {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (hm.containsKey(pair)) {
                int[] result = {hm.get(pair), i};
                return result;
            }
            hm.put(nums[i],i);
            int[] aa = new int[]{1,4,2,4};
            Arrays.sort(aa);
            nums = aa;

        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        TwoSumArrayElements ts = new TwoSumArrayElements();
        ts.twoSum(arr,9);
    }
}
