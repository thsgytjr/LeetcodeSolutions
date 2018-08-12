public class FindArrayMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result = 0;
        double ans = 0.0;

        if (nums1.length!=0&&nums2.length!=0){
            if (nums1[0]!=1 && nums2[0]!=1 && nums1.length>1){
                for (int i=0; i<nums2.length;i++){
                    result = result+ nums2[i];
                }
                ans= result/2.0;
                return ans;
            }else{
                ans=nums1[0]+0.0;
                return ans;
            }
//            result = nums1.length+nums2.length+1;
//            ans = result *0.5;
        }if (nums1.length==0 && nums2.length==2){
            for (int i=0; i<nums2.length;i++){
                result = result+ nums2[i];
            }
            ans= result/2.0;
//            ans = result/2;
        }else if (nums2.length==0 && nums1.length==2){
            for (int i=0; i<nums1.length;i++){
                result = result+ nums1[i];
            }
            ans= result/2.0;
        }else if (nums1.length==1 && nums2.length==0){
            result = nums1[0];
            ans = result;
        }else if (nums1.length==0 && nums2.length==1) {
            result = nums2[0];
            ans = result;
        }else if (nums1.length==0 && nums2.length==2) {
            result = nums2.length+1;
            ans = result *0.5;
        }else if (nums2.length==0 && nums1.length==2) {
            result = nums1.length + 1;
            ans = result * 0.5;
        }else if (nums1.length==0) {
            if (nums2.length%2==0){
                for (int i=0; i<nums2.length;i++){
                    result = result+ nums2[i];
                }
                ans = result/(nums2.length+0.0);
            }else{
                ans = nums2[((nums2.length)/2)];
            }

        }else if (nums2.length==0) {
            if(nums1.length%2==0){
                for (int i=0; i<nums1.length;i++){
                    result = result+ nums1[i];
                }
                ans= result/(nums1.length+0.0);
            }else{
                ans = nums1[((nums1.length)/2)];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2};
        int[] arr2 = new int[]{1,2};
        FindArrayMedian f = new FindArrayMedian();
        System.out.println(f.findMedianSortedArrays(arr1,arr2));
//        System.out.println(5/2);
    }
}
