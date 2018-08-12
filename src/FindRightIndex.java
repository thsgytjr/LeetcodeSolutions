public class FindRightIndex {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i=0; i<nums.length; i++){
            if (target==0){
                index = 0;
            }
            else if (nums[i]>=target){
                index=i;
                break;
            }else if (i==nums.length-1){
                index = i+1;
            }else{
                index = i;
            }

        }
        return index;

    }
    public static void main(String[] args) {
        FindRightIndex fri = new FindRightIndex();
        int[] arr = new int[]{1,3,5,6};
        System.out.println(fri.searchInsert(arr,5));
    }
}
