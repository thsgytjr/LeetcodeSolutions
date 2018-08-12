public class BinarySearch {

    boolean bsRecursive (int[] array ,int x, int left, int right){

        if (left>right){
            return false;
        }
        int mid = (left+right)/2;
        if (array[mid]==x){
            return true;
        }else if (array[mid]>x){
            return bsRecursive(array,x, left, mid-1);
        }else{
            return bsRecursive(array,x, mid+1, right);
        }

    }

    boolean bsRecursive (int[] array, int x){
        return bsRecursive(array,x,0,array.length-1);
    }

    boolean bsIterative(int[]array,int x){
        int left = 0;
        int right = array.length-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (array[mid]==x){
                return true;
            }else if (array[mid]>x){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1,2,3,4,5,10,20,30,35,60,70};
//        System.out.println(bs.bsRecursive(arr,10));
        System.out.println(bs.bsIterative(arr,70));
    }
}
