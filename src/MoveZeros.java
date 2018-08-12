import java.util.Arrays;
import java.util.List;

public class MoveZeros {

     public static void Solution(int[] nums) {
         for (int i=0; i<nums.length;i++){
             if(nums[i]==0){
                 for (int j=i+1; j<nums.length;j++){
                     if(nums[j]!=0){
                         nums[i]=nums[j];
                         nums[j]=0;
                         break;
                     }
                 }
             }
         }
//         if (nums == null || nums.length == 0) return;
//
//         int insertPos = 0;
//         for (int num: nums) {
//             if (num != 0){
//                 nums[insertPos++] = num;
//             }
//         }
//
//         while (insertPos < nums.length) {
//             nums[insertPos++] = 0;
//         }
//         0,0,0,1,0,3,12


//        Arrays.sort(nums);
//        int zeros = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                zeros++;
//                count += 1;
//            } else if (nums[i]!=0) {
//                continue;
//            }
//        }
//
//        for (int j = 0; j < nums.length - count; j++) {
//            if (zeros == 0) {
//                break;
//            }
//            nums[j] = nums[zeros];
//            nums[zeros] = 0;
//            zeros++;
//        }
//        for (int i=0; i<nums.length;i++){
//            System.out.print(nums[i]);
//        }
    }

    // [0,0,1,2,3]

    // [1,0,0,2,3]   //num[0] = num[2] zeros=2
                     //num[zeros] = 0

    // [1,2,0,0,3]   //num[1] = num[3] zeros=2+1
                    //num[zeros]=0

    // [1,2,3,0,0]  num [2] = num[4] zeros 3+1;
                    //num[zeros]= 0;

        //num[0] = num[zeros]
        //num[zeros] = 0

//        int zeroIndex = 0;
//
//        for(int i=0; i<nums.length;i++){
//            if (nums[i]==0){
//                for (int j= nums.length-1; j>0; j--){
//                    if (nums[i]!=0){
//                        nums[i]
//                    }
//                }
//            }
//        }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,4};
        MoveZeros mz= new MoveZeros();
//        int[] result = mz.Solution(arr);
        Solution(arr);
    }
}
