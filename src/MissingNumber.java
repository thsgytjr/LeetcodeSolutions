public class MissingNumber {

    int missingNumber(int[] nums){
        int range = nums.length;
        int com = 0;
        for(int i=0; i<nums.length; i++){
            range = range ^ i;
            com ^= nums[i];
        }
        return com-range;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        MissingNumber mn = new MissingNumber();
        mn.missingNumber(arr);
    }
}
