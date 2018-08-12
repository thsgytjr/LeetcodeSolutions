public class RotateArray {

    void rotate(int[] nums, int k){
        int[] result = new int[nums.length];
        for (int i=0; i<k; i++){
            result[i] = nums[nums.length-1];

        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        RotateArray ra = new RotateArray();
//        System.out.println(ra.rotate(array,3));

    }
}
