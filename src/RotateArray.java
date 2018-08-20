public class RotateArray {

    void rotate(int[] nums, int k){
        k = k%nums.length;
//        if (k==0) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    void reverse(int[]nums, int start, int end){
        int temp;
        for (int i=start; i<=end;i++){
            temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        RotateArray ra = new RotateArray();
        ra.rotate(array,2147483646);
    }
}
