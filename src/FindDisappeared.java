import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums){
        int missingNumbers;
        HashSet hs = new HashSet();
        List<Integer> ans = new ArrayList<>();
        int counter=0;
        for (int i=0; i<nums.length;i++){
            hs.add(nums[i]);
        }
        missingNumbers = nums.length-hs.size();
        for (int i=1; i<=nums.length;i++){
            if (counter==missingNumbers){
                break;
            }
            if (!hs.contains(i)){
                ans.add(i);
                counter++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        FindDisappeared fd = new FindDisappeared();
        fd.findDisappearedNumbers(arr);

    }
}
