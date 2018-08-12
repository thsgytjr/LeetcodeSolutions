import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i=0; i<n; i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0};
        int[] nums2 = new int[]{2};
        MergeSortedArray msa =new MergeSortedArray();
        msa.merge(nums1,3,nums2,1);

    }
}
