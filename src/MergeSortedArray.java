import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int[] result = new int[m+n];
        for (int i=0; i<m;i++){
            result[i] = nums1[i];
        }
        for (int i=0; i<n;i++){
            result[m]=nums2[i];
            m++;
        }
        Arrays.sort(result);
        for(int i=0; i<result.length;i++){
            nums1[i]=result[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2};
        MergeSortedArray msa =new MergeSortedArray();
        msa.merge(nums1,3,nums2,1);

    }
}
